package test.DAOak;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.runners.MethodSorters;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import modelo.DAOak.Bidaia;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class ZerbitzuaTest {

	private static Connection connection;
	
	 @BeforeClass
	    public static void AsetUpDataBase() throws SQLException {
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
				
				stmt.executeUpdate("Insert Into Zerbitzuak values (2, 1)");
				
				stmt.executeUpdate("Insert Into Zerbitzuak values (3, 1)");
				
				stmt.executeUpdate("Insert Into Logela_Mota values ('LMT', 'LogelaMotaTest')");
				
				stmt.executeUpdate("Insert Into Aerolinea values ('AT', 'AerolineaTest', 'HT')");
				
				stmt.executeUpdate("Insert Into Aireportuak values ('TA', 'AireportuTest')");
				
				stmt.executeUpdate("Insert Into Ostatua values (1, 'OstatuTest', 'HiriaTest', 100, '1995-01-29', '1995-01-30', 'LMT')");
				
				stmt.executeUpdate("Insert Into Hegaldia values (2, 'HegaldiTest', 'TA', 'TA', 'A100', 'AT', 100, '1995-01-30', '17:30:45', '1h 30m', null)");
				
				stmt.executeUpdate("Insert Into Beste_Batzuk values (3, 'besteBatzukTest', '1995-01-29', 'testDeskribapena', 100)");
		    }
	 }
	 
		    @Test
		    public void BtestCargatuZerbitzua() {
		    	ArrayList<modelo.POJOak.Zerbitzua> zerbitzuak = modelo.DAOak.Zerbitzua.cargatuZerbitzuak(1);
		    	
		    	assertEquals(1, zerbitzuak.get(0).getIdOstatua());
		    	assertEquals("OstatuTest", zerbitzuak.get(0).getOstatuIzena());
		    	assertEquals("HiriaTest", zerbitzuak.get(0).getHiria());
		    	assertEquals(100,00, zerbitzuak.get(0).getOstatuPrezioa());
		    	assertEquals(java.sql.Date.valueOf("1995-01-29"), zerbitzuak.get(0).getOstatuSarrera());
		    	assertEquals(java.sql.Date.valueOf("1995-01-30"), zerbitzuak.get(0).getOstatuIrteera());
		    	assertEquals("LMT", zerbitzuak.get(0).getLogela());
		    	
		    	assertEquals(2, zerbitzuak.get(1).getId_hegaldia());
		    	assertEquals("HegaldiTest", zerbitzuak.get(1).getHegaldiIzena());
		    	assertEquals("TA", zerbitzuak.get(1).getJatorria());
		    	assertEquals("TA", zerbitzuak.get(1).getHelmuga());
		    	assertEquals("A100", zerbitzuak.get(1).getKod());
		    	assertEquals("AT", zerbitzuak.get(1).getAerolinea());
		    	assertEquals(100,00, zerbitzuak.get(1).getHegaldiPrezioa());
		    	assertEquals(java.sql.Date.valueOf("1995-01-30"), zerbitzuak.get(1).getHegaldiData());
		    	assertEquals(java.sql.Time.valueOf("17:30:45"), zerbitzuak.get(1).getHegaldiIrteera());
		    	assertEquals("1h 30m", zerbitzuak.get(1).getHegaldiIraupena());
		    			    	
		    	assertEquals(3, zerbitzuak.get(2).getJardueraId());
		    	assertEquals("besteBatzukTest", zerbitzuak.get(2).getJardueraIzena());
		    	assertEquals(java.sql.Date.valueOf("1995-01-29"), zerbitzuak.get(2).getJardueraData());
		    	assertEquals("testDeskribapena", zerbitzuak.get(2).getJardueraDeskribapena());
		    	assertEquals(100,00, zerbitzuak.get(2).getJardueraPrezioa());
		    	
		    }
		    
		    @Test
		    public void CtestZerbitzuBerria() throws SQLException {
		    	int ID = 0;
		    	modelo.DAOak.Zerbitzua.zerbitzuBerria(1);
		    	ID = modelo.DAOak.Zerbitzua.zerbitzuBerriarenID(1);
		    	modelo.DAOak.Zerbitzua.hegaldiBerria(ID, "TA", "TA", "kod2", "AT", 100, "1995-01-28", null);
		    	
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
		        	stmt.executeUpdate("delete from hegaldia");
		        	stmt.executeUpdate("delete from ostatua");
		        	stmt.executeUpdate("delete from logela_mota");
		        	stmt.executeUpdate("delete from aerolinea");
		        	stmt.executeUpdate("delete from aireportuak");
		        }
		        connection.close();
		    }
}
