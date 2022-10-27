package srl.neotech.corsojava.robot;

public class Tagliaerba {
	
	private Integer passo = 0;
	private Integer altezzaLama;
	private String stato = "In Taglio";
	private Striscia strisciaInElaborazione;
	
	
	
	
	
	
	public Integer getPasso() {
		
		return passo;
	}

	public void setPasso(Integer passo) {
		this.passo = passo;
		
	}

	public Integer getAltezzaLama() {
		return altezzaLama;
	}

	public void setAltezzaLama(Integer altezzaLama) {
		this.altezzaLama = altezzaLama;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Striscia getStrisciaInElaborazione() {
		
		return strisciaInElaborazione;
	}

	public void setStrisciaInElaborazione(Striscia strisciaInElaborazione) {
		this.strisciaInElaborazione = strisciaInElaborazione;
	}

	public void tagliaStriscia(Striscia a){
		
	   
		avanzaDiUnPasso();
	}
	
	private   void avanzaDiUnPasso() {
		
		passo++;
		System.out.println("stato: "+stato+" numero passo: "+passo+strisciaInElaborazione.getNumeroStriscia());
		
		}
		
		 
		 
		
		
	
	
		
		
		
	
	
}

