package figure;

public class Figura {
	
	private double area;
	private double perimetro;
	protected String nomeFigura;
	
	public Figura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
	
	public String getNomeFigura() {
		return nomeFigura;
	}
	
	public double area() {
		area = 0;
		return area;
	}
	
	public double perimetro() {
		perimetro = 0;
		return perimetro;
	}
	
	public void stampa() {
		System.out.println("Area: " + area + " perimetro: " + perimetro);
	}

}
