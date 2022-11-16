package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereoporto {
	
	private Integer raggioDazione;
	private Pista pista;
	
	ArrayList <Passeggero> listaPasseggeri = new ArrayList<Passeggero>();
	ArrayList <Aereo> listaAerei = new ArrayList<Aereo>();
	
	
	// atterraggio - checkout
	public Aereo atterraggio( Aereo aereoInVolo) {
		
		
		Integer kmPercorsi = 0;
		while (kmPercorsi <= aereoInVolo.getDistanzaAereoporto()) {
			
			kmPercorsi = kmPercorsi + aereoInVolo.getVelocita();
			
			aereoInVolo.setStato(Stato.ATTERRATO);
		}	
		
		
		return aereoInVolo;
		
	}
	
	public Passeggero checkOut(Passeggero passeggeroDaSbarcare) {
		
		Passeggero passeggeroSbarcato = passeggeroDaSbarcare;
		
		return passeggeroSbarcato;
	
		
	}
	
	// decollo - checkin
	
	public Aereo decollo (Aereo aereoATerra) {
		
		aereoATerra.setStato(Stato.DECOLLATO);
		
		return aereoATerra;
		
	}
	
	public Passeggero checkIn (Aereo inPartenza, Passeggero passeggeroDaImbarcare ) {
		
		
		
		return passeggeroDaImbarcare;
	}
	
	
	
	
	
	
	public Integer getRaggioDazione() {
		return raggioDazione;
	}
	public void setRaggioDazione(Integer raggioDazione) {
		this.raggioDazione = raggioDazione;
	}
	public Pista getPista() {
		return pista;
	}
	public void setPista(Pista pista) {
		this.pista = pista;
	}
	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}
	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}
	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	
	
	
	
	
	
	

}
