package srl.neaotech.corsojava.albero;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Albero a = new Albero();
		a.altezza=120;
		a.isFruttifero=true;
		a.raccolta();
		
		Albero b = new Albero();
		b.altezza=110;
		b.isFruttifero=true;
		b.raccolta();
	}

}
