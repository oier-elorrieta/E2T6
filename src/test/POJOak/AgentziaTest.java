package test.POJOak;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelo.POJOak.Agentzia;

public class AgentziaTest {

	private Agentzia agentzia;
    
	//Sortzen du agentzia objetu bat
    @Before
    public void setUp() {
        agentzia = new Agentzia(1, "Elorrieta", "logo.png", "#FFFFFF", "admin", "admin", "L1", "A2");
    }
    
    //Konprobatzen du agentziaren datuak
    @Test
    public void testAgentzia() {
        assertNotNull(agentzia);
        assertEquals(1, agentzia.getId());
        assertEquals("Elorrieta", agentzia.getIzena());
        assertEquals("logo.png", agentzia.getLogoa());
        assertEquals("#FFFFFF", agentzia.getMarkaKolorea());
        assertEquals("admin", agentzia.getErabiltzailea());
        assertEquals("admin", agentzia.getPasahitza());
        assertEquals("L1", agentzia.getLangileKop());
        assertEquals("A2", agentzia.getMota());
    }
    
    //Setterrak eta Getterrak conprobatzen ditu
    @Test
    public void testSetId() {
        agentzia.setId(2);
        assertEquals(2, agentzia.getId());
    }
    
    @Test
    public void testGetId() {
        assertEquals(1, agentzia.getId());
    }
    
    @Test
    public void testSetIzena() {
        agentzia.setIzena("AgentziaBerria");
        assertEquals("AgentziaBerria", agentzia.getIzena());
    }
    
    @Test
    public void testGetIzena() {
        assertEquals("Elorrieta", agentzia.getIzena());
    }
    
    @Test
    public void testSetLogoa() {
        agentzia.setLogoa("LogoBerria.png");
        assertEquals("LogoBerria.png", agentzia.getLogoa());
    }
    
    @Test
    public void testGetLogoa() {
        assertEquals("logo.png", agentzia.getLogoa());
    }
    
    @Test
    public void testSetMarkaKolorea() {
        agentzia.setMarkaKolorea("#000000");
        assertEquals("#000000", agentzia.getMarkaKolorea());
    }
    
    @Test
    public void testGetMarkaKolorea() {
        assertEquals("#FFFFFF", agentzia.getMarkaKolorea());
    }
    
    @Test
    public void testSetErabiltzailea() {
        agentzia.setErabiltzailea("AdminBerria");
        assertEquals("AdminBerria", agentzia.getErabiltzailea());
    }
    
    @Test
    public void testGetErabiltzailea() {
        assertEquals("admin", agentzia.getErabiltzailea());
    }
    
    @Test
    public void testSetPasahitza() {
        agentzia.setPasahitza("PasahitzBerria");
        assertEquals("PasahitzBerria", agentzia.getPasahitza());
    }
    
    @Test
    public void testGetPasahitza() {
        assertEquals("admin", agentzia.getPasahitza());
    }
    
    @Test
    public void testSetLangileKop() {
        agentzia.setLangileKop("L2");
        assertEquals("L2", agentzia.getLangileKop());
    }
    
    @Test
    public void testGetLangileKop() {
        assertEquals("L1", agentzia.getLangileKop());
    }
    
    @Test
    public void testSetMota() {
        agentzia.setMota("A1");
        assertEquals("A1", agentzia.getMota());
    }
    
    @Test
    public void testGetMota() {
        assertEquals("A2", agentzia.getMota());
    }
    
    @Test
    public void testToString() {
        String expected = "Agentzia [id=1, izena=Elorrieta, logoa=logo.png, markaKolorea=#FFFFFF, erabiltzailea=admin, pasahitza=admin, langileKop=L1, mota=A2]";
        assertEquals(expected, agentzia.toString());
    }
}
