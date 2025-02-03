package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import controlador.Conexioa;

public class Agentzia {

	public static modelo.POJOak.Agentzia cargatuAgentziak(){
		modelo.POJOak.Agentzia agentzia = new modelo.POJOak.Agentzia();
		String sql = "select ID, Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, am.Mota, lk.Kopurua "
				+ "from agentzia_mota as am join agentzia as a on a.Kod_Mota = am.Kod "
				+ "join langile_kop as lk on a.Langile_Kop=lk.Kod;";
		
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
}
