package auto;

import motori.Motore;

public class Berlina extends Automobile{


	public Berlina(String targa, String marca, String modello, Motore motore, int numOptional) {
		super(targa, marca, modello, motore, numOptional);
	}

	@Override
	public String toString(){
		return "\nTipo di auto: Berlina" + super.toString();
	}
	
}
