package optional;

public class SoundSystem extends Optional{
	
	private final static int code = 19284;
	private final static String descrizione = "suono di alta qualità";
	private final static double valore = 160;
	
	public SoundSystem(){
		super(code, descrizione, valore);
	}
	
	public String toString() {
		return "\n\nNome optional: Sound system" + super.toString();
	}
}
