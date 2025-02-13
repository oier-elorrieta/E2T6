package modelo.DAOak;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controlador.Conexioa;

public class Bidaia {
	/**
	 * Agentzia baten bidai guztiak kargatzen ditu ArrayList batean
	 * @param ID_agentzia kargatu nahi dugun bidaien agentziaren ID
	 * @return ArrayList bat agentzia horren bidaiekin
	 */
	public static ArrayList<modelo.POJOak.Bidaia> cargatuBidaiak(int ID_agentzia){
		//Sortzen du arraylist bat hutzik
		ArrayList<modelo.POJOak.Bidaia> bidaiak = new ArrayList<modelo.POJOak.Bidaia>();
		String sql = "Select b.ID, b.Izena, Deskribapena, Data_Hasiera, Data_Amaiera, h.Izena, bm.Mota "
				+ "from Herrialdea as h join Bidaiak as b on b.ID_Herrialdeak = h.ID "
				+ "join Bidaia_Mota as bm on b.Kod_Mota = bm.Kod "
				+ "where ID_Agentzia_Bidaia = "+ ID_agentzia;
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			//konsulta eta gero, bueltatzen diren datuekin, sortzen du bidai objetu bat, datuekin kargatzen du eta sartzen du ArrayListan
			//Bidai objetu barruan dagoenes arraylist bat zerbitzuetarako, ere sortzen dugu arraylist hori, 
			//cargatzen dugu zerbitzu objetuekin, eta gordetzen dugu Bidaia objetuan
			while (rs.next()) {
				@SuppressWarnings("unused")
				ArrayList<modelo.POJOak.Zerbitzua> zerbitzuak = new ArrayList<modelo.POJOak.Zerbitzua>();
				modelo.POJOak.Bidaia bidaia = new modelo.POJOak.Bidaia(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getDate(4), rs.getDate(5), rs.getString(6), rs.getString(7), zerbitzuak = modelo.DAOak.Zerbitzua.cargatuZerbitzuak(rs.getInt(1)));
				bidaiak.add(bidaia);
            }
		} catch (SQLException e) {
            e.printStackTrace();
        }	
		return bidaiak;
	}
	
	/**
	 * Aukeratutako bidaia ezabatzen du datubasetik
	 * @param ID aukeratu dugun bidaiaren IDa
	 */
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
	
	// Bidai berri bat sortzen du datubasean programak ematen dion datu guztiekin
	public static void bidaiaBerria(String izena, String deskribapena, Date Data_Hasiera, Date Data_Amaiera, int IDAgentzia, String Herrialdeak, String mota) {
		String sql = "insert into Bidaiak (Izena, Deskribapena, Data_Hasiera, Data_Amaiera, ID_Agentzia_Bidaia, ID_Herrialdeak, Kod_Mota)"
				+ "values ('" + izena + "', '" + deskribapena + "', '" + Data_Hasiera + "', '" + Data_Amaiera + "', '" + IDAgentzia + "', '" + Herrialdeak +
				"', '" + mota + "');";
		
		try (Connection conn = Conexioa.obtenerConexion();
		         Statement stmt = conn.createStatement()) {
				@SuppressWarnings("unused")
				int rs = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
            e.printStackTrace();
        }			
	}
}
