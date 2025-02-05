package test.POJOak;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.POJOak.Aireportu;

public class AireportuTest {

	private Aireportu aireportu;

    @Test
    public void testAireportuConstructor() {
    	aireportu = new Aireportu("BIO", "Bilbao");
        assertEquals("BIO", aireportu.getAireportu());
        assertEquals("Bilbao", aireportu.getHiria());
    }

    @Test
    public void testSetAndGetAireportu() {
    	aireportu = new Aireportu("BIO", "Bilbao");
        aireportu.setAireportu("MAD");
        assertEquals("MAD", aireportu.getAireportu());
    }

    @Test
    public void testSetAndGetHiria() {
    	aireportu = new Aireportu("BIO", "Bilbao");
        aireportu.setHiria("Madrid");
        assertEquals("Madrid", aireportu.getHiria());
    }

}
