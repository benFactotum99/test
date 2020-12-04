package main;

import java.util.Scanner;
import oggetti.Dado;
import oggetti.Moneta;

public class mainProgramDadoMoneta {

	public static void main(String[] args) {
		
		int scelta;
		
		Scanner input = new Scanner(System.in);
		//OggettoLanciato oggetto = new OggettoLanciato();
		
		Dado dado = new Dado();
		Moneta moneta = new Moneta();
		
		System.out.print("Che oggetto intendi lanciare?");
		System.out.print(" [1 Dado, 2 Moneta]: ");
		
		scelta = input.nextInt();
		
		if(scelta == 1) {
			dado.lancio();
			dado.stampa();
		}
		
			
		else if(scelta == 2) { 
			moneta.lancio();
			moneta.stampa();
		}
	}

}

