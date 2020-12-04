package auto;

import motori.Motore;

public class Coupe extends Automobile{

	public Coupe(String targa, String marca, String modello, Motore motore, int numOptional) {
		super(targa, marca, modello, motore, numOptional);
	}

	@Override
	public String toString() {
		return "\nTipo di auto: Coupè" + super.toString();
	}
}
