package modelo.POJOak;

public class Herrialde {
	//Atributoak
	private String id;
	private String izena;
	
	//Sortzailea
	public Herrialde(String id, String izena) {
		this.id = id;
		this.izena = izena;
	}

	//Getter eta Setterrak
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}
	
}
