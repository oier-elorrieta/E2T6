package test.POJOak;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.POJOak.Aireportu;

public class AireportuTest {

	private Aireportu aireportu;
	
	//Aireportu objetua sortzen du eta konprobatzen du
    @Test
    public void testAireportuConstructor() {
    	aireportu = new Aireportu("BIO", "Bilbao");
        assertEquals("BIO", aireportu.getAireportu());
        assertEquals("Bilbao", aireportu.getHiria());
    }

    //Getterrak eta Setterrak konprobatzen ditu
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
