package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controlador.Conexioa;

public class MasterData {
	public static ArrayList<String> cargatuAireportuak(){
		ArrayList<String> aireportuak = new ArrayList<String>();
		
		String sql = "select *"
				+ "from aireportuak";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				aireportuak.add(rs.getString("hiria")+" ("+rs.getString("aireportu")+")");
            }
			return aireportuak;
		} catch (SQLException e) {
            e.printStackTrace();
            return aireportuak;
        }
	}
	public static String[] cargatuAirolineak(){
		String[] aireportuak = new String[99];
		int kont = 0;
		String sql = "select *"
				+ "from aireportuak";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				aireportuak[kont]=rs.getString("hiria")+" ("+rs.getString("aireportu")+")";
				kont++;
            }
			return aireportuak;
		} catch (SQLException e) {
            e.printStackTrace();
            return aireportuak;
        }
	}
}
