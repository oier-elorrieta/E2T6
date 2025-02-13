package controlador;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class Metodoak {
	/**
	 * Metodo bat bidai baten barruko zerbitzu espezifiko bat bilatzeko
	 * @param bidaiak hay que meterlo al gestor
	 * @param ID bilatzen duen bidaiaren IDa
	 * @return bilatzen den bidaiaren posizioa ArrayListen
	 */
	public static int bidaiarenZerbitzuak(ArrayList<modelo.POJOak.Bidaia> bidaiak, int ID) {
		int posizioa=0;
		for (int j = 0; j < bidaiak.size(); j++) {
			if (bidaiak.get(j).getId()==ID) {
				posizioa=j;
			}
		}
		return posizioa;
	}
}
