package main;

import java.util.Scanner;
import figure.Figura;
import figure.Cerchio;
import figure.Rettangolo;
import figure.Quadrato;
import figure.Triangolo;
import figure.TriangoloRettangolo;

public class mainFigure {

	public static void main(String[] args) {
		
		int sceltaMenuFigure;
		int sceltaMenuRettangolo;
		int sceltaMenuQuadrato;
		int sceltaMenuTriangolo;
		int sceltaMenuTriangoloRettangolo;
		int sceltaMenuCerchio;
		
		double baseRett;
		double altezzaRett;
		
		double latoQuadr;
		
		double lato1Tri;
		double lato2Tri;
		double baseTri;
		double altezzaTri;
		
		double catetoMaggiore;
		double catetoMinore;
		double ipotenusa;
		
		double raggio;
		
		Rettangolo rettangolo = new Rettangolo(5, 6); //base, altezza
		Quadrato quadrato = new Quadrato(5); //lato
		Triangolo triangolo = new Triangolo(2,3,4,5); //lato1, lato2, base, altezza
		TriangoloRettangolo triangoloRettangolo = new TriangoloRettangolo(5, 3, 4); //ipotenusa, cateto minore, cateto maggiore
		Cerchio cerchio = new Cerchio(4); //raggio
		
		Scanner input = new Scanner(System.in);
				
		do {
			
			System.out.println("\nMENU'");
			System.out.println("1) Rettangolo.");
			System.out.println("2) Quadrato.");
			System.out.println("3) Triangolo.");
			System.out.println("4) Triangolo rettangolo.");
			System.out.println("5) Cerchio.");
			System.out.println("0) EXIT.");
			System.out.print("Inserire numero: ");
	
			sceltaMenuFigure = input.nextInt();
			
			switch(sceltaMenuFigure) {
				
				case 1:
					
					do {
						
						System.out.println("\nHAI SELEZIONATO: " + rettangolo.getNomeFigura() + ".");
						rettangolo.stampaCaratteristiche();
						System.out.println("1) Modifica base.");
						System.out.println("2) Modifica altezza.");
						System.out.println("3) Calcola Area.");
						System.out.println("4) Calcola Perimetro.");
						System.out.println("0) EXIT.");
						System.out.print("Inserire numero: ");
						
						sceltaMenuRettangolo = input.nextInt();
						
						switch(sceltaMenuRettangolo) {
						
							case 1:
								System.out.print("Inserire la nuova base: ");
								baseRett = input.nextDouble();
								rettangolo.setBase(baseRett);
								break;
							
							case 2:
								System.out.print("Inserire la nuova altezza: ");
								altezzaRett = input.nextDouble();
								rettangolo.setAltezza(altezzaRett);
								break;
							
							case 3:
								System.out.println("Area del rettangolo: " + rettangolo.area());
								break;
							
							case 4:
								System.out.println("Perimetro del rettangolo: " + rettangolo.perimetro());
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("Carattere NON CONSENTITO!\n");
								break;
						}
						
						
					}while(sceltaMenuRettangolo != 0);
					break;
				
				case 2:
					do {
						
						System.out.println("\nHAI SELEZIONATO: " + quadrato.getNomeFigura() + ".");
						quadrato.stampaCaratteristiche();
						System.out.println("1) Modifica lato.");
						System.out.println("2) Calcola Area.");
						System.out.println("3) Calcola Perimetro.");
						System.out.println("0) EXIT.");
						System.out.print("Inserire numero: ");
						
						sceltaMenuQuadrato = input.nextInt();
						
						switch(sceltaMenuQuadrato) {
						
							case 1:
								System.out.print("Inserire il nuovo lato: ");
								latoQuadr = input.nextDouble();
								quadrato.setLato(latoQuadr);
								break;
							
							case 2:
								System.out.println("Area del quadrato: " + quadrato.area());
								break;
							
							case 3:
								System.out.println("Perimetro del quadrato: " + quadrato.perimetro());
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("Carattere NON CONSENTITO!\n");
								break;
						}
						
						
					}while(sceltaMenuQuadrato != 0);
					break;
				
				case 3:
					do {
						
						System.out.println("\nHAI SELEZIONATO: " + triangolo.getNomeFigura() + ".");
						triangolo.stampaCaratteristiche();
						System.out.println("1) Modifica 1^ lato.");
						System.out.println("2) Modifica 2^ lato.");
						System.out.println("3) Modifica base.");
						System.out.println("4) Modifica altezza.");
						System.out.println("5) Calcola Area.");
						System.out.println("6) Calcola Perimetro.");
						System.out.println("0) EXIT.");
						System.out.print("Inserire numero: ");
						
						sceltaMenuTriangolo = input.nextInt();
						
						switch(sceltaMenuTriangolo) {
						
							case 1:
								System.out.print("Inserire il nuovo 1^ lato: ");
								lato1Tri = input.nextDouble();
								triangolo.setLato1(lato1Tri);
								break;
							
							case 2:
								System.out.print("Inserire il nuovo 2^ lato: ");
								lato2Tri = input.nextDouble();
								triangolo.setLato2(lato2Tri);
								break;
								
							case 3:
								System.out.print("Inserire la nuova base: ");
								baseTri = input.nextDouble();
								triangolo.setBase(baseTri);
								break;
								
							case 4:
								System.out.print("Inserire la nuova altezza: ");
								altezzaTri = input.nextDouble();
								triangolo.setAltezza(altezzaTri);
								break;
								
							case 5:
								System.out.println("Area del triangolo: " + triangolo.area());
								break;
							
							case 6:
								System.out.println("Perimetro del triangolo: " + triangolo.perimetro());
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("Carattere NON CONSENTITO!\n");
								break;
						}
						
						
					}while(sceltaMenuTriangolo != 0);
					break;
				
				case 4:
					do {
						
						System.out.println("\nHAI SELEZIONATO: " + triangoloRettangolo.getNomeFigura() + ".");
						triangoloRettangolo.stampaCaratteristiche();
						System.out.println("1) Modifica cateto maggiore.");
						System.out.println("2) Modifica cateto minore.");
						System.out.println("3) Modifica ipotenusa.");
						System.out.println("4) Calcola Area.");
						System.out.println("5) Calcola Perimetro.");
						System.out.println("0) EXIT.");
						System.out.print("Inserire numero: ");
						
						sceltaMenuTriangoloRettangolo = input.nextInt();
						
						switch(sceltaMenuTriangoloRettangolo) {
						
							case 1:
								System.out.print("Inserire il nuovo cateto maggiore: ");
								catetoMaggiore = input.nextDouble();
								triangoloRettangolo.setCatetoMaggiore(catetoMaggiore);
								break;
							
							case 2:
								System.out.print("Inserire il nuovo cateto minore: ");
								catetoMinore = input.nextDouble();
								triangoloRettangolo.setCatetoMinore(catetoMinore);
								break;
								
							case 3:
								System.out.print("Inserire la nuova ipotenusa: ");
								ipotenusa = input.nextDouble();
								triangoloRettangolo.setIpotenusa(ipotenusa);
								break;
								
							case 4:
								System.out.println("Area del triangolo rettangolo: " + triangoloRettangolo.area());
								break;
							
							case 5:
								System.out.println("Perimetro del triangolo rettangolo: " + triangoloRettangolo.perimetro());
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("Carattere NON CONSENTITO!\n");
								break;
						}
						
						
					}while(sceltaMenuTriangoloRettangolo != 0);
					break;
				
				case 5:  
					do {
						
						System.out.println("\nHAI SELEZIONATO: " + cerchio.getNomeFigura() + ".");
						cerchio.stampaCaratteristiche();
						System.out.println("1) Modifica raggio.");
						System.out.println("2) Calcola Area.");
						System.out.println("3) Calcola Perimetro.");
						System.out.println("0) EXIT.");
						System.out.print("Inserire numero: ");
						
						sceltaMenuCerchio = input.nextInt();
						
						switch(sceltaMenuCerchio) {
						
							case 1:
								System.out.print("Inserire il nuovo raggio: ");
								raggio = input.nextDouble();
								cerchio.setRaggio(raggio);
								break;
							
							case 2:
								System.out.println("Area del cerchio: " + cerchio.area());
								break;
							
							case 3:
								System.out.println("Perimetro del cerchio: " + cerchio.perimetro());
								break;
								
							case 0:
								break;
								
							default:
								System.out.println("Carattere NON CONSENTITO!\n");
								break;
						}
						
						
					}while(sceltaMenuCerchio != 0);
					break;
					
				case 0:
					break;
					
				default:
					System.out.println("Carattere NON CONSENTITO!\n");
					break;
				
			}
			
		}while(sceltaMenuFigure != 0);

	}

}
