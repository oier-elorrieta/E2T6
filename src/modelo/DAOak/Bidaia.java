package modelo.DAOak;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controlador.Conexioa;

public class Bidaia {
	
	public static ArrayList<modelo.POJOak.Bidaia> cargatuBidaiak(int ID_agentzia){
		ArrayList<modelo.POJOak.Bidaia> bidaiak = new ArrayList<modelo.POJOak.Bidaia>();
		String sql = "Select b.ID, b.Izena, Deskribapena, Data_Hasiera, Data_Amaiera, h.Izena, bm.Mota "
				+ "from Herrialdea as h join Bidaiak as b on b.ID_Herrialdeak = h.ID "
				+ "join Bidaia_Mota as bm on b.Kod_Mota = bm.Kod"
				+ " where ID_Agentzia_Bidaia = "+ ID_agentzia;
				
				/*"select b.ID, b.Izena, Deskribapena, Data_Hasiera, Data_Amaiera, h.Izena, bm.Mota"
				+ "from Herrialdea as h join Bidaiak as b on b.ID_Herrialdeak = h.ID join Bidaia_Mota as bm on b.Kod_Mota = bm.Kod"
				+ "where ID_Agentzia_Bidaia=1;";*/
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				@SuppressWarnings("unused")
				ArrayList<modelo.POJOak.Zerbitzua> zerbitzuak = new ArrayList<modelo.POJOak.Zerbitzua>();
				modelo.POJOak.Bidaia bidaia = new modelo.POJOak.Bidaia(rs.getInt("ID"), rs.getString("b.Izena"), rs.getString("Deskribapena"), 
						rs.getDate("Data_Hasiera"), rs.getDate("Data_Amaiera"), rs.getString("h.Izena"), rs.getString("bm.Mota"), zerbitzuak = modelo.DAOak.Zerbitzua.cargatuZerbitzuak(rs.getInt("ID")));
				bidaiak.add(bidaia);
            }
		} catch (SQLException e) {
            e.printStackTrace();
        }	
		return bidaiak;
	}
	
	public static void EzabatuBidaiak(int ID){
		String sql = "delete from Bidaiak where ID = "+ID;
		
		try (Connection conn = Conexioa.obtenerConexion();
	         Statement stmt = conn.createStatement()) {
			@SuppressWarnings("unused")
			int rs = stmt.executeUpdate(sql);
		} catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public static void bidaiaBerria(String izena, String deskribapena, Date Data_Hasiera, Date Data_Amaiera, int IDAgentzia, String Herrialdeak, String mota) {
		String sql = "insert into Bidaiak"
				+ "values (\"" + null + "\", \"" + izena + "\", \"" + deskribapena + "\", \"" + Data_Hasiera + "\", \"" + Data_Amaiera + "\", \"" + IDAgentzia + "\", \"" + Herrialdeak +
				"\", \"" + mota + "\")";
		
		try (Connection conn = Conexioa.obtenerConexion();
		         Statement stmt = conn.createStatement()) {
				@SuppressWarnings("unused")
				int rs = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
            e.printStackTrace();
        }			
	}
}
