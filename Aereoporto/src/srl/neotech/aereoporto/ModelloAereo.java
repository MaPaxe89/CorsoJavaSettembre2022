package srl.neotech.aereoporto;

public class ModelloAereo  {
	
	private String costruttore;
	private Integer codiceModello;
	private Integer capienzaNumeroPasseggeri;
	private Integer orario;
		
	public ModelloAereo(String costruttore, Integer codiceModello, Integer capienzaNumeroPasseggeri, Integer orario) {
		super();
		this.costruttore = costruttore;
		this.codiceModello = codiceModello;
		this.capienzaNumeroPasseggeri = capienzaNumeroPasseggeri;
		this.orario = orario;
	}
	
	
	public String getCostruttore() {
		return costruttore;
	}
	public void setCostruttore(String costruttore) {
		this.costruttore = costruttore;
	}
	public Integer getCodiceModello() {
		return codiceModello;
	}
	public void setCodiceModello(Integer codiceModello) {
		this.codiceModello = codiceModello;
	}
	public Integer getCapienzaNumeroPasseggeri() {
		return capienzaNumeroPasseggeri;
	}
	public void setCapienzaNumeroPasseggeri(Integer capienzaNumeroPasseggeri) {
		this.capienzaNumeroPasseggeri = capienzaNumeroPasseggeri;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	
	@Override
	public String toString() {
		return "ModelloAereo [costruttore=" + costruttore + ", codiceModello=" + codiceModello
				+ ", capienzaNumeroPasseggeri=" + capienzaNumeroPasseggeri + ", orario=" + orario + "]";
	}
	
	
	

}
