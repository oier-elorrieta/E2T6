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
	private String jatorria_buelta;
	private String helmuga_buelta;
	private Date data_buelta;
	private String kod_buelta;
	private String aerolinea_buelta;
	private double prezioa_buelta;
	private Date irteera_buelta;
	private Date iraupena_buelta;
	
	
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

	public HegaldiaPOJO(String izena, String jatorria, String helmuga, Date data, String kod, String aerolinea,
			double prezioa, Date irteera, Date iraupena, String jatorria_buelta, String helmuga_buelta,
			Date data_buelta, String kod_buelta, String aerolinea_buelta, double prezioa_buelta, Date irteera_buelta,
			Date iraupena_buelta) {
		
		this.izena = izena;
		this.jatorria = jatorria;
		this.helmuga = helmuga;
		this.data = data;
		this.kod = kod;
		this.aerolinea = aerolinea;
		this.prezioa = prezioa;
		this.irteera = irteera;
		this.iraupena = iraupena;
		this.jatorria_buelta = jatorria_buelta;
		this.helmuga_buelta = helmuga_buelta;
		this.data_buelta = data_buelta;
		this.kod_buelta = kod_buelta;
		this.aerolinea_buelta = aerolinea_buelta;
		this.prezioa_buelta = prezioa_buelta;
		this.irteera_buelta = irteera_buelta;
		this.iraupena_buelta = iraupena_buelta;
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

	public String getJatorria_buelta() {
		return jatorria_buelta;
	}

	public void setJatorria_buelta(String jatorria_buelta) {
		this.jatorria_buelta = jatorria_buelta;
	}

	public String getHelmuga_buelta() {
		return helmuga_buelta;
	}

	public void setHelmuga_buelta(String helmuga_buelta) {
		this.helmuga_buelta = helmuga_buelta;
	}

	public Date getData_buelta() {
		return data_buelta;
	}

	public void setData_buelta(Date data_buelta) {
		this.data_buelta = data_buelta;
	}

	public String getKod_buelta() {
		return kod_buelta;
	}

	public void setKod_buelta(String kod_buelta) {
		this.kod_buelta = kod_buelta;
	}

	public String getAerolinea_buelta() {
		return aerolinea_buelta;
	}

	public void setAerolinea_buelta(String aerolinea_buelta) {
		this.aerolinea_buelta = aerolinea_buelta;
	}

	public double getPrezioa_buelta() {
		return prezioa_buelta;
	}

	public void setPrezioa_buelta(double prezioa_buelta) {
		this.prezioa_buelta = prezioa_buelta;
	}

	public Date getIrteera_buelta() {
		return irteera_buelta;
	}

	public void setIrteera_buelta(Date irteera_buelta) {
		this.irteera_buelta = irteera_buelta;
	}

	public Date getIraupena_buelta() {
		return iraupena_buelta;
	}

	public void setIraupena_buelta(Date iraupena_buelta) {
		this.iraupena_buelta = iraupena_buelta;
	}	

}
