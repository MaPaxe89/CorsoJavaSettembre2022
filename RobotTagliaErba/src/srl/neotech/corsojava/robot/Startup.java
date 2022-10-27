package srl.neotech.corsojava.robot;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Campo c = new Campo();
		
		for(int i=1; i<11;i++) {
			
			if(i%2==0) {
				Striscia s = new Striscia ();
				s.setNumeroStriscia(i);
				s.setAltezzaTaglio(10);
				c.listaStrisce.add(s);				
			} else {
				Striscia s1 = new Striscia ();
			    s1.setAltezzaTaglio(5);
			    s1.setNumeroStriscia(i);
			    c.listaStrisce.add(s1);
			}						
		}
		
		
		Tagliaerba t = new Tagliaerba();
			
		for(Striscia tt : c.listaStrisce) {
			
			t.tagliaStriscia(tt);
			
			
			
							
			
			
		}
		
		
		
		
	}

}
