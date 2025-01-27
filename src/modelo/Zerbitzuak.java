package modelo;

import java.util.Date;

public class Zerbitzuak {
	
	private String hegaldiIzena;
	private String jatorria;
	private String helmuga;
	private Date hegaldiData;
	private String kod;
	private String aerolinea;
	private double hegaldiPrezioa;
	private Date hegaldiIrteera;
	private Date hegaldiIraupena;
	private String jatorriaBuelta;
	private String helmugaBuelta;
	private Date dataBuelta;
	private String kodBuelta;
	private String aerolineaBuelta;
	private double hegaldiPrezioaBuelta;
	private Date irteeraBuelta;
	private Date iraupenaBbuelta;
	
	private int idOstatua;
	private String ostatuIzena;
	private String logela;
	private String hiria;
	private Date ostatuSarrera;
	private Date ostatuIrteera;
	private double ostatuPrezioa;
	
	private int jardueraId;
	private String jardueraIzena;
	private String jardueraDeskribapena;
	private Date jardueraData;
	private double jardueraPrezioa;
	
	public Zerbitzuak(String hegaldiIzena, String jatorria, String helmuga, Date hegaldiData, String kod,
			String aerolinea, double hegaldiPrezioa, Date hegaldiIrteera, Date hegaldiIraupena) {
		this.hegaldiIzena = hegaldiIzena;
		this.jatorria = jatorria;
		this.helmuga = helmuga;
		this.hegaldiData = hegaldiData;
		this.kod = kod;
		this.aerolinea = aerolinea;
		this.hegaldiPrezioa = hegaldiPrezioa;
		this.hegaldiIrteera = hegaldiIrteera;
		this.hegaldiIraupena = hegaldiIraupena;
	}

	public Zerbitzuak(String hegaldiIzena, String jatorria, String helmuga, Date hegaldiData, String kod,
			String aerolinea, double hegaldiPrezioa, Date hegaldiIrteera, Date hegaldiIraupena, String jatorriaBuelta,
			String helmugaBuelta, Date dataBuelta, String kodBuelta, String aerolineaBuelta,
			double hegaldiPrezioaBuelta, Date irteeraBuelta, Date iraupenaBbuelta) {
		this.hegaldiIzena = hegaldiIzena;
		this.jatorria = jatorria;
		this.helmuga = helmuga;
		this.hegaldiData = hegaldiData;
		this.kod = kod;
		this.aerolinea = aerolinea;
		this.hegaldiPrezioa = hegaldiPrezioa;
		this.hegaldiIrteera = hegaldiIrteera;
		this.hegaldiIraupena = hegaldiIraupena;
		this.jatorriaBuelta = jatorriaBuelta;
		this.helmugaBuelta = helmugaBuelta;
		this.dataBuelta = dataBuelta;
		this.kodBuelta = kodBuelta;
		this.aerolineaBuelta = aerolineaBuelta;
		this.hegaldiPrezioaBuelta = hegaldiPrezioaBuelta;
		this.irteeraBuelta = irteeraBuelta;
		this.iraupenaBbuelta = iraupenaBbuelta;
	}
	
	public Zerbitzuak(int idOstatua, String ostatuIzena, String logela, String hiria, Date ostatuSarrera,
			Date ostatuIrteera, double ostatuPrezioa) {
		this.idOstatua = idOstatua;
		this.ostatuIzena = ostatuIzena;
		this.logela = logela;
		this.hiria = hiria;
		this.ostatuSarrera = ostatuSarrera;
		this.ostatuIrteera = ostatuIrteera;
		this.ostatuPrezioa = ostatuPrezioa;
	}

	public Zerbitzuak(int jardueraId, String jardueraIzena, String jardueraDeskribapena, Date jardueraData,
			double jardueraPrezioa) {
		this.jardueraId = jardueraId;
		this.jardueraIzena = jardueraIzena;
		this.jardueraDeskribapena = jardueraDeskribapena;
		this.jardueraData = jardueraData;
		this.jardueraPrezioa = jardueraPrezioa;
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

	public Date getHegaldiIraupena() {
		return hegaldiIraupena;
	}

	public void setHegaldiIraupena(Date hegaldiIraupena) {
		this.hegaldiIraupena = hegaldiIraupena;
	}

	public String getJatorriaBuelta() {
		return jatorriaBuelta;
	}

	public void setJatorriaBuelta(String jatorriaBuelta) {
		this.jatorriaBuelta = jatorriaBuelta;
	}

	public String getHelmugaBuelta() {
		return helmugaBuelta;
	}

	public void setHelmugaBuelta(String helmugaBuelta) {
		this.helmugaBuelta = helmugaBuelta;
	}

	public Date getDataBuelta() {
		return dataBuelta;
	}

	public void setDataBuelta(Date dataBuelta) {
		this.dataBuelta = dataBuelta;
	}

	public String getKodBuelta() {
		return kodBuelta;
	}

	public void setKodBuelta(String kodBuelta) {
		this.kodBuelta = kodBuelta;
	}

	public String getAerolineaBuelta() {
		return aerolineaBuelta;
	}

	public void setAerolineaBuelta(String aerolineaBuelta) {
		this.aerolineaBuelta = aerolineaBuelta;
	}

	public double getHegaldiPrezioaBuelta() {
		return hegaldiPrezioaBuelta;
	}

	public void setHegaldiPrezioaBuelta(double hegaldiPrezioaBuelta) {
		this.hegaldiPrezioaBuelta = hegaldiPrezioaBuelta;
	}

	public Date getIrteeraBuelta() {
		return irteeraBuelta;
	}

	public void setIrteeraBuelta(Date irteeraBuelta) {
		this.irteeraBuelta = irteeraBuelta;
	}

	public Date getIraupenaBbuelta() {
		return iraupenaBbuelta;
	}

	public void setIraupenaBbuelta(Date iraupenaBbuelta) {
		this.iraupenaBbuelta = iraupenaBbuelta;
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

}