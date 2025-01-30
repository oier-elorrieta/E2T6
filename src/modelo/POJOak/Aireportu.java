package modelo.POJOak;

public class Aireportu {
	
	private String aireportu;
	private String hiria;
	
	public Aireportu(String aireportu, String hiria) {
		this.aireportu = aireportu;
		this.hiria = hiria;
	}

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

	@Override
	public String toString() {
		return "Aireportu [aireportu=" + aireportu + ", hiria=" + hiria + "]";
	}
	
	
}
