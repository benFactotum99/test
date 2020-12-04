package figure;

public class Quadrato extends Rettangolo {
	
	public Quadrato(double lato) { 
		super(lato, lato);
		nomeFigura = "QUADRATO";
	}
	
	public double getLato() {
		return base;
	}
	
	public void setLato(double lato) {
		this.base = lato;
		this.altezza = lato;
	}
	
	public double perimetro() {
		return 4*base;
	}
	
	public void stampaCaratteristiche() {
		System.out.println("Lato: " + getLato());
	}
	
}
