package modelo.POJOak;

public class Herrialde {
	
	private String id;
	private String izena;
	
	public Herrialde(String id, String izena) {
		this.id = id;
		this.izena = izena;
	}

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
