package controlador;

import java.sql.*;
import java.util.ArrayList;

public class Conexioa {
	
	private static final String URL = "jdbc:mysql://localhost:3307/turismo_probak";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    
    private static final String TEST_URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
    private static final String TEST_USER = "sa";
    private static final String TEST_PASSWORD = "";
    
    private static boolean testMode = false;
	
    public static Connection obtenerConexion() throws SQLException {
    	if (testMode) {
            return DriverManager.getConnection(TEST_URL, TEST_USER, TEST_PASSWORD);
        }
    	return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }

	public static void enableTestMode() {
		
		testMode = true;
		
	}
}
// fin de main
// fin de la clase