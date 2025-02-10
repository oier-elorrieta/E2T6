package test.DAOak;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AgentziaTest {

	private static Connection connection;

    @BeforeClass
    public static void setUpDatabase() throws Exception {
        // Habilitar modo prueba en Conexioa
        controlador.Conexioa.enableTestMode();
        connection =  controlador.Conexioa.obtenerConexion();

        try (Statement stmt = connection.createStatement()) {
            // Crear tabla simulada
            stmt.execute("Create Table Agentzia_Mota (" +
            			 "Kod varchar(2) primary key, " +
            			 "Mota varchar(30) not null);" +
            			 
            			 "Create Table Langile_Kop (" +
            			 "Kod varchar(2) primary key, " +
            			 "Kopurua varchar(40) not null);" +
            		
            			 "CREATE TABLE agentzia (" +
                         "ID INT PRIMARY KEY AUTO_INCREMENT, " +
                         "Izena VARCHAR(30), " +
                         "Logoa VARCHAR(100), " +
                         "Markaren_Kolore VARCHAR(6), " +
                         "Erabiltzailea VARCHAR(30), " +
                         "Pasahitza VARCHAR(30), " +
                         "Kod_Mota VARCHAR(2), " +
                         "Langile_Kop VARCHAR(2), " +
                         "foreign key (Kod_Mota) references Agentzia_Mota (Kod), " +
                         "foreign key (Langile_Kop) references Langile_Kop (Kod))");

            // Insertar datos de prueba
            stmt.execute("Insert INTO Agentzia_Mota (Kod, Mota) " + 
            			 "values ('TM', 'testMota');" +
            			 "Insert INTO Langile_Kop (Kod, Kopurua) " + 
            			 "values ('TL', 'testKopurua');" +
            			 "INSERT INTO agentzia (Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, Kod_Mota, Langile_Kop) " +
                         "VALUES ('Test Agentzia', 'logo.png', 'FFFFFF', 'testUser', 'testPass', 'TM', 'TL');");
        }
    }

    @Test
    public void testCargatuAgentziak() throws Exception {
        modelo.POJOak.Agentzia agentzia = modelo.DAOak.Agentzia.cargatuAgentziak("testUser");

        assertNotNull(agentzia);
        assertEquals("Test Agentzia", agentzia.getIzena());
        assertEquals("testUser", agentzia.getErabiltzailea());
        assertEquals("testMota", agentzia.getMota());
        assertEquals("testKopurua", agentzia.getLangileKop());
    }

    @Test
    public void testBilatuErabiltzailea() throws Exception {
        String result = modelo.DAOak.Agentzia.bilatuErabiltzailea("testUser");
        assertEquals("testUser", result);
    }

    @Test
    public void testBilatuPasahitza() throws Exception {
        String result = modelo.DAOak.Agentzia.bilatuPasahitza("testUser");
        assertEquals("testPass", result);
    }

    @AfterClass
    public static void tearDownDatabase() throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("DROP TABLE agentzia");
        }
        connection.close();
    }

}
