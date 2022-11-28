package srl.neotech.aereoporto;

import java.util.Random;

public class Startup {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aereoporto a = new Aereoporto();
		a.setRaggioDazione(100);
		
		// modelli di aerei
		ModelloAereo piccolo = new ModelloAereo("Antonov ", 111, 50, 10);
		ModelloAereo medio = new ModelloAereo("British Aerospace", 222, 100, 20);
		ModelloAereo grande = new ModelloAereo("Boing", 333, 200, 30);
		
		// aerei in partenza
		
		for(int j = 0; j<5;j++) {
			Random r = new Random ();			
			int sceltaModello = r.nextInt(2);			
						
			if(sceltaModello == 0) {
				Aereo aereoArrivo = new Aereo(piccolo, Stato.IN_PARTENZA);	
				a.listaAereiPartenza.add(aereoArrivo);						
			 
			} else if (sceltaModello == 1) {
				Aereo aereoArrivo = new Aereo(medio, Stato.IN_PARTENZA);				
				a.listaAereiPartenza.add(aereoArrivo);
				
			} else   {
				Aereo aereoArrivo = new Aereo(grande, Stato.IN_PARTENZA);				
				a.listaAereiPartenza.add(aereoArrivo);
			}					
		}
		
		
		for(Aereo listaAereiPartenza : a.listaAereiPartenza) {
			System.out.println(listaAereiPartenza);
		}	
		
		for(int q=0; q<500; q++) {
			Passeggero p = new Passeggero(StatoPasseggero.CheckinDaFare);
			a.listaPasseggeri.add(p);
		}
		
		
		
		
		//checkin
		
		for(Aereo ll : a.listaAereiPartenza) {
			
			a.checkin(ll, a.listaPasseggeri.get(0));
			System.out.println(ll);
		}
		
		
		
		
		
		// decollo 
		for(Aereo decolloAereiPartenza : a.listaAereiPartenza) {
			System.out.println("Id Aereo:" +decolloAereiPartenza.getIdAereo());
			a.decollo(decolloAereiPartenza, a.getRaggioDazione());
			int kmFatti = 0;
			for(int i = 0; kmFatti< a.getRaggioDazione(); i++) {
				kmFatti = kmFatti+decolloAereiPartenza.getVelocita();
				
				System.out.println("L'Aereo "+decolloAereiPartenza.getIdAereo()+" è a distanza di:"+kmFatti+" blink");
			} if (kmFatti> a.getRaggioDazione()) {
				decolloAereiPartenza.setStato(Stato.FUORI_DA_SPAZIO_AEREO);
				System.out.println("Aereo è passato a: "+decolloAereiPartenza.getStato());
				
			}
			
		}			
		
		//aerei in avvicinamento
		for(int k = 0; k<5;k++) {
			Random r = new Random ();			
			int sceltaModello = r.nextInt(2);
						
			if(sceltaModello == 0) {
				Aereo aereoArrivo = new Aereo(piccolo, Stato.IN_AVVICINAMENTO);	
				a.listaAereiArrivo.add(aereoArrivo);
				
			 
			} else if (sceltaModello == 1) {
				Aereo aereoArrivo = new Aereo(medio, Stato.IN_AVVICINAMENTO);				
				a.listaAereiArrivo.add(aereoArrivo);
				
			} else   {
				Aereo aereoArrivo = new Aereo(grande, Stato.IN_AVVICINAMENTO);				
				a.listaAereiArrivo.add(aereoArrivo);
			}
			
		}
		
		System.out.println("LISTA AEREI ARRIVO");
		
		
				// aggiungiamo passeggeri a ogni aereo in arrivo
		for (Aereo aereiArrivo: a.listaAereiArrivo ) {
			
			for(int q = 0; q<aereiArrivo.getModelloAereo().getCapienzaNumeroPasseggeri();q++) {
				Passeggero p = new Passeggero(StatoPasseggero.CheckoutDaFare);					
				aereiArrivo.passeggeriDaSbarcare.add(p);
				
			}		
			
		}
		
		// stampo tutti gli aerei in arrivo con passeggeri
		for(Aereo listaAereiArrivo : a.listaAereiArrivo) {
			System.out.println(listaAereiArrivo);
		}		
		
		
		
		//avvicinamento
		
		for (Aereo avvicinamento : a.listaAereiArrivo) {
			int somma = 0;
			int rimanenza = avvicinamento.getDistanzaAereoporto() - somma;
			avvicinamento.setDistanzaAereoporto(rimanenza);
			for(int g = 0; avvicinamento.getDistanzaAereoporto()<=0;g++) {
				somma  = somma + avvicinamento.getVelocita();
				
				System.out.println(somma);
				}
			
		}
		
		
		System.out.println("SBARCO DEI PASSEGGERI IN ARRIVO");
		for (Aereo checkout: a.getListaAereiArrivo()) {
			for(int i = 0; i<checkout.getModelloAereo().getCapienzaNumeroPasseggeri();i++) {
				a.checkOut(checkout, checkout.getPasseggeriDaSbarcare().get(i));	
				System.out.println(a.checkOut(checkout, checkout.getPasseggeriDaSbarcare().get(i)));
			}		
			
		}		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
