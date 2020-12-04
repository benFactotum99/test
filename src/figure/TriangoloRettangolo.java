package figure;

public class TriangoloRettangolo extends Triangolo{

	public TriangoloRettangolo(double ipotenusa, double catetoMinore, double catetoMaggiore){
		super(ipotenusa, catetoMinore, catetoMaggiore, catetoMinore);
		nomeFigura = "TRIANGOLO RETTANGOLO";
	}
	
	public double getCatetoMaggiore() {
		return altezza;
	}
	
	public void setCatetoMaggiore(double catetoMaggiore) {
		altezza = catetoMaggiore;
	}
	
	public double getCatetoMinore() {
		return base;
	}
	
	public void setCatetoMinore(double catetoMinore) {
		base = catetoMinore;
	}
	
	public double getIpotenusa() {
		return lato1;
	}
	
	public void setIpotenusa(double ipotenusa) {
		lato1 = ipotenusa;
	}
	
	public double perimetro() {
		return lato1+altezza+base;
	}
	
	public void stampaCaratteristiche() {
		System.out.println("Cateto maggiore: " + getCatetoMaggiore());
		System.out.println("Cateto minore: " + getCatetoMinore());
		System.out.println("Ipotenusa: " + getIpotenusa());
	}

}
