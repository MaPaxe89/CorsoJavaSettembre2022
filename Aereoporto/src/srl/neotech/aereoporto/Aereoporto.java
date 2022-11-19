package srl.neotech.aereoporto;

import java.util.ArrayList;


public class Aereoporto {
	
	private Integer raggioDazione;
	
	ArrayList <Passeggero> listaPasseggeri = new ArrayList<Passeggero>();
	ArrayList <Passeggero> imbarcati = new ArrayList <Passeggero>();
	ArrayList <Aereo> listaAereiPartenza = new ArrayList<Aereo>();
	ArrayList <Aereo> listaAereiArrivo = new ArrayList <Aereo>();
	ArrayList <Passeggero> sbarcati = new ArrayList <Passeggero>();
	
	
	
	
	public ArrayList<Passeggero> getSbarcati() {
		return sbarcati;
	}
	public void setSbarcati(ArrayList<Passeggero> sbarcati) {
		this.sbarcati = sbarcati;
	}
	public ArrayList<Passeggero> getImbarcati() {
		return imbarcati;
	}
	public void setImbarcati(ArrayList<Passeggero> imbarcati) {
		this.imbarcati = imbarcati;
	}
	public ArrayList<Aereo> getListaAereiArrivo() {
		return listaAereiArrivo;
	}
	public void setListaAereiArrivo(ArrayList<Aereo> listaAereiArrivo) {
		this.listaAereiArrivo = listaAereiArrivo;
	}
	// atterraggio 
	public Aereo atterraggio( Aereo a , int velocita , int distanza) {		
											
			a.setStato(Stato.ATTERRATO);
				
			return a;
		
	}
	// checkout
	public Passeggero checkOut(Aereo a, Passeggero passeggeroDaSbarcare) {
			
		passeggeroDaSbarcare.setStatoPasseggero(StatoPasseggero.Sbarcato);
		if(passeggeroDaSbarcare.getSesso()=='M') {
			passeggeroDaSbarcare.setHasBagagli(true);
		} else {
			passeggeroDaSbarcare.setHasFiore(true);
		}
		this.sbarcati.add(passeggeroDaSbarcare);
		
		return passeggeroDaSbarcare;
	}
	
	// decollo
	
	public Aereo decollo (Aereo decollato, Integer raggioAzione) {
				
		decollato.setStato(Stato.DECOLLATO);
				
		return decollato;
		
	}
	
	//checkin	
	public Aereo checkin (Aereo a, ArrayList<Passeggero> listaPasseggeri2) {
		for(Passeggero listaPasseggeriDaImbarcare : this.listaPasseggeri ) {			
			
			
			if(listaPasseggeriDaImbarcare.getSesso()=='M') {
				listaPasseggeriDaImbarcare.setHasBagagli(true);
			} else if (listaPasseggeriDaImbarcare.getSesso()=='F'){
				listaPasseggeriDaImbarcare.setHasFiore(true);
			}
			listaPasseggeriDaImbarcare.setStatoPasseggero(StatoPasseggero.Imbarcato);
			;
			this.imbarcati.add(listaPasseggeriDaImbarcare);
			
		}		
		
		
		
		
		a.setStato(Stato.DECOLLATO);
		return  a;
		} 
	
	// getter setter
	
	public Integer getRaggioDazione() {
		return raggioDazione;
	}
	public void setRaggioDazione(Integer raggioDazione) {
		this.raggioDazione = raggioDazione;
	}
	
	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}
	public ArrayList<Aereo> getListaAereiPartenza() {
		return listaAereiPartenza;
	}
	public void setListaAereiPartenza(ArrayList<Aereo> listaAerei) {
		this.listaAereiPartenza = listaAerei;
	}
	
	
	
	
	
	
	

}
