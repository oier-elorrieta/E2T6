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
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import modelo.DAOak.Bidaia;

public class BidaiaTest {
	
	private static Connection connection;
	
	    @BeforeClass
	    public static void setUpDataBase() throws SQLException {
	    	
	    	controlador.Conexioa.enableTestMode(); 
	        connection = controlador.Conexioa.obtenerConexion();
	    	
	        try (Statement stmt = connection.createStatement()) {
	            	 
	            stmt.executeUpdate("Insert INTO Agentzia_Mota (Kod, Mota) " + 
            			 	 "values ('TM', 'testMota');");
	            		
				stmt.executeUpdate("Insert INTO Langile_Kop (Kod, Kopurua) " + 
            			 	 "values ('TL', 'testKopurua');");
            			 	 
				stmt.executeUpdate("INSERT INTO agentzia (ID, Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, Kod_Mota, Langile_Kop) " +
                         	 "VALUES (1, 'Test Agentzia', 'logo.png', 'FFFFFF', 'testUser', 'testPass', 'TM', 'TL');");
	            		 
				stmt.executeUpdate("INSERT INTO Herrialdea VALUES ('Eu', 'Euskadi');");
				
				stmt.executeUpdate("INSERT INTO Bidaia_Mota VALUES ('B1', 'BidaiMota');");
				
				stmt.executeUpdate("Insert Into Bidaiak Values (1, 'testBidaia', 'testDeskribapena', '1995-01-29', '1995-01-30', 1, 'Eu', 'B1')");
				
				stmt.executeUpdate("Insert Into Zerbitzuak values (1, 1)");
				
				stmt.executeUpdate("Insert Into Beste_Batzuk values (1, 'zerbitzuTest', '1995-01-29', 'testDeskribapena', 100)");
	        }
	    }
	    
	    @Test
	    public void testCargatuBidaiak() {
	        ArrayList<modelo.POJOak.Bidaia> bidaiak = Bidaia.cargatuBidaiak(1);
	        
	        assertEquals(1, bidaiak.get(0).getId());
	        assertEquals("testBidaia", bidaiak.get(0).getIzena());
	        assertEquals("testDeskribapena", bidaiak.get(0).getDeskirbapena());
	        assertEquals(java.sql.Date.valueOf("1995-01-29"), bidaiak.get(0).getBidaia_hasi());
	        assertEquals(java.sql.Date.valueOf("1995-01-30"), bidaiak.get(0).getBidaia_amaitu());
	        assertEquals("Euskadi", bidaiak.get(0).getHerrialdea());
	        assertEquals("BidaiMota", bidaiak.get(0).getMota());
	    }
	    
	    @Test
	    public void testBidaiaBerria() throws SQLException {
	    	modelo.DAOak.Bidaia.bidaiaBerria("testBidaia2", "testDeskribapena2", java.sql.Date.valueOf("1995-01-29"), java.sql.Date.valueOf("1995-01-30"), 1, "Eu", "B1");
	        
	    	ArrayList<modelo.POJOak.Bidaia> bidaiak = Bidaia.cargatuBidaiak(1);
	        
	        assertEquals(2, bidaiak.get(1).getId());
	        assertEquals("testBidaia2", bidaiak.get(1).getIzena());
	        assertEquals("testDeskribapena2", bidaiak.get(1).getDeskirbapena());
	        assertEquals(java.sql.Date.valueOf("1995-01-29"), bidaiak.get(1).getBidaia_hasi());
	        assertEquals(java.sql.Date.valueOf("1995-01-30"), bidaiak.get(1).getBidaia_amaitu());
	        assertEquals("Euskadi", bidaiak.get(1).getHerrialdea());
	        assertEquals("BidaiMota", bidaiak.get(1).getMota());
	    }
	    
	    @Test
	    public void testEzabatuBidaiak() {
	       
	    }
	    
	    @AfterClass
	    public static void tearDown() throws SQLException {
	    	try (Statement stmt = connection.createStatement()) {
	        	stmt.executeUpdate("delete from agentzia");
	        	stmt.executeUpdate("delete from agentzia_mota");
	        	stmt.executeUpdate("delete from langile_kop");
	        	stmt.executeUpdate("delete from bidaiak");
	        	stmt.executeUpdate("delete from herrialdea");
	        	stmt.executeUpdate("delete from bidaia_mota");
	        	stmt.executeUpdate("delete from zerbitzuak");
	        	stmt.executeUpdate("delete from beste_batzuk");
	        	
	        }
	        connection.close();
	    }
}
