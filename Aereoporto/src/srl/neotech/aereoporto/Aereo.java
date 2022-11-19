package srl.neotech.aereoporto;

import java.util.ArrayList;
import java.util.Random;

public class Aereo {

	private Integer idAereo;
	private Integer orario;
	private String compagniaAerea;
	private Integer distanzaAereoporto;
	private Integer velocita;
	private ModelloAereo modelloAereo;
	private Stato stato;
	
	ArrayList <Passeggero> passeggeriDaSbarcare = new ArrayList<Passeggero>();	
	
	public Aereo(ModelloAereo modelloAereo, Stato stato) {
		super();
		this.modelloAereo = modelloAereo;
		Random r = new Random();
		//id
		int generatoreId = r.nextInt(2500);;
		this.idAereo=generatoreId;
		// velocita
		int velocita = r.nextInt(1,11);
		this.velocita=velocita;
		// compagnia
		int sceltaCompagnia = r.nextInt(4);		
		if(sceltaCompagnia==0)this.compagniaAerea="Alitalia";
		if(sceltaCompagnia==1)this.compagniaAerea="AirFrance";
		if(sceltaCompagnia==2)this.compagniaAerea="Lufthansa";
		if(sceltaCompagnia==3)this.compagniaAerea="Ryanair";
		//distanza aereoporto
		int distanza = r.nextInt(355,500);
		this.distanzaAereoporto=distanza;
		// orario
		int ora = r.nextInt(10,20);
		this.orario = ora;
		
		this.stato=stato;
		
	}

	public ModelloAereo getModelloAereo() {
		return modelloAereo;
	}

	public void setModelloAereo(ModelloAereo modelloAereo) {
		this.modelloAereo = modelloAereo;
	}

		

	public Integer getDistanzaAereoporto() {
		return distanzaAereoporto;
	}

	public void setDistanzaAereoporto(Integer distanzaAereoporto) {
		this.distanzaAereoporto = distanzaAereoporto;
	}

	public Integer getIdAereo() {
		return idAereo;
	}

	public void setIdAereo(Integer idAereo) {
		this.idAereo = idAereo;
	}

	public Integer getOrario() {
		return orario;
	}

	public void setOrario(Integer orario) {
		this.orario = orario;
	}

	public String getCompagniaAerea() {
		return compagniaAerea;
	}

	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}

	

	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeriDaSbarcare;
	}

	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeriDaSbarcare = passeggeri;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
	

	public ArrayList<Passeggero> getPasseggeriDaSbarcare() {
		return passeggeriDaSbarcare;
	}

	public void setPasseggeriDaSbarcare(ArrayList<Passeggero> passeggeriDaSbarcare) {
		this.passeggeriDaSbarcare = passeggeriDaSbarcare;
	}

	@Override
	public String toString() {
		return "Aereo [idAereo=" + idAereo + ", orario=" + orario + ", compagniaAerea=" + compagniaAerea
				+ ", distanzaAereoporto=" + distanzaAereoporto + ", velocita=" + velocita + ", modelloAereo="
				+ modelloAereo + ", passeggeri=" + passeggeriDaSbarcare + ", stato=" + stato + "]";
	}
	
	

	

	
	
	
	
	
	
	
	
}
