package figure;

public class Cerchio extends Figura{
	
	private double raggio;
	
	public Cerchio(double raggio) {
		
		super("CERCHIO");
		this.raggio = raggio;		
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double area() {
		return Math.PI*raggio*raggio;
	}
	
	public double perimetro() {
		return 2*Math.PI*raggio;
	}
	
	public void stampaCaratteristiche() {
		System.out.println("Raggio: " + getRaggio());
	}

}
