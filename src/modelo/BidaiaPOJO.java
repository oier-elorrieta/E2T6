package modelo;
import java.util.Date;

public class BidaiaPOJO {
	
	private int id;
	private String izena;
	private String mota;
	private Date bidaia_hasi;
	private Date bidaia_amaitu;
	private int egun_kop;
	private String herrialdea;
	private String deskirbapena;
	private String ezDaudenZerbitzuak;
	
	
	public BidaiaPOJO(int id, String izena, String mota, Date bidaia_hasi, Date bidaia_amaitu, int egun_kop,
			String herrialdea, String deskirbapena, String ezDaudenZerbitzuak) {
		this.id = id;
		this.izena = izena;
		this.mota = mota;
		this.bidaia_hasi = bidaia_hasi;
		this.bidaia_amaitu = bidaia_amaitu;
		this.egun_kop = egun_kop;
		this.herrialdea = herrialdea;
		this.deskirbapena = deskirbapena;
		this.ezDaudenZerbitzuak = ezDaudenZerbitzuak;
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

	public int getEgun_kop() {
		return egun_kop;
	}

	public void setEgun_kop(int egun_kop) {
		this.egun_kop = egun_kop;
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

	public String getEzDaudenZerbitzuak() {
		return ezDaudenZerbitzuak;
	}

	public void setEzDaudenZerbitzuak(String zerbitzuak) {
		this.ezDaudenZerbitzuak = zerbitzuak;
	}

	@Override
	public String toString() {
		return "Bidaia: " + izena + "/nMota:" + mota + "/nBidaia_hasi:" + bidaia_hasi
				+ "/tBidaia_amaitu:" + bidaia_amaitu + "/tEgun_kop:" + egun_kop + "/tHerrialdea:" + herrialdea
				+ "/nDeskirbapena:" + deskirbapena + "/nSartuta ez dauden zerbitzuak:" + ezDaudenZerbitzuak;
	}
	
	
}
