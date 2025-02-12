package test.POJOak;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import modelo.POJOak.Bidaia;
import modelo.POJOak.Zerbitzua;

public class BidaiaTest {

	private ArrayList<Zerbitzua> zerbitzuak;
	private Bidaia bidaia;;
    
	//Kargatzen zerbitzu arraylist bat eta objetu bat
    @Before
    public void setUp() {
    	zerbitzuak = new ArrayList<Zerbitzua>();
        bidaia = new Bidaia(1, "Bidaia1", "Deskribapena1", new Date(0), new Date(0), "Espainia", "Turismo", zerbitzuak);
    }
    
    //Datuak konprobatzen ditu
    @Test
    public void testBidaia() {
        assertNotNull(bidaia);
        assertEquals(1, bidaia.getId());
        assertEquals("Bidaia1", bidaia.getIzena());
        assertEquals("Deskribapena1", bidaia.getDeskirbapena());
        assertEquals("Espainia", bidaia.getHerrialdea());
        assertEquals("Turismo", bidaia.getMota());
        assertNotNull(bidaia.getBidaia_hasi());
        assertNotNull(bidaia.getBidaia_amaitu());
		assertEquals(zerbitzuak, bidaia.getZerbitzuak());
    }
    
    //Setterrak eta Getterrak konprobatzen ditu
    @Test
    public void testSetId() {
        bidaia.setId(2);
        assertEquals(2, bidaia.getId());
    }
    
    @Test
    public void testGetId() {
        assertEquals(1, bidaia.getId());
    }
    
    @Test
    public void testSetIzena() {
        bidaia.setIzena("Bidaia2");
        assertEquals("Bidaia2", bidaia.getIzena());
    }
    
    @Test
    public void testGetIzena() {
        assertEquals("Bidaia1", bidaia.getIzena());
    }
    
    @Test
    public void testSetDeskirbapena() {
        bidaia.setDeskirbapena("Deskribapena2");
        assertEquals("Deskribapena2", bidaia.getDeskirbapena());
    }
    
    @Test
    public void testGetDeskirbapena() {
        assertEquals("Deskribapena1", bidaia.getDeskirbapena());
    }
    
    @Test
    public void testSetBidaia_hasi() {
        Date newDate = new Date(0);
        bidaia.setBidaia_hasi(newDate);
        assertEquals(newDate, bidaia.getBidaia_hasi());
    }
    
    @Test
    public void testGetBidaia_hasi() {
        assertNotNull(bidaia.getBidaia_hasi());
    }
    
    @Test
    public void testSetBidaia_amaitu() {
        Date newDate = new Date(0);
        bidaia.setBidaia_amaitu(newDate);
        assertEquals(newDate, bidaia.getBidaia_amaitu());
    }
    
    @Test
    public void testGetBidaia_amaitu() {
        assertNotNull(bidaia.getBidaia_amaitu());
    }
    
    @Test
    public void testSetHerrialdea() {
        bidaia.setHerrialdea("Frantzia");
        assertEquals("Frantzia", bidaia.getHerrialdea());
    }
    
    @Test
    public void testGetHerrialdea() {
        assertEquals("Espainia", bidaia.getHerrialdea());
    }
    
    @Test
    public void testSetMota() {
        bidaia.setMota("Negozioa");
        assertEquals("Negozioa", bidaia.getMota());
    }
    
    @Test
    public void testGetMota() {
        assertEquals("Turismo", bidaia.getMota());
    }
    
    @Test
    public void testToString() {
        assertNotNull(bidaia.toString());
    }

}
