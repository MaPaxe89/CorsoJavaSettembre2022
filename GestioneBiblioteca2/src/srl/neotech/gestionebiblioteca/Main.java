package srl.neotech.gestionebiblioteca;

import com.github.javafaker.Faker;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Biblioteca b = new Biblioteca();
		
		Integer generatoreIdLibro = 0;
		for(int i = 0; i<100; i++) {
			
			Libro libroCreato = new Libro();
			
			// nome autore
			Faker faker = new Faker();
			String nomeAutore = faker.name().fullName();
			
			libroCreato.setAutore(nomeAutore);
			
			//titolo
			Faker fakerTitolo = new Faker();
			String titolo = faker.name().fullName();
			
			libroCreato.setTitolo(titolo);
			
			// sezione
			int max = 4;
			int min = 0;		
			int numeroRandom = (int)Math.floor(Math.random()*(max-min+1)+min);
			
			if(numeroRandom == 0) {
				libroCreato.setSezione(Sezione.Fantasy);
				
			} else if(numeroRandom == 1){
				libroCreato.setSezione(Sezione.Giallo);
				
			} else if ( numeroRandom == 2) {
				libroCreato.setSezione(Sezione.Horror);

			} else libroCreato.setSezione(Sezione.Romanzo);
			
			
			generatoreIdLibro++;
			
			libroCreato.setIdLibro(generatoreIdLibro);
			// aggiungo il libro alla lista
			b.listaLibri.add(libroCreato);
			
									
		}
		
		//stampo lista libri		
		System.out.println(b.listaLibri);
		
		
		//rimuovo un libro
		int numeroRandom = (int)Math.floor(Math.random()*(100-0)+0);
		System.out.println(numeroRandom);
		b.listaLibri.remove(numeroRandom);
		System.out.println(b.listaLibri);
		
		Integer generatoreIdAssociato = 0;
		for (int j = 0; j<100;j++) {
			
			Associato nuovoAssociato = new Associato();
			
			// nome associato
			Faker fakerAssociato = new Faker();
			String nomeAssociato = fakerAssociato.name().fullName();
			
			nuovoAssociato.setNominativo(nomeAssociato);
			
			//id associato
			nuovoAssociato.setIdAssociato(generatoreIdAssociato);
			generatoreIdAssociato++;
			
			b.listaAssociati.add(nuovoAssociato);
			
			// aggiunta libro casuale alla lista dei libri presi
			int numeroRandom2 = (int)Math.floor(Math.random()*(99-0)+0);
			nuovoAssociato.listaIdLIbriPresi.add(b.listaLibri.get(numeroRandom2));
	
			
			
			
		}
		
		System.out.println(b.listaAssociati);
		
		
		
		
		
			
	}

}
