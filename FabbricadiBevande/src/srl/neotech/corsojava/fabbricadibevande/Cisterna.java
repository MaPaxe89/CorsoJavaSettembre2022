package srl.neotech.corsojava.fabbricadibevande;

public class Cisterna {
		
		private String tipologia;
		private Integer quantita;
		private Integer evapPerDay;
		private Integer livelloGas;
	
		
			
		public Cisterna(String tipologia ) {
			this.tipologia=tipologia;
		}
		
		
		public Integer getQuantita() {
			
			return quantita;
		}
		
		public void setQuantita() {
			double doubleRandomNumber = Math.random() * 1000;
			int randomNumber = (int)doubleRandomNumber;
			this.quantita=randomNumber;
			
		}
		public Integer getEvapPerDay() {
		
			
			return evapPerDay;
		}
		public void setEvapPerDay() {
			double doubleRandomNumber2 = Math.random() * 100;
			int randomNumber2 = (int)doubleRandomNumber2;
			this.evapPerDay = randomNumber2;
		}
		
		
		public Integer getLivelloGas() {
			
			return livelloGas;
		}
		public void setLivelloGas() {
			double doubleRandomNumber3 = Math.random() * 100;
			int randomNumber3 = (int)doubleRandomNumber3;
			this.livelloGas = randomNumber3;
		}
		
		public void evaporazioneGiornaliera(int evaporazione, int livelloGas, int litri) {
			int sogliaGas= 10;
			if (livelloGas < sogliaGas) {
				System.out.println("Benvanda non vendibile, livello gas troppo basso, litri persi: "+litri);
				System.out.println("----------");
			} else if (sogliaGas<livelloGas-evaporazione) {
				int rimanenzaGas = livelloGas-evaporazione;				
				System.out.println("Livello di gas rimanente: "+rimanenzaGas+"è sopra la soglia consentita di:  "+sogliaGas+" - litri vendibili: " + litri);
				System.out.println("----------");
				}else {
					System.out.println("Livello gas sotto la soglia consentita, litri persi "+litri);
					System.out.println("----------");
			}
			
			
						
			
		}
		
		


		public String getTipologia() {
			return tipologia;
		}


		public void setTipologia(String tipologia) {
			this.tipologia = tipologia;
		}
		
		
		
		
}
