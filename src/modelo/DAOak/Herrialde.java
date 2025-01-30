package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexioa;

public class Herrialde {
	
	public List<modelo.POJOak.Herrialde> cargatuAireportuak(){
		List<modelo.POJOak.Herrialde> herrialde = new ArrayList<>();
		String sql = "SELECT * FROM Agentziak";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				modelo.POJOak.Herrialde aireportu = new modelo.POJOak.Herrialde(rs.getString("aireportu"), rs.getString("hiria"));
				herrialde.add(aireportu); 
                }
		} catch (SQLException e) {
            e.printStackTrace();
        }
		
		//vkjdnfkbjdf
        return herrialde;			
		}

}
