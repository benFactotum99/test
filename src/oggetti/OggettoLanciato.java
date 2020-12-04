package oggetti;

public class OggettoLanciato {
	
	private int valLancio;
	
	public int get() {
		return valLancio;
	}
	
	public void lancio() {
		this.valLancio = 0; 
	}
	
	public void stampa() {
		System.out.println(valLancio);
	}
}
