package modelo.POJOak;

import java.util.Date;

public class Zerbitzua{

	//Hegaldien atributoak
	private int id_hegaldia;
	private String hegaldiIzena;
	private String jatorria;
	private String helmuga;
	private Date hegaldiData;
	private String kod;
	private String aerolinea;
	private double hegaldiPrezioa;
	private Date hegaldiIrteera;
	private String hegaldiIraupena;
	private int id_buelta;

	//Ostatuen atributoak
	private int idOstatua;
	private String ostatuIzena;
	private String logela;
	private String hiria;
	private Date ostatuSarrera;
	private Date ostatuIrteera;
	private double ostatuPrezioa;

	//Jardueeren atributoak
	private int jardueraId;
	private String jardueraIzena;
	private String jardueraDeskribapena;
	private Date jardueraData;
	private double jardueraPrezioa;
	
	public Zerbitzua(int id_hegaldia, String hegaldiIzena, String jatorria, String helmuga, Date hegaldiData,
			String kod, String aerolinea, double hegaldiPrezioa, Date hegaldiIrteera, String hegaldiIraupena,
			int id_buelta) {
		this.id_hegaldia = id_hegaldia;
		this.hegaldiIzena = hegaldiIzena;
		this.jatorria = jatorria;
		this.helmuga = helmuga;
		this.hegaldiData = hegaldiData;
		this.kod = kod;
		this.aerolinea = aerolinea;
		this.hegaldiPrezioa = hegaldiPrezioa;
		this.hegaldiIrteera = hegaldiIrteera;
		this.hegaldiIraupena = hegaldiIraupena;
		this.id_buelta = id_buelta;
		this.idOstatua=-1;
		this.jardueraId=-1;
		
	}

	public Zerbitzua(int idOstatua, String ostatuIzena, String logela, String hiria, Date ostatuSarrera,
			Date ostatuIrteera, double ostatuPrezioa) {
		this.idOstatua = idOstatua;
		this.ostatuIzena = ostatuIzena;
		this.logela = logela;
		this.hiria = hiria;
		this.ostatuSarrera = ostatuSarrera;
		this.ostatuIrteera = ostatuIrteera;
		this.ostatuPrezioa = ostatuPrezioa;
		this.id_hegaldia=-1;
		this.jardueraId=-1;
	}

	public Zerbitzua(int jardueraId, String jardueraIzena, String jardueraDeskribapena, Date jardueraData,
			double jardueraPrezioa) {
		this.jardueraId = jardueraId;
		this.jardueraIzena = jardueraIzena;
		this.jardueraDeskribapena = jardueraDeskribapena;
		this.jardueraData = jardueraData;
		this.jardueraPrezioa = jardueraPrezioa;
		this.id_hegaldia=-1;
		this.idOstatua=-1;
	}

	
	
	public int getId_hegaldia() {
		return id_hegaldia;
	}

	public void setId_hegaldia(int id_hegaldia) {
		this.id_hegaldia = id_hegaldia;
	}

	public String getHegaldiIzena() {
		return hegaldiIzena;
	}

	public void setHegaldiIzena(String hegaldiIzena) {
		this.hegaldiIzena = hegaldiIzena;
	}

	public String getJatorria() {
		return jatorria;
	}

	public void setJatorria(String jatorria) {
		this.jatorria = jatorria;
	}

	public String getHelmuga() {
		return helmuga;
	}

	public void setHelmuga(String helmuga) {
		this.helmuga = helmuga;
	}

	public Date getHegaldiData() {
		return hegaldiData;
	}

	public void setHegaldiData(Date hegaldiData) {
		this.hegaldiData = hegaldiData;
	}

	public String getKod() {
		return kod;
	}

