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
	public static ArrayList<String> cargatuAireportuakKod(){
		ArrayList<String> aireportuak = new ArrayList<String>();
		
		String sql = "select *"
				+ "from aireportuak";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				aireportuak.add(rs.getString("aireportu"));
            }
			return aireportuak;
		} catch (SQLException e) {
            e.printStackTrace();
            return aireportuak;
        }
	}
	public static ArrayList<String> cargatuAerolinea(){
		ArrayList<String> aerolineak = new ArrayList<String>();
		
		String sql = "select Izena "
				+ "from Aerolinea";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				aerolineak.add(rs.getString("Izena"));
            }
			return aerolineak;
		} catch (SQLException e) {
            e.printStackTrace();
            return aerolineak;
        }
	}
	public static ArrayList<String> cargatuAerolineaKod(){
		ArrayList<String> aerolineak = new ArrayList<String>();
		
		String sql = "select Kod "
				+ "from Aerolinea";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				aerolineak.add(rs.getString("Kod"));
            }
			return aerolineak;
		} catch (SQLException e) {
            e.printStackTrace();
            return aerolineak;
        }
	}
	public static ArrayList<String> cargatuBidaiMota(){
		ArrayList<String> bidaiMotak = new ArrayList<String>();
		
		String sql = "select Mota "
				+ "from Bidaia_Mota";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				bidaiMotak.add(rs.getString("Mota"));
            }
			return bidaiMotak;
		} catch (SQLException e) {
            e.printStackTrace();
            return bidaiMotak;
        }
	}
	public static ArrayList<String> cargatuBidaiMotaKod(){
		ArrayList<String> bidaiMotak = new ArrayList<String>();
		
		String sql = "select kod "
				+ "from Bidaia_Mota";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				bidaiMotak.add(rs.getString("kod"));
            }
			return bidaiMotak;
		} catch (SQLException e) {
            e.printStackTrace();
            return bidaiMotak;
        }
	}
	public static ArrayList<String> cargatuHerrialdeak(){
		ArrayList<String> herrialdeak = new ArrayList<String>();
		
		String sql = "select Izena "
				+ "from Herrialdea";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				herrialdeak.add(rs.getString("Izena"));
            }
			return herrialdeak;
		} catch (SQLException e) {
            e.printStackTrace();
            return herrialdeak;
        }
	}
	public static ArrayList<String> cargatuHerrialdeakID(){
		ArrayList<String> herrialdeak = new ArrayList<String>();
		
		String sql = "select ID "
				+ "from Herrialdea";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				herrialdeak.add(rs.getString("ID"));
            }
			return herrialdeak;
		} catch (SQLException e) {
            e.printStackTrace();
            return herrialdeak;
        }
	}
	public static ArrayList<String> cargatuLangileKopurua(){
		ArrayList<String> langileKopuru = new ArrayList<String>();
		
		String sql = "select Kopurua "
				+ "from Langile_Kop";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				langileKopuru.add(rs.getString("Kopurua"));
            }
			return langileKopuru;
		} catch (SQLException e) {
            e.printStackTrace();
            return langileKopuru;
        }
	}
	public static ArrayList<String> cargatuLangileKopuruaKod(){
		ArrayList<String> langileKopuruKod = new ArrayList<String>();
		
		String sql = "select kod "
				+ "from Langile_Kop";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				langileKopuruKod.add(rs.getString("kod"));
            }
			return langileKopuruKod;
		} catch (SQLException e) {
            e.printStackTrace();
            return langileKopuruKod;
        }
	}
	public static ArrayList<String> cargatuAgentziaMota(){
		ArrayList<String> agentziaMota = new ArrayList<String>();
		
		String sql = "select Mota "
				+ "from Agentzia_Mota";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				agentziaMota.add(rs.getString("Mota"));
            }
			return agentziaMota;
		} catch (SQLException e) {
            e.printStackTrace();
            return agentziaMota;
        }
	}
	public static ArrayList<String> cargatuAgentziaMotaKod(){
		ArrayList<String> agentziaMotaKod = new ArrayList<String>();
		
		String sql = "select kod "
				+ "from Agentzia_Mota";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				agentziaMotaKod.add(rs.getString("kod"));
            }
			return agentziaMotaKod;
		} catch (SQLException e) {
            e.printStackTrace();
            return agentziaMotaKod;
        }
	}
	public static ArrayList<String> cargatuLogelaMota(){
		ArrayList<String> logelaMotak = new ArrayList<String>();
		
		String sql = "select Mota "
				+ "from Logela_Mota";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				logelaMotak.add(rs.getString("Mota"));
            }
			return logelaMotak;
		} catch (SQLException e) {
            e.printStackTrace();
            return logelaMotak;
        }
	}
	public static ArrayList<String> cargatuLogelaMotaKod(){
		ArrayList<String> logelaMotak = new ArrayList<String>();
		
		String sql = "select Kod "
				+ "from Logela_Mota";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				logelaMotak.add(rs.getString("Kod"));
            }
			return logelaMotak;
		} catch (SQLException e) {
            e.printStackTrace();
            return logelaMotak;
        }
	}
}
