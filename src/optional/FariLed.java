package optional;

public class FariLed extends Optional{
	
	private final static int code = 23484;
	private final static String descrizione = "fari led ad alta visibilità e basso consumo";
	private final static double valore = 110;
	
	public FariLed(){
		super(code, descrizione, valore);
	}
	
	public String toString() {
		return "\n\nNome optional: Fari led" + super.toString();
	}

}
