package controlador;

import java.sql.*;

import java.util.ArrayList;


 //Datu basearekin konexioa egiteko metodoa
 //Bi konexio daude, bat da programa testeatzeko eta bestala programa normalarentzako 
 

public class Conexioa {
	
	private static final String URL = "jdbc:mysql://localhost:3307/turismo_probak";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    private static final String TEST_URL = "jdbc:mysql://localhost:3307/turismo_test";
    private static final String TEST_USER = "root";
    private static final String TEST_PASSWORD = "";
    
    private static boolean testMode = false;
    
    /**
     * Test modua aktibatzeko
     * @param testMode boolean test modua aktibatzeko ala ez
     */
    public static void enableTestMode() {
		testMode = true;	
	}
	
    /**
     * datubasearekin konexioa hartzen du
     * @param testMode true bada, konektatzen da probatarako datubasera, bestela, normalera
     * @return konexioa datu basearekin
     * @throws SQLException
     */
    public static Connection obtenerConexion() throws SQLException {
    	if (testMode) {
            return DriverManager.getConnection(TEST_URL, TEST_USER, TEST_PASSWORD);
        }
    	return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

}
// fin de main
// fin de la clase