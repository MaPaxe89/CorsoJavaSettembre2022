

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calcolo voto scritto
					int max = 8;
					int min = -8;
					
					int votoScritto = (int)Math.floor(Math.random()*(max-min+1)+min);
					
					
			//calcolo voto orale
					int maxOrale = 24;
					int minOrale = 0;
					
					int votoOrale = (int)Math.floor(Math.random()*(maxOrale-minOrale+1)+min);
					
		Esame e = new Esame();
		
		Voto vScritto = new Voto();
		vScritto.setVoto(votoScritto);
		Voto vOrale = new Voto();
		vOrale.setVoto(votoOrale);
		
		System.out.println("VOTO SCRITTO: "+vScritto.getVoto());
		System.out.println("VOTO ORALE: "+vOrale.getVoto());
		
		e.getListaVoti().add(vScritto);
		e.getListaVoti().add(vOrale);
		
		
		
		
		if (vScritto.getVoto()<=0) {
			System.out.println("Lo studente è stato BOCCIATO");
		
		} else if(vScritto.getVoto() >= 18 && vOrale.getVoto() >=18) {
			System.out.println("Lo studente è stato PROMOSSO");
			
		} else if ((vScritto.getVoto() >0) && (vScritto.getVoto()<18) && (vScritto.getVoto()+vOrale.getVoto()>24) ) {
			System.out.println("Lo studente è stato PROMOSSO");
						
		} else if(vScritto.getVoto()==30 && vOrale.getVoto()==30) {
			System.out.println("Lo studente è stato PROMOSSO con la LODE");
		
		} else System.out.println("Votazione NULLA");
		
		
		
		

	}

}
