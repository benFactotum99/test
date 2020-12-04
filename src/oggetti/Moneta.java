package oggetti;

public class Moneta extends OggettoLanciato{
	private int valLancio;
	
	public void lancio() {
		valLancio = (int)((Math.random()*2));
	}
	
	public void stampa() {
		
		System.out.print("Valore della moneta: ");
		if(valLancio == 0)
			System.out.println("Testa");
		else if(valLancio == 1)
			System.out.println("Croce");		
	}
}
