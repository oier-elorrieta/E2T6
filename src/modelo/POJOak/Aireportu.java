package modelo.POJOak;

public class Aireportu {
	
	//Aireportuen atributoak
	private String aireportu;
	private String hiria;
	
	//Aireportuen sortzailea
	public Aireportu(String aireportu, String hiria) {
		this.aireportu = aireportu;
		this.hiria = hiria;
	}

	//Getter eta Setterrak
	public String getAireportu() {
		return aireportu;
	}

	public void setAireportu(String aireportu) {
		this.aireportu = aireportu;
	}

	public String getHiria() {
		return hiria;
	}

	public void setHiria(String hiria) {
		this.hiria = hiria;
	}

	//ToStringa
	@Override
	public String toString() {
		return "Aireportu [aireportu=" + aireportu + ", hiria=" + hiria + "]";
	}
	
	
}
