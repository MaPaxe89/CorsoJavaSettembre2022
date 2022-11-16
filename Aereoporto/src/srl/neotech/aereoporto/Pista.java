package srl.neotech.aereoporto;

import java.util.ArrayList;

public class Pista {

	ArrayList<Aereo> listaAereiPartenza = new ArrayList <Aereo>();
	ArrayList<Aereo> listaAereiArrivo = new ArrayList <Aereo>();
	
	
	public ArrayList<Aereo> getListaAereiPartenza() {
		return listaAereiPartenza;
	}
	public void setListaAereiPartenza(ArrayList<Aereo> listaAereiPartenza) {
		this.listaAereiPartenza = listaAereiPartenza;
	}
	public ArrayList<Aereo> getListaAereiArrivo() {
		return listaAereiArrivo;
	}
	public void setListaAereiArrivo(ArrayList<Aereo> listaAereiArrivo) {
		this.listaAereiArrivo = listaAereiArrivo;
	}
	
	

	
}
