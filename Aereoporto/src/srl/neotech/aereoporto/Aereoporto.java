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
		while (aereoInVolo.getDistanzaAereoporto()<=0) {
			Integer velocita = aereoInVolo.getVelocita();
			Integer distanza = aereoInVolo.getDistanzaAereoporto();
			kmPercorsi = kmPercorsi + velocita;
			Integer rimanenza = aereoInVolo.getDistanzaAereoporto()-kmPercorsi;
			System.out.println(kmPercorsi);
			
		}
			
		
		aereoInVolo.setStato(Stato.ATTERRATO);
		
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
		
		Passeggero passeggeroImbarcato = passeggeroDaImbarcare;
		if (passeggeroImbarcato.getClassePasseggero().getExcelsior() == passeggeroImbarcato.getClassePasseggero().getExcelsior()) {
			passeggeroImbarcato.getClassePasseggero().getExcelsior().setHasChampagne(true);
		} else if (passeggeroImbarcato.getClassePasseggero().getBusiness() == passeggeroImbarcato.getClassePasseggero().getBusiness()) {
			passeggeroImbarcato.getClassePasseggero().getBusiness().setHasGiornale(true);
		} else if (passeggeroImbarcato.getClassePasseggero().getTurista() == passeggeroImbarcato.getClassePasseggero().getTurista()) {
			passeggeroImbarcato.getClassePasseggero().getTurista().setHasAnimale(true);
		}
		
		return passeggeroImbarcato;
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