	public void setKod(String kod) {
		this.kod = kod;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public double getHegaldiPrezioa() {
		return hegaldiPrezioa;
	}

	public void setHegaldiPrezioa(double hegaldiPrezioa) {
		this.hegaldiPrezioa = hegaldiPrezioa;
	}

	public Date getHegaldiIrteera() {
		return hegaldiIrteera;
	}

	public void setHegaldiIrteera(Date hegaldiIrteera) {
		this.hegaldiIrteera = hegaldiIrteera;
	}

	public String getHegaldiIraupena() {
		return hegaldiIraupena;
	}

	public void setHegaldiIraupena(String hegaldiIraupena) {
		this.hegaldiIraupena = hegaldiIraupena;
	}

	public int getId_buelta() {
		return id_buelta;
	}

	public void setId_buelta(int id_buelta) {
		this.id_buelta = id_buelta;
	}
	
	public int getIdOstatua() {
		return idOstatua;
	}

	public void setIdOstatua(int idOstatua) {
		this.idOstatua = idOstatua;
	}

	public String getOstatuIzena() {
		return ostatuIzena;
	}

	public void setOstatuIzena(String ostatuIzena) {
		this.ostatuIzena = ostatuIzena;
	}

	public String getLogela() {
		return logela;
	}

	public void setLogela(String logela) {
		this.logela = logela;
	}

	public String getHiria() {
		return hiria;
	}

	public void setHiria(String hiria) {
		this.hiria = hiria;
	}

	public Date getOstatuSarrera() {
		return ostatuSarrera;
	}

	public void setOstatuSarrera(Date ostatuSarrera) {
		this.ostatuSarrera = ostatuSarrera;
	}

	public Date getOstatuIrteera() {
		return ostatuIrteera;
	}

	public void setOstatuIrteera(Date ostatuIrteera) {
		this.ostatuIrteera = ostatuIrteera;
	}

	public double getOstatuPrezioa() {
		return ostatuPrezioa;
	}

	public void setOstatuPrezioa(double ostatuPrezioa) {
		this.ostatuPrezioa = ostatuPrezioa;
	}

	public int getJardueraId() {
		return jardueraId;
	}

	public void setJardueraId(int jardueraId) {
		this.jardueraId = jardueraId;
	}

	public String getJardueraIzena() {
		return jardueraIzena;
	}

	public void setJardueraIzena(String jardueraIzena) {
		this.jardueraIzena = jardueraIzena;
	}

	public String getJardueraDeskribapena() {
		return jardueraDeskribapena;
	}

	public void setJardueraDeskribapena(String jardueraDeskribapena) {
		this.jardueraDeskribapena = jardueraDeskribapena;
	}

	public Date getJardueraData() {
		return jardueraData;
	}

	public void setJardueraData(Date jardueraData) {
		this.jardueraData = jardueraData;
	}

	public double getJardueraPrezioa() {
		return jardueraPrezioa;
	}

	public void setJardueraPrezioa(double jardueraPrezioa) {
		this.jardueraPrezioa = jardueraPrezioa;
	}

	@Override
	public String toString() {
		return "Zerbitzua [id_hegaldia=" + id_hegaldia + ", hegaldiIzena=" + hegaldiIzena + ", jatorria=" + jatorria
				+ ", helmuga=" + helmuga + ", hegaldiData=" + hegaldiData + ", kod=" + kod + ", aerolinea=" + aerolinea
				+ ", hegaldiPrezioa=" + hegaldiPrezioa + ", hegaldiIrteera=" + hegaldiIrteera + ", hegaldiIraupena="
				+ hegaldiIraupena + ", id_buelta=" + id_buelta + ", idOstatua=" + idOstatua + ", ostatuIzena="
				+ ostatuIzena + ", logela=" + logela + ", hiria=" + hiria + ", ostatuSarrera=" + ostatuSarrera
				+ ", ostatuIrteera=" + ostatuIrteera + ", ostatuPrezioa=" + ostatuPrezioa + ", jardueraId=" + jardueraId
				+ ", jardueraIzena=" + jardueraIzena + ", jardueraDeskribapena=" + jardueraDeskribapena
				+ ", jardueraData=" + jardueraData + ", jardueraPrezioa=" + jardueraPrezioa + "]";
	}
	
	

}
