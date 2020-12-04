package optional;

public class SafetyPack extends Optional{
	
	private final static int code = 28384;
	private final static String descrizione = "dispositivo di frenata automatica";
	private final static double valore = 76;
	
	public SafetyPack(){
		super(code, descrizione, valore);
	}
	
	public String toString() {
		return "\n\nNome optional: Safety pack" + super.toString();
	}

}
