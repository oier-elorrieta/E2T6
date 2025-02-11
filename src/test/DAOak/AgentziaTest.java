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
            // Insertar datos de prueba
            stmt.executeUpdate("Insert INTO Agentzia_Mota (Kod, Mota) " + 
            			 "values ('TM', 'testMota');");
            		
            stmt.executeUpdate("Insert INTO Langile_Kop (Kod, Kopurua) " + 
            			 "values ('TL', 'testKopurua');");
            			 
            stmt.executeUpdate("INSERT INTO agentzia (Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, Kod_Mota, Langile_Kop) " +
                         "VALUES ('Test Agentzia', 'logo.png', 'FFFFFF', 'testUser', 'testPass', 'TM', 'TL');");
        }
    }

    @Test
    public void testCargatuAgentziak() throws Exception {
        modelo.POJOak.Agentzia agentzia = modelo.DAOak.Agentzia.cargatuAgentziak("testUser");

        assertNotNull(agentzia);
        assertEquals("Test Agentzia", agentzia.getIzena());
        assertEquals("testUser", agentzia.getErabiltzailea());                                                                                                                                                                                                                                                                                                                                                                   
        assertEquals("logo.png", agentzia.getLogoa());
        assertEquals("testMota", agentzia.getMota());
        assertEquals("testKopurua", agentzia.getLangileKop());
    }
    
   @Test
    public void testAgentziaBerria() {
    	modelo.DAOak.Agentzia.agentziaBerria("Test Agentzia 2", "logo2.png", "FFFFFH", "testUser2", "testPass2", "TM", "TL");
    	
    	modelo.POJOak.Agentzia agentzia = modelo.DAOak.Agentzia.cargatuAgentziak("testUser2");
    	assertNotNull(agentzia);
        assertEquals("Test Agentzia 2", agentzia.getIzena());
        assertEquals("testUser2", agentzia.getErabiltzailea());
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
        	stmt.executeUpdate("delete from agentzia");
        	stmt.executeUpdate("delete from agentzia_mota");
        	stmt.executeUpdate("delete from langile_kop");
        }
        connection.close();
    }

}
