package modelo;

import java.util.Date;

public class HegaldiaPOJO {
	
	private String izena;
	private String jatorria;
	private String helmuga;
	private Date data;
	private String kod;
	private String aerolinea;
	private double prezioa;
	private Date irteera;
	private Date iraupena;
	
	public HegaldiaPOJO(String izena, String jatorria, String helmuga, Date data, String kod, String aerolinea,
			double prezioa, Date irteera, Date iraupena) {
		this.izena = izena;
		this.jatorria = jatorria;
		this.helmuga = helmuga;
		this.data = data;
		this.kod = kod;
		this.aerolinea = aerolinea;
		this.prezioa = prezioa;
		this.irteera = irteera;
		this.iraupena = iraupena;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getJatorria() {
		return jatorria;
	}

	public void setJatorria(String jatorria) {
		this.jatorria = jatorria;
	}

	public String getHelmuga() {
		return helmuga;
	}

	public void setHelmuga(String helmuga) {
		this.helmuga = helmuga;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	public Date getIrteera() {
		return irteera;
	}

	public void setIrteera(Date irteera) {
		this.irteera = irteera;
	}

	public Date getIraupena() {
		return iraupena;
	}

	public void setIraupena(Date iraupena) {
		this.iraupena = iraupena;
	}

	@Override
	public String toString() {
		return "Hegaldia:" + izena + ", jatorria:" + jatorria + ", helmuga=" + helmuga + "/nData=" + data
				+ ", kod=" + kod + ", aerolinea=" + aerolinea + ", prezioa=" + prezioa + ", irteera=" + irteera
				+ ", iraupena=" + iraupena;
	}
	
	

}
