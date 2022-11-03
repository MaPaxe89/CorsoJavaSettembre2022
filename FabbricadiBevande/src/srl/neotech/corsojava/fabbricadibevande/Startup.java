package srl.neotech.corsojava.fabbricadibevande;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cantina cantina = new Cantina();
		
						
		for(int i = 0; i<100; i++) {
			Random r = new Random ();
			int randomNumber = r.nextInt(3);
					
			if (randomNumber==0) {
				Cisterna c1 = new Cisterna ("ALLUMINIO");
				c1.setQuantita();
				c1.setEvapPerDay();
				c1.setLivelloGas();
				
				cantina.listaCisterne.add(c1);
		
				System.out.println("Ho inserito una cisterna di "+c1.getTipologia()+" di quantita "+c1.getQuantita()+" - livello gas: "+c1.getLivelloGas()+" - evaporazione:"+c1.getEvapPerDay());								
				c1.evaporazioneGiornaliera(c1.getEvapPerDay(), c1.getLivelloGas(), c1.getQuantita());
				
				
			} else if (randomNumber==1) {
				Cisterna c2 = new Cisterna ("RAME");
				c2.setQuantita();
				c2.setEvapPerDay();
				c2.setLivelloGas();
				
				cantina.listaCisterne.add(c2);
				
				System.out.println("Ho inserito una cisterna di "+c2.getTipologia()+" di quantita "+c2.getQuantita()+" - livello gas: "+c2.getLivelloGas()+" - evaporazione:"+c2.getEvapPerDay());								
				c2.evaporazioneGiornaliera(c2.getEvapPerDay(), c2.getLivelloGas(), c2.getQuantita());
				
			} else if (randomNumber==2) {
				Cisterna c3 = new Cisterna ("ACCIAIO");
				c3.setQuantita();
				c3.setEvapPerDay();
				c3.setLivelloGas();
				
				cantina.listaCisterne.add(c3);
				
				System.out.println("Ho inserito una cisterna di "+c3.getTipologia()+" di quantita "+c3.getQuantita()+" - livello gas: "+c3.getLivelloGas()+" - evaporazione:"+c3.getEvapPerDay());								
				c3.evaporazioneGiornaliera(c3.getEvapPerDay(), c3.getLivelloGas(), c3.getQuantita());
				
			}
		} 
			
			
			for (Cisterna pp : cantina.listaCisterne) {
				
				int evaporazioneSettimanale = pp.getEvapPerDay()*7;
				int differenza = pp.getLivelloGas()-evaporazioneSettimanale;
				if (differenza<pp.getSoglia()) {
					System.out.println("Livello di gas rimanente fra 7 gg: "+differenza+" livello troppo basso per la vendita, litri persi:"+pp.getQuantita());
				}
				
				}
				
			
	}

}
