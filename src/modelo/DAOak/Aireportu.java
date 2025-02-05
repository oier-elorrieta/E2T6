package modelo.DAOak;

import modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexioa;

public class Aireportu {

	public static ArrayList<modelo.POJOak.Aireportu> cargatuAireportuak(){
		ArrayList<modelo.POJOak.Aireportu> aireportuak = new ArrayList<>();
		String sql = "SELECT * FROM Aireportuak";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				modelo.POJOak.Aireportu aireportu = new modelo.POJOak.Aireportu(rs.getString("aireportu"), rs.getString("hiria"));
				aireportuak.add(aireportu); 
                }
		} catch (SQLException e) {
            e.printStackTrace();
        }
		
        return aireportuak;			
		}
}
