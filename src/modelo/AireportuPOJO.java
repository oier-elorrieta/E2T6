package modelo;

public class AireportuPOJO {
	
	private String id;
	private String izena;
	
	public AireportuPOJO(String id, String izena) {
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
