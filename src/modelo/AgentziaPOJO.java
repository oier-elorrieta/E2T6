package modelo;

public class AgentziaPOJO {
	
	private String izena;
	private String pasahitza;
	private String markaKolorea;
	private int langileKop;
	private String logoa;
	private String mota;

	public AgentziaPOJO(String izena, String pasahitza, String markaKolorea, int langileKop, String logoa,
			String mota) {
		super();
		this.izena = izena;
		this.pasahitza = pasahitza;
		this.markaKolorea = markaKolorea;
		this.langileKop = langileKop;
		this.logoa = logoa;
		this.mota = mota;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	public String getMarkaKolorea() {
		return markaKolorea;
	}

	public void setMarkaKolorea(String markaKolorea) {
		this.markaKolorea = markaKolorea;
	}

	public int getLangileKop() {
		return langileKop;
	}

	public void setLangileKop(int langileKop) {
		this.langileKop = langileKop;
	}

	public String getLogoa() {
		return logoa;
	}

	public void setLogoa(String logoa) {
		this.logoa = logoa;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}
}
