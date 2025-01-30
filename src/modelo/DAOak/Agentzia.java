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
		String sql = "select ID, Izena, Logoa, Markaren_Kolore, Erabiltzailea, Pasahitza, am.Mota, lk.Kopurua \r\n"
				+ "from agentzia_mota as am join agentzia as a on a.Kod_Mota = am.Kod\r\n"
				+ "                         join langile_kop as lk on a.Langile_Kop=lk.Kod;";
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				modelo.POJOak.Agentzia agentzia1 = new modelo.POJOak.Agentzia(rs.getInt("ID"), rs.getString("Izena"),
						rs.getString("Logoa"), rs.getString("Markaren_Kolore"), rs.getString("Erabiltzailea"), 
						rs.getString("Pasahitza"), rs.getString("am.Mota"), rs.getString("lk.Kopurua"));
            }
			return agentzia;
		} catch (SQLException e) {
            e.printStackTrace();
            return agentzia;
        }			
		}
	}
