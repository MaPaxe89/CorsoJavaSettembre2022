package srl.neotech.aereoporto;

import java.util.Random;

public class Passeggero {

	private Integer idPasseggero;
	private char sesso;
	private Boolean hasFiore;
	private Integer eta;
	private Boolean hasBagagli;	
	private StatoPasseggero statoPasseggero;
	
	
	public Passeggero(StatoPasseggero statoPasseggero) {
		super();
		this.statoPasseggero = statoPasseggero;
		Random r = new Random();
		//id
		int id = r.nextInt(2500);
		this.idPasseggero=id;
		// eta
		int eta = r.nextInt(15,65);
		this.eta = eta;
		
		// sesso
		int sceltaSesso = r.nextInt(2);
		if(sceltaSesso == 1) {
			this.setSesso('M');
		} else if (sesso==0) {
			this.setSesso('F');
		}
		
		
		
	}
	@Override
	public String toString() {
		return "Passeggero [idPasseggero=" + idPasseggero + ", sesso=" + sesso + ", hasFiore=" + hasFiore + ", eta="
				+ eta + ", hasBagagli=" + hasBagagli + ", statoPasseggero=" + statoPasseggero + "]";
	}
	public StatoPasseggero getStatoPasseggero() {
		return statoPasseggero;
	}
	public void setStatoPasseggero(StatoPasseggero statoPasseggero) {
		this.statoPasseggero = statoPasseggero;
	}
	public Integer getIdPasseggero() {
		return idPasseggero;
	}
	public void setIdPasseggero(Integer idPasseggero) {
		this.idPasseggero = idPasseggero;
	}
	
	
	
	public char getSesso() {
		return sesso;
	}
	public void setSesso(char sesso) {
		this.sesso = sesso;
	}
	public Boolean getHasFiore() {
		return hasFiore;
	}
	public void setHasFiore(Boolean hasFiore) {
		this.hasFiore = hasFiore;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public Boolean getHasBagagli() {
		return hasBagagli;
	}
	public void setHasBagagli(Boolean hasBagagli) {
		this.hasBagagli = hasBagagli;
	}
	
	
	
	
	
	
	
	
	
	
	
}
