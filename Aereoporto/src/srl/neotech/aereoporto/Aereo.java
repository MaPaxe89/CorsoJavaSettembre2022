package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Aereo {

	private Integer idAereo;
	private Integer orario;
	private String compagniaAerea;
	private Integer distanzaAereoporto;
	private ModelloAereo modello;
	private Integer velocita;
	
	ArrayList <Passeggero> passeggeri = new ArrayList<Passeggero>();
	
	private Stato stato;
	
	

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

	public ModelloAereo getModello() {
		return modello;
	}

	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}

	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public ArrayList<Passeggero> getPasseggeri() {
		return passeggeri;
	}

	public void setPasseggeri(ArrayList<Passeggero> passeggeri) {
		this.passeggeri = passeggeri;
	}

	public Stato getStato() {
		return stato;
	}

	public void setStato(Stato stato) {
		this.stato = stato;
	}
	
	
	
	
	
}
