package test.POJOak;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import modelo.POJOak.Zerbitzua;

public class ZerbitzuaTest {

	private Zerbitzua hegaldia;
	private Zerbitzua ostatua;
	private Zerbitzua jarduera;
	private Zerbitzua jarduera2;
	
	 @Before
	    public void setUp() {
		 hegaldia = new Zerbitzua(1, "HegaldiTest", "Bilbao", "Madrid", "AB123", "Iberia", 150.50, new Date(0), new Date(0), "2h", 2);
		 ostatua = new Zerbitzua(1, "HotelTest", "Bilbao", 80.75, new Date(0), new Date(0), "LogelaTest");
		 jarduera = new Zerbitzua(1, "JardueraTest", new Date(0), "DeskribapenaTest", 25.00);
	    }

    @Test
    public void testHegaldiConstructor() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        assertEquals(1, hegaldia.getId_hegaldia());
        assertEquals("HegaldiTest", hegaldia.getHegaldiIzena());
        assertEquals("Bilbao", hegaldia.getJatorria());
        assertEquals("Madrid", hegaldia.getHelmuga());
        assertEquals("AB123", hegaldia.getKod());
        assertEquals("Iberia", hegaldia.getAerolinea());
        assertEquals(150.50, hegaldia.getHegaldiPrezioa(), 0.01);
        assertEquals("2h", hegaldia.getHegaldiIraupena());
        assertEquals(2, hegaldia.getId_buelta());
    }
    
    @Test
    public void testOstatuaConstructor() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        assertEquals(1, ostatua.getIdOstatua());
        assertEquals("HotelTest", ostatua.getOstatuIzena());
        assertEquals("LogelaTest", ostatua.getLogela());
        assertEquals("Bilbao", ostatua.getHiria());
        assertEquals(80.75, ostatua.getOstatuPrezioa(), 0.01);
    }
    
    @Test
    public void testJardueraConstructor() {
    	//jarduera = new Zerbitzua(1, "City Tour", "Guided tour of Bilbao", new Date(0), 25.00);
        assertEquals(1, jarduera.getJardueraId());
        assertEquals("JardueraTest", jarduera.getJardueraIzena());
        assertEquals("DeskribapenaTest", jarduera.getJardueraDeskribapena());
        assertEquals(25.00, jarduera.getJardueraPrezioa(), 0.01);
    }
    
    @Test
    public void testSetAndGetIdHegaldia() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setId_hegaldia(2);
        assertEquals(2, hegaldia.getId_hegaldia());
    }
    
    @Test
    public void testSetAndGetHegaldiIzena() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setHegaldiIzena("Flight456");
        assertEquals("Flight456", hegaldia.getHegaldiIzena());
    }
    
    @Test
    public void testSetAndGetJatorria() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setJatorria("Barcelona");
        assertEquals("Barcelona", hegaldia.getJatorria());
    }
    
    @Test
    public void testSetAndGetHelmuga() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setHelmuga("Sevilla");
        assertEquals("Sevilla", hegaldia.getHelmuga());
    }
    
    @Test
    public void testSetAndGetKod() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setKod("CD456");
        assertEquals("CD456", hegaldia.getKod());
    }
    
    @Test
    public void testSetAndGetAerolinea() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setAerolinea("Vueling");
        assertEquals("Vueling", hegaldia.getAerolinea());
    }
    
    @Test
    public void testSetAndGetHegaldiPrezioa() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setHegaldiPrezioa(200.75);
        assertEquals(200.75, hegaldia.getHegaldiPrezioa(), 0.01);
    }
    
    @Test
    public void testSetAndGetHegaldiIraupena() {
    	//hegaldia = new Zerbitzua(1, "Flight123", "Bilbao", "Madrid", new Date(0), "AB123", "Iberia", 150.50, new Date(0), "2h", 2);
        hegaldia.setHegaldiIraupena("3h");
        assertEquals("3h", hegaldia.getHegaldiIraupena());
    }
    
    @Test
    public void testSetAndGetIdOstatua() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        ostatua.setIdOstatua(2);
        assertEquals(2, ostatua.getIdOstatua());
    }
    
    @Test
    public void testSetAndGetOstatuIzena() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        ostatua.setOstatuIzena("Hotel Madrid");
        assertEquals("Hotel Madrid", ostatua.getOstatuIzena());
    }
    
    @Test
    public void testSetAndGetLogela() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        ostatua.setLogela("Suite");
        assertEquals("Suite", ostatua.getLogela());
    }
    
    @Test
    public void testSetAndGetHiria() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        ostatua.setHiria("Valencia");
        assertEquals("Valencia", ostatua.getHiria());
    }
    
    @Test
    public void testSetAndGetOstatuPrezioa() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        ostatua.setOstatuPrezioa(100.00);
        assertEquals(100.00, ostatua.getOstatuPrezioa(), 0.01);
    }
    
    @Test
    public void testSetAndGetJardueraIzena() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        jarduera.setJardueraIzena("Museum Tour");
        assertEquals("Museum Tour", jarduera.getJardueraIzena());
    }
    
    @Test
    public void testSetAndGetJardueraPrezioa() {
    	//ostatua = new Zerbitzua(1, "Hotel Bilbao", "Double", "Bilbao", new Date(0), new Date(0), 80.75);
        jarduera.setJardueraPrezioa(30.00);
        assertEquals(30.00, jarduera.getJardueraPrezioa(), 0.01);
    }

}
