package modelo.DAOak;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import controlador.Conexioa;

public class Zerbitzua {
	
	public static ArrayList<modelo.POJOak.Zerbitzua> cargatuZerbitzuak(int ID_Bidaia){
		ArrayList<modelo.POJOak.Zerbitzua> zerbitzuak = new ArrayList<modelo.POJOak.Zerbitzua>();
		String sql = "select h.ID, h.Izena, Jatorrizko, Helmuga, Hegaldi_Kod, Aerolinea, h.Prezioa, Irteera_Data, Irteera_Ordua, Iraupena, "
				+ "o.ID, Hotelaren_Izena, Hiria, o.Prezioa, o.Sarrera_Eguna, o.Irteera_Eguna, Logela_Mota, "
				+ "bb.ID, bb.Izena, bb.Eguna, Deskribapena, bb.Prezioa "
				+ "from hegaldia as h right join zerbitzuak as z on z.ID = h.ID "
				+ "                        left join ostatua as o on z.ID = o.ID "
				+ "                        left join beste_batzuk as bb on z.ID = bb.ID "
				+ "where ID_Bidaiak = "+ID_Bidaia;
				
				/*"select b.ID, b.Izena, Deskribapena, Data_Hasiera, Data_Amaiera, h.Izena, bm.Mota"
				+ "from Herrialdea as h join Bidaiak as b on b.ID_Herrialdeak = h.ID join Bidaia_Mota as bm on b.Kod_Mota = bm.Kod"
				+ "where ID_Agentzia_Bidaia=1;";*/
		
		try (Connection conn = Conexioa.obtenerConexion();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {
			
			while (rs.next()) {
				if(rs.getInt("h.ID") != 0) {
					String hegaldiIzena = "Izena";
					int ID_Buelta = 0;
					try {
						ID_Buelta = rs.getInt("h.ID_buelta");
					} catch (Exception e){
						ID_Buelta = 0;
					}
					modelo.POJOak.Zerbitzua zerbitzua = new modelo.POJOak.Zerbitzua(rs.getInt("h.ID"), rs.getString("h.Izena"), rs.getString("Jatorrizko"), rs.getString("Helmuga"), 
							rs.getDate("Irteera_Data"), rs.getString("Hegaldi_Kod"), rs.getString("Aerolinea"), rs.getDouble("h.Prezioa"), rs.getDate("Irteera_Ordua"), 
							rs.getString("Iraupena"), ID_Buelta);
				zerbitzuak.add(zerbitzua);
				} else if (rs.getInt("o.ID") != 0) {
					modelo.POJOak.Zerbitzua zerbitzua = new modelo.POJOak.Zerbitzua(rs.getInt("o.ID"), rs.getString("Hotelaren_Izena"), rs.getString("Logela_Mota"), 
							rs.getString("Hiria"), rs.getDate("o.Sarrera_Eguna"), rs.getDate("o.Irteera_Eguna"),rs.getDouble("o.Prezioa"));
					zerbitzuak.add(zerbitzua);
				} else if (rs.getInt("bb.ID") != 0) {
					modelo.POJOak.Zerbitzua zerbitzua = new modelo.POJOak.Zerbitzua(rs.getInt("bb.ID"), rs.getString("bb.Izena"), rs.getString("Deskribapena"), 
							rs.getDate("bb.Eguna"), rs.getDouble("bb.Prezioa"));
					zerbitzuak.add(zerbitzua);
				}
            }
		} catch (SQLException e) {
            e.printStackTrace();
            
        }	
		return zerbitzuak;
		}
}
