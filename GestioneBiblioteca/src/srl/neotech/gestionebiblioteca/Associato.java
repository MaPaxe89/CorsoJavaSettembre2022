package srl.neotech.gestionebiblioteca;

import java.util.ArrayList;

public class Associato {

	private Integer idAssociato;
	private String nome;
	private String stato;
	
	ArrayList <Libro> listaLibriPresi = new ArrayList<Libro>();
	
	
	
	
	
	// costruttore id associato

	@Override
	public String toString() {
		return "Associato [idAssociato=" + idAssociato + ", nome=" + nome + ", stato=" + stato + ", listaLibriPresi="
				+ listaLibriPresi + "]";
	}

	public Associato(Integer idAssociato) {
		super();
		this.idAssociato = idAssociato;
	}

	public Integer getIdAssociato() {
		return idAssociato;
	}

	public void setIdAssociato(Integer idAssociato) {
		this.idAssociato = idAssociato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public ArrayList<Libro> getListaLibriPresi() {
		return listaLibriPresi;
	}

	public void setListaLibriPresi(ArrayList<Libro> listaLibriPresi) {
		this.listaLibriPresi = listaLibriPresi;
	}
	
	
	
	
}
