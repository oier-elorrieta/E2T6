package test.DAOak;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import modelo.DAOak.Bidaia;
import controlador.Conexioa;

public class BidaiaTest {
	 
	private static Connection connection;
	
	    @Before
	    public void setUpDataBase() throws SQLException {
	    	
	    	controlador.Conexioa.enableTestMode(); 
	        connection = controlador.Conexioa.obtenerConexion();
	    	
	        try (Statement stmt = connection.createStatement()) {
	            stmt.execute("Create Table Agentzia_Mota (" +
           			 		 "Kod varchar(2) primary key, " +
           			 		 "Mota varchar(30) not null);" +
           			 
           			 		 "Create Table Langile_Kop (" +
           			 		 "Kod varchar(2) primary key, " +
           			 		 "Kopurua varchar(40) not null);" +
           			 		 
           			 		 "Create Table Bidaia_Mota(" +
           			 		 "Kod varchar(2) primary key, " +
           			 		 "Mota varchar(60));" +
           			 		 
           			 		 "Create Table Herrialdea(" +
           			 		 "ID varchar(2) primary key, " +
           			 		 "Izena varchar(60));" +
	            		
	            			 "CREATE TABLE agentzia (" +
                        	 "ID INT PRIMARY KEY AUTO_INCREMENT, " +
                        	 "Izena VARCHAR(30), " +
                        	 "Logoa VARCHAR(200), " +
                        	 "Markaren_Kolore VARCHAR(6), " +
                        	 "Erabiltzailea VARCHAR(30), " +
                        	 "Pasahitza VARCHAR(30), " +
                        	 "Kod_Mota VARCHAR(2), " +
                        	 "Langile_Kop VARCHAR(2), " +
                        	 "foreign key (Kod_Mota) references Agentzia_Mota (Kod), " +
                        	 "foreign key (Langile_Kop) references Langile_Kop (Kod));" +
	            		
	            			 "CREATE TABLE Bidaiak (ID INT PRIMARY KEY AUTO_INCREMENT, Izena VARCHAR(30), Deskribapena VARCHAR(200), " +
	            			 "Data_Hasiera DATE, Data_Amaiera DATE, ID_Agentzia_Bidaia INT, ID_Herrialdeak varchar(2), Kod_Mota varchar(2));");
	            
	            			 
	            stmt.execute("Insert INTO Agentzia_Mota (Kod, Mota) " + 
            			 	 "values ('TM', 'testMota');" +
            			 	 "Insert INTO Langile_Kop (Kod, Kopurua) " + 
            			 	 "values ('TL', 'testKopurua');" +
            			 	 "INSERT INTO agentzia (Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, Kod_Mota, Langile_Kop) " +
                         	 "VALUES ('Test Agentzia', 'logo.png', 'FFFFFF', 'testUser', 'testPass', 'TM', 'TL');" +
	            		 
	            		 	 "INSERT INTO Herrialdea VALUES ('Eu', 'Euskadi');" +
	            			 "INSERT INTO Bidaia_Mota VALUES ('B1', 'BidaiMota');" +
	            			 "Insert Into Bidaiak Values (1, 'testBidaia', 'testDeskribapena', '1995-01-29', '1995-01-30', 1, 'Eu', 'B1')");
	        }
	    }
	    
	    @After
	    public void tearDown() throws SQLException {
	        try (Statement stmt = connection.createStatement()) {
	            stmt.execute("DROP TABLE Bidaiak");
	            stmt.execute("DROP TABLE Herrialdea");
	            stmt.execute("DROP TABLE Bidaia_Mota");
	        }
	        connection.close();
	    }
	    
	    @Test
	    public void testBidaiaBerria() throws SQLException {
	        Bidaia.bidaiaBerria("Viaje Prueba", "Descripción", Date.valueOf("2025-06-01"), Date.valueOf("2025-06-10"), 1, "1", "1");
	        
	        try (Statement stmt = connection.createStatement()) {
	            assertTrue(stmt.executeQuery("SELECT * FROM Bidaiak").next());
	        }
	    }
	    
	    @Test
	    public void testCargatuBidaiak() {
	        Bidaia.bidaiaBerria("Viaje Prueba", "Descripción", Date.valueOf("2025-06-01"), Date.valueOf("2025-06-10"), 1, "1", "1");
	        ArrayList<modelo.POJOak.Bidaia> bidaiak = Bidaia.cargatuBidaiak(1);
	        
	        assertEquals(1, bidaiak.size());
	        assertEquals("Viaje Prueba", bidaiak.get(0).getIzena());
	    }
	    
	    @Test
	    public void testEzabatuBidaiak() {
	        Bidaia.bidaiaBerria("Viaje Prueba", "Descripción", Date.valueOf("2025-06-01"), Date.valueOf("2025-06-10"), 1, "1", "1");
	        ArrayList<modelo.POJOak.Bidaia> bidaiak = Bidaia.cargatuBidaiak(1);
	        assertFalse(bidaiak.isEmpty());
	        
	        int id = bidaiak.get(0).getId();
	        Bidaia.EzabatuBidaiak(id);
	        
	        bidaiak = Bidaia.cargatuBidaiak(1);
	        assertTrue(bidaiak.isEmpty());
	    }
}
