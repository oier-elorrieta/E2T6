package modelo;

import java.util.Date;

public class JardueraPOJO {
	
	private int id;
	private String izena;
	private String deskribapena;
	private Date data;
	private double prezioa;
	
	public JardueraPOJO(int id, String izena, String deskribapena, Date data, double prezioa) {
		this.id = id;
		this.izena = izena;
		this.deskribapena = deskribapena;
		this.data = data;
		this.prezioa = prezioa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getDeskribapena() {
		return deskribapena;
	}

	public void setDeskribapena(String deskribapena) {
		this.deskribapena = deskribapena;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public String toString() {
		return "Izena=" + izena + "/nDeskribapena=" + deskribapena + "/nData=" + data
				+ ", prezioa=" + prezioa;
	}
}
