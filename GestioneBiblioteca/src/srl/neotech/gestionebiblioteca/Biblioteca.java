package srl.neotech.gestionebiblioteca;

import java.util.ArrayList;

public class Biblioteca {

	
	ArrayList<Libro> listaLibri = new ArrayList <Libro>();
	ArrayList<Associato> listaAssociati = new ArrayList<Associato>();
	
	
	public ArrayList<Libro> getListaLibri() {
		return listaLibri;
	}
	public void setListaLibri(ArrayList<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}
	public ArrayList<Associato> getListaAssociati() {
		return listaAssociati;
	}
	public void setListaAssociati(ArrayList<Associato> listaAssociati) {
		this.listaAssociati = listaAssociati;
	}
	
	
	
}
