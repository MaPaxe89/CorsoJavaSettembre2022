package srl.neotech.gestionebiblioteca;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		
		
		Biblioteca b = new Biblioteca();
		
		
		
		
		Integer generatoreIdLibro = 1;
		for (int i = 0; i<100;i++) {
			
			Libro libroCreato = new Libro(generatoreIdLibro);
			
			/// generatore dati del libro
			int max = 3;
			int min = 0;
			
			int numeroRandom = (int)Math.floor(Math.random()*(max-min+1)+min);
			
				//nomi autore
			String[] nomiAutori = {"Giorgio Faletti", "Nicolas Sparks", "J.K. Rowling", "J.R.R. Tolkien"};
			String nomeAutoreGenerato = nomiAutori[numeroRandom];
			
				//titolo libro
			String[] titoloLibro = {"L'ostaggio", "Il bosco", "Harry Potter", "Il signore degli anelli"};
			String titoloLibroGenerato = titoloLibro[numeroRandom];
			///
			
			
			libroCreato.setAutore(nomeAutoreGenerato);
			libroCreato.setTitolo(titoloLibroGenerato);
			b.listaLibri.add(libroCreato);
			generatoreIdLibro++;
			
			
		}
		
		
		Integer generatoreIdAssociato = 0;
		for (int j = 0; j<100; j++) {
			Associato associatoCreato = new Associato(generatoreIdAssociato);
			
			/// generatore dati Associato
			int max = 3;
			int min = 0;
			
			int numeroRandom = (int)Math.floor(Math.random()*(max-min+1)+min);
			
				//nomi Associato
			String[] nomiAssociato = {"Luca", "Michele", "Giulia", "Fabio"};
			String nomeAssociatoGenerato = nomiAssociato[numeroRandom];
			
			// numero casuale per scelta del libro preso
			Random r = new Random();
			int randomNumber = r.nextInt(100);
			
			associatoCreato.setNome(nomeAssociatoGenerato);
			associatoCreato.listaLibriPresi.add(b.listaLibri.get(randomNumber));
			
			b.listaAssociati.add(associatoCreato);
			
			generatoreIdAssociato++;
			
			
			
		}
		
		// creazione e aggiunta di un nuovo libro
		Libro nuovoLibro = new Libro(generatoreIdLibro);
		nuovoLibro.setAutore("Virginia Woolf");
		nuovoLibro.setTitolo("Hello World");
		b.listaLibri.add(nuovoLibro);
		
		// rimozione libro
		b.listaLibri.remove(15);		
		
		//stampa lista libri con relative info
		System.out.println(b.listaLibri);
		
		// creazione e aggiunta di un nuovo associato e aggiunta di un libro alla lista dei libri presi
				Associato nuovoAssociato = new Associato(generatoreIdAssociato);
				nuovoAssociato.setNome("Federico");
				nuovoAssociato.listaLibriPresi.add(nuovoLibro);
				b.listaAssociati.add(nuovoAssociato);
		
		// stampa lista associati con relative info
		System.out.println(b.listaAssociati);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
