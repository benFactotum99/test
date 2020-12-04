package auto;

import motori.Motore;
import optional.Optional;

import java.util.Vector;

public class Automobile extends Veicolo implements Veicoli {

	private String strOptional = "non ci sono optional.";
	private int numOptional = 0;
	
	private Vector<Optional> optional = new Vector<optional.Optional>();

	private Motore motore;

	public Automobile(String targa, String marca, String modello, Motore motore, int numOptional) {
		super(targa, marca, modello);
		//this.motore = motore;
		this.setNumOptional(numOptional);
		this.motore = motore;
	}

	public int getNumOptional() {
		return numOptional;
	}

	public void setNumOptional(int numOptional) {
		this.numOptional = numOptional;
	}

	@Override
	public void setOptional(optional.Optional optional) { this.optional.add(optional); }

	@Override
	public String toString() {
		
		if(numOptional != 0) strOptional = "";
		
		for(int i = 0; i < numOptional; i++)
			strOptional = strOptional + optional.get(i);
		
		return super.toString() + motore + "\nnumero di optional: " + numOptional + "\n" + strOptional;
	}
}
