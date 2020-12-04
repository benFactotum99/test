package oggetti;

public class Dado extends OggettoLanciato{
	
	private int valLancio;
	
	public void lancio() {
		
		valLancio = ((int)((Math.random()*6) + 1));
	}
	
	public void stampa() {

		System.out.println("Valore del dado: " + valLancio);
	}

}
