package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexioa;

public class Agentzia {

	public static modelo.POJOak.Agentzia cargatuAgentziak(String erabiltzaile){
		modelo.POJOak.Agentzia agentzia = new modelo.POJOak.Agentzia();
		String sql = "select ID, Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, am.Mota, lk.Kopurua "
				+ "from agentzia_mota as am join agentzia as a on a.Kod_Mota = am.Kod "
				+ "join langile_kop as lk on a.Langile_Kop=lk.Kod "
				+ "where Erabiltzailea = \"" + erabiltzaile + "\"" + ";";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				agentzia.setId(rs.getInt("ID"));
				agentzia.setIzena(rs.getString("Izena"));
				agentzia.setLogoa(rs.getString("Logoa"));
				agentzia.setMarkaKolorea(rs.getString("Markaren_Kolore"));
				agentzia.setErabiltzailea(rs.getString("Erabiltzailea"));
				agentzia.setPasahitza(rs.getString("Pasahitza"));
				agentzia.setMota( rs.getString("am.Mota"));
				agentzia.setLangileKop(rs.getString("lk.Kopurua"));
            }
			return agentzia;
		} catch (SQLException e) {
            e.printStackTrace();
            return agentzia;
        }			
	}
	
	public static String bilatuErabiltzailea(String erabiltzailea) {
		String erabiltzaileBD = null;
		String sql = "select Erabiltzailea "
				+ "from agentzia "
				+ "where Erabiltzailea = \"" + erabiltzailea + "\"";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				erabiltzaileBD = rs.getString("Erabiltzailea");
           }
			return erabiltzaileBD;
		} catch (SQLException e) {
           e.printStackTrace();
           erabiltzaileBD = "Ez da existitzen";
           return erabiltzaileBD;
       }
	}
	
	public static String bilatuPasahitza(String erabiltzailea) {
		String pasahithzaBD = null;
		String sql = "select Pasahitza "
				+ "from agentzia "
				+ "where Erabiltzailea = \"" + erabiltzailea + "\"";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				pasahithzaBD = rs.getString("Pasahitza");
           }
			return pasahithzaBD;
		} catch (SQLException e) {
           e.printStackTrace();
           pasahithzaBD = "Ez da existitzen";
           return pasahithzaBD;
       }
	}
}
