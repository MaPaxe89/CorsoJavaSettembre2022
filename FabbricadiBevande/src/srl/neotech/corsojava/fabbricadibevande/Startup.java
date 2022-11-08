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
			
		// litri vendibili	
		int sommaLitriVendibili = 0;
			
			for (Cisterna pp : cantina.listaCisterne) {
				
				if(pp.getLivelloGas()>pp.getSoglia()) {
					sommaLitriVendibili = sommaLitriVendibili + pp.getQuantita();
					 
				}
				
				}
				System.out.println("litri vendibili: "+sommaLitriVendibili);
				
		// litri persi
		int litriPersi = 0;
		for (Cisterna i : cantina.listaCisterne) {
			
			int gasRimasto = i.litriPersiSettimana(i.getEvapPerDay(), i.getLivelloGas(), i.getQuantita());
			if (gasRimasto<i.getSoglia()) {
				litriPersi = litriPersi + i.getQuantita();
			}
			
		}
		System.out.println("Somma litri persi: "+litriPersi);
		
		// giorni senza bibita vendibile
		
		int sommaLivelloGas = 0;
		int sommaEvapDay = 0;
		
		int threshold = cantina.listaCisterne.get(1).getSoglia();
		
		
		for (Cisterna k : cantina.listaCisterne) {
			
			sommaLivelloGas = sommaLivelloGas + k.getLivelloGas();
					 
			}
		for (Cisterna q : cantina.listaCisterne) {
			
			sommaEvapDay = sommaEvapDay + q.getEvapPerDay();
					 
			}
		
		int day = 0;
		System.out.println("Livello gas totale cisaterne: "+sommaLivelloGas);
		System.out.println("Livello di Evaporazione totale cisaterne: "+sommaEvapDay);
		
		while( sommaLivelloGas> threshold) {
			sommaLivelloGas = sommaLivelloGas - sommaEvapDay;
			day++;
			System.out.println("GIORNO: "+day+" - Rimanenza Gas: "+sommaLivelloGas);
			
		}
		System.out.println("Totali giorni: "+day);
		
			 		
		
		
	}

}
