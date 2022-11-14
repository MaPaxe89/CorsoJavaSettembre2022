package srl.neotech.gestionebiblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	
	ArrayList <Libro> listaLibri = new ArrayList<Libro>();
	ArrayList <Associato> listaAssociati = new ArrayList<Associato>();
	public ArrayList<Libro> getListaLibri() {
		return listaLibri;
	}
	public void setListaLibri(ArrayList<Libro> listaLibri) {
		this.listaLibri = listaLibri;
	}
	public ArrayList<Associato> getListaAssiciati() {
		return listaAssociati;
	}
	public void setListaAssiciati(ArrayList<Associato> listaAssiciati) {
		this.listaAssociati = listaAssiciati;
	}
	
	
	
	
}
