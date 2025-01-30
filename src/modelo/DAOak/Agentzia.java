package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexioa;

public class Agentzia {

	public List<Agentzia> cargatuAgentziak(){
		List<Agentzia> agentziak = new ArrayList<>();
		String sql = "SELECT * FROM Agentziak";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				
            }
		} catch (SQLException e) {
            e.printStackTrace();
        }
		
		//vkjdnfkbjdf
        return agentziak;			
		}
	}
