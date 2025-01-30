package modelo.POJOak;

import java.util.ArrayList; 

public class Agentzia {
	
	private int id;
	private String izena;
	private String logoa;
	private String markaKolorea;
	private String erabiltzailea;
	private String pasahitza;
	private int langileKop;
	private String mota;	
	private ArrayList<Bidaia> Bidaiak;

	public Agentzia(int id, String izena, String logoa, String markaKolorea, String erabiltzailea, String pasahitza,
			int langileKop, String mota, ArrayList<Bidaia> bidaiak) {
		super();
		this.id = id;
		this.izena = izena;
		this.logoa = logoa;
		this.markaKolorea = markaKolorea;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.langileKop = langileKop;
		this.mota = mota;
		Bidaiak = bidaiak;
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

	public String getLogoa() {
		return logoa;
	}

	public void setLogoa(String logoa) {
		this.logoa = logoa;
	}

	public String getMarkaKolorea() {
		return markaKolorea;
	}

	public void setMarkaKolorea(String markaKolorea) {
		this.markaKolorea = markaKolorea;
	}

	public String getErabiltzailea() {
		return erabiltzailea;
	}

	public void setErabiltzailea(String erabiltzailea) {
		this.erabiltzailea = erabiltzailea;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public int getLangileKop() {
		return langileKop;
	}

	public void setLangileKop(int langileKop) {
		this.langileKop = langileKop;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public ArrayList<Bidaia> getBidaiak() {
		return Bidaiak;
	}

	public void setBidaiak(ArrayList<Bidaia> bidaiak) {
		Bidaiak = bidaiak;
	}

}
