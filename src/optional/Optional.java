package optional;

public class Optional {
	
	private int codice;
	private String descrizione;
	private double valore;
	
	public Optional(int codice, String descrizione, double valore) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.valore = valore;		
	}		
	
	public String toString() {
		return "\ncodice: " + codice + 
				"\ndescrizione: " + descrizione + 
				"\nvalore: " + valore + "$.";
	}
}
