package test.POJOak;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.POJOak.Herrialde;

public class HerrialdeTest {

	private Herrialde herrialde;

	//Herrialde sortzailea konprobatzen du
    @Test
    public void testHerrialdeConstructor() {
    	herrialde = new Herrialde("ES", "Espainia");
        assertEquals("ES", herrialde.getId());
        assertEquals("Espainia", herrialde.getIzena());
    }

    //Setterrak eta Getterrak konprobatzen du
    @Test
    public void testSetAndGetId() {
    	herrialde = new Herrialde("ES", "Espainia");
        herrialde.setId("FR");
        assertEquals("FR", herrialde.getId());
    }

    @Test
    public void testSetAndGetIzena() {
    	herrialde = new Herrialde("ES", "Espainia");
        herrialde.setIzena("Frantzia");
        assertEquals("Frantzia", herrialde.getIzena());
    }

}
