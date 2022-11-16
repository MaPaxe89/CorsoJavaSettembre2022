package srl.neotech.aereoporto;

public class Passeggero {

	private Integer idPasseggero;
	private Character sesso;
	private Boolean hasFiore;
	private Integer eta;
	private Boolean hasBagagli;
	private ClassePasseggero classePasseggero;
	
	
	
	
	public ClassePasseggero getClassePasseggero() {
		return classePasseggero;
	}
	public void setClassePasseggero(ClassePasseggero classePasseggero) {
		this.classePasseggero = classePasseggero;
	}
	public Integer getIdPasseggero() {
		return idPasseggero;
	}
	public void setIdPasseggero(Integer idPasseggero) {
		this.idPasseggero = idPasseggero;
	}
	
	public Character getSesso() {
		return sesso;
	}
	public void setSesso(Character sesso) {
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
