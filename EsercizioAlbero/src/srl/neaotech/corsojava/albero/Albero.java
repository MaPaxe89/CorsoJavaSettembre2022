package srl.neaotech.corsojava.albero;

public class Albero {

	public int eta;
	public int altezza;
	public double diamentro;
	public boolean isFruttifero;

	
	public boolean raccolta () {
		
		boolean isRaccoglibileAMano=false;
		
		if (this.altezza<150 && this.isFruttifero==true) {
		System.out.println("Raccoglibile a Mano");
		isRaccoglibileAMano=true;
		
	} 

return isRaccoglibileAMano;	
}
	
}
