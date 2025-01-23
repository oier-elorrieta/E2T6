package modelo;

import java.util.Date;

public class OstautaPOJO {
	
	private int id;
	private String izena;
	private String logela;
	private String hiria;
	private Date sarrera;
	private Date irteera;
	private double prezioa;
	
	public OstautaPOJO(int id, String izena, String logela, String hiria, Date sarrera, Date irteera, double prezioa) {
		this.id = id;
		this.izena = izena;
		this.logela = logela;
		this.hiria = hiria;
		this.sarrera = sarrera;
		this.irteera = irteera;
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

	public String getLogela() {
		return logela;
	}

	public void setLogela(String logela) {
		this.logela = logela;
	}

	public String getHiria() {
		return hiria;
	}

	public void setHiria(String hiria) {
		this.hiria = hiria;
	}

	public Date getSarrera() {
		return sarrera;
	}

	public void setSarrera(Date sarrera) {
		this.sarrera = sarrera;
	}

	public Date getIrteera() {
		return irteera;
	}

	public void setIrteera(Date irteera) {
		this.irteera = irteera;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public String toString() {
		return "Izena=" + izena + ", logela=" + logela + ", hiria=" + hiria + "/nSarrera="
				+ sarrera + ", irteera=" + irteera + ", prezioa=" + prezioa;
	}
}
