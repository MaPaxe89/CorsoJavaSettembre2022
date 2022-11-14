package srl.neotech.gestionebiblioteca;

import java.util.ArrayList;

public class Associato {

	private Integer idAssociato;
	private String nominativo;
	private String stato;
	
	ArrayList<Libro> listaIdLIbriPresi = new ArrayList<Libro>();

	public Integer getIdAssociato() {
		return idAssociato;
	}

	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}

	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public ArrayList<Libro> getListaIdLIbriPresi() {
		return listaIdLIbriPresi;
	}

	public void setListaIdLIbriPresi(ArrayList<Libro> listaIdLIbriPresi) {
		this.listaIdLIbriPresi = listaIdLIbriPresi;
	}

	@Override
	public String toString() {
		return "Associato [idAssociato=" + idAssociato + ", nominativo=" + nominativo + ", stato=" + stato
				+ ", listaIdLIbriPresi=" + listaIdLIbriPresi + "]";
	}
	
	
	
		
}
