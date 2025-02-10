package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.Conexioa;

public class Agentzia {

	public static modelo.POJOak.Agentzia cargatuAgentziak(String erabiltzaile){
		modelo.POJOak.Agentzia agentzia = new modelo.POJOak.Agentzia();
		String sql = "select ID, Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, am.Mota, lk.Kopurua "
				+ "from agentzia_mota as am join agentzia as a on a.Kod_Mota = am.Kod "
				+ "join langile_kop as lk on a.Langile_Kop=lk.Kod "
				+ "where Erabiltzailea = '" + erabiltzaile + "';";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				agentzia.setId(rs.getInt(1));
				agentzia.setIzena(rs.getString(2));
				agentzia.setLogoa(rs.getString(3));
				agentzia.setMarkaKolorea(rs.getString(4));
				agentzia.setErabiltzailea(rs.getString(5));
				agentzia.setPasahitza(rs.getString(6));
				agentzia.setMota(rs.getString(7));
				agentzia.setLangileKop(rs.getString(8));
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
				+ "where Erabiltzailea = '" + erabiltzailea + "';";
		
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
				+ "where Erabiltzailea = '" + erabiltzailea + "';";
		
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
	
	public static void agentziaBerria(String izena, String logoa, String marka_Kolorea, String erabiltzaile, String pasahitza, String mota, String langile_Kop) {
		String sql = "insert into Agentzia (Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, Kod_Mota, Langile_Kop) "
				+ "values ('" + izena + "', '" + logoa + "', '" + marka_Kolorea + "', '" + erabiltzaile + "', '" + pasahitza +
				"', '" + mota + "', '" + langile_Kop + "');";
		
		try (Connection conn = Conexioa.obtenerConexion();
		         Statement stmt = conn.createStatement()) {
				@SuppressWarnings("unused") 
				int rs = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
            e.printStackTrace();
        }			
	}
}
