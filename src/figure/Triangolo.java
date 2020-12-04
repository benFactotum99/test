package figure;

public class Triangolo extends Figura{
	
	protected double lato1;
	protected double lato2;
	protected double base;
	protected double altezza;
	
	public Triangolo(double lato1, double lato2, double base, double altezza) { 
		
		super("TRIANGOLO");
		
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.base  = base;
		this.altezza = altezza;
	}
	
	public double getLato1() {
		return lato1;
	}
	
	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}
	
	public double getLato2() {
		return lato2;
	}
	
	public void setLato2(double lato2) {
		this.lato2 = lato2;
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
		return lato1+lato2+base;
	}
	
	public void stampaCaratteristiche() {
		System.out.println("1^ lato: " + getLato1());
		System.out.println("2^ lato: " + getLato2());
		System.out.println("Base: " + getBase());
		System.out.println("Altezza: " + getAltezza());
	}
}
