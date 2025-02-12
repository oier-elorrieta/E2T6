package modelo.POJOak;


public class Agentzia {
	
	//Agentziaren atributo guztiak
	private int id;
	private String izena;
	private String logoa;
	private String markaKolorea;
	private String erabiltzailea;
	private String pasahitza;
	private String langileKop;
	private String mota;	

	//agentziaren sortzailea
	public Agentzia(int id, String izena, String logoa, String markaKolorea, String erabiltzailea, String pasahitza,
			String langileKop, String mota) {
		this.id = id;
		this.izena = izena;
		this.logoa = logoa;
		this.markaKolorea = markaKolorea;
		this.erabiltzailea = erabiltzailea;
		this.pasahitza = pasahitza;
		this.langileKop = langileKop;
		this.mota = mota;
	}
	
	//agentziaren beste sortzailea
	public Agentzia() {
		// TODO Auto-generated constructor stub
	}

	//Agentziaren getter eta setter guztiak
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

	public String getLangileKop() {
		return langileKop;
	}

	public void setLangileKop(String langileKop) {
		this.langileKop = langileKop;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	//Agentziaren toString
	@Override
	public String toString() {
		return "Agentzia [id=" + id + ", izena=" + izena + ", logoa=" + logoa + ", markaKolorea=" + markaKolorea
				+ ", erabiltzailea=" + erabiltzailea + ", pasahitza=" + pasahitza + ", langileKop=" + langileKop
				+ ", mota=" + mota + "]";
	}
}
