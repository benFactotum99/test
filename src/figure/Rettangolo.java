package figure;

public class Rettangolo extends Figura{
	
	protected double base;
	protected double altezza;
	
	public Rettangolo(double base, double altezza) { 
		
		super("RETTANGOLO");
		
		this.base  = base;
		this.altezza = altezza;
	}
	
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}	
	
	public double getAltezza() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double area() {
		return base*altezza;
	}
	
	public double perimetro() {
		return 2*(altezza+base);
	}
	
	public void stampaCaratteristiche() {
		System.out.println("Base: " + getBase());
		System.out.println("Altezza: " + getAltezza());
	}
}
