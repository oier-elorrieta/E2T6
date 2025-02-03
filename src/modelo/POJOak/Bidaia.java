package modelo.POJOak;
import java.util.ArrayList;
import java.util.Date;

public class Bidaia {
	
	private int id;
	private String izena;
	private String deskirbapena;
	private Date bidaia_hasi;
	private Date bidaia_amaitu;
	private String herrialdea;
	private String mota;
	private ArrayList<Zerbitzua> Zerbitzuak;
	
	
	
	public Bidaia(int id, String izena, String deskirbapena, java.sql.Date bidaia_hasi, java.sql.Date bidaia_amaitu, String herrialdea, String mota, ArrayList<Zerbitzua> Zerbitzuak) {
		this.id = id;
		this.izena = izena;
		this.deskirbapena = deskirbapena;
		this.bidaia_hasi = bidaia_hasi;
		this.bidaia_amaitu = bidaia_amaitu;
		this.herrialdea = herrialdea;
		this.mota = mota;
		this.Zerbitzuak = Zerbitzuak;
	}
	
	public Bidaia() {
		// TODO Auto-generated constructor stub
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

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Date getBidaia_hasi() {
		return bidaia_hasi;
	}

	public void setBidaia_hasi(Date bidaia_hasi) {
		this.bidaia_hasi = bidaia_hasi;
	}

	public Date getBidaia_amaitu() {
		return bidaia_amaitu;
	}

	public void setBidaia_amaitu(Date bidaia_amaitu) {
		this.bidaia_amaitu = bidaia_amaitu;
	}

	public String getHerrialdea() {
		return herrialdea;
	}

	public void setHerrialdea(String herrialdea) {
		this.herrialdea = herrialdea;
	}

	public String getDeskirbapena() {
		return deskirbapena;
	}

	public void setDeskirbapena(String deskirbapena) {
		this.deskirbapena = deskirbapena;
	}

	@Override
	public String toString() {
		return "Bidaia [id=" + id + ", izena=" + izena + ", deskirbapena=" + deskirbapena + ", bidaia_hasi="
				+ bidaia_hasi + ", bidaia_amaitu=" + bidaia_amaitu + ", herrialdea=" + herrialdea + ", mota=" + mota
				+ ", Zerbitzuak=" + Zerbitzuak + ", getId()=" + getId() + ", getIzena()=" + getIzena() + ", getMota()="
				+ getMota() + ", getBidaia_hasi()=" + getBidaia_hasi() + ", getBidaia_amaitu()=" + getBidaia_amaitu()
				+ ", getHerrialdea()=" + getHerrialdea() + ", getDeskirbapena()=" + getDeskirbapena() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
