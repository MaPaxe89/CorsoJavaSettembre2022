package srl.neotech.morracinese;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Giocatore g1 = new Giocatore();
	
		g1.setNome("Mauro");
		g1.setScelta("carta");
		
		Giocatore g2 = new Giocatore();
		g2.setNome("Marco");
		g2.setScelta("carta");
		
		if(g1.getScelta()=="forbici" && g2.getScelta()=="sasso") {
			System.out.println("il vincitore è "+g2.getNome());
		} else if (g1.getScelta()=="forbici" && g2.getScelta()=="carta") {
			System.out.println("il vincitore è "+g1.getNome());
		}	
			else if (g1.getScelta()=="sasso" && g2.getScelta()=="carta") {
				System.out.println("il vincitore è "+g2.getNome());
		}	else if (g1.getScelta()=="sasso" && g2.getScelta()=="forbici") {
				System.out.println("il vincitore è "+g1.getNome());
		}		
				else if (g1.getScelta()=="forbici" && g2.getScelta()=="carta") {
				System.out.println("il vincitore è "+g1.getNome());
		}		else if (g1.getScelta()=="forbici" && g2.getScelta()=="sasso") {
				System.out.println("il vincitore è "+g2.getNome());
		}
					else if(g1.getScelta()==g2.getScelta()) {
					System.out.println("PAREGGIO: avete fatto la stessa scelta");
		}			
					
		
		
		
		
		
		
		
		
		
	
	}

}
