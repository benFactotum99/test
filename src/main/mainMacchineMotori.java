package main;

import java.util.Scanner;

import auto.Berlina;
import auto.Veicolo;
import motori.MotoreBenzina;
import optional.FariLed;
import optional.SafetyPack;
import optional.SoundSystem;

public class mainMacchineMotori {

	public static void main(String[] args) {
		
		int numOptional;
		int scelta;
		Scanner input = new Scanner(System.in);
		
		Veicolo auto = new Berlina("CZ898NF", "Fiat", "Fiat Panda",
				       new MotoreBenzina("Twinair turbo benzina", "Motors",3000,6), 0);

		System.out.println(auto);

		System.out.print("\nQuanti optional vuoi aggiungere?(max 3) ");
		numOptional = input.nextInt();
		auto.setNumOptional(numOptional);
		
		for(int i = 0; i < numOptional; i++) {
			System.out.print("Scegli l'optional (0,1,2): ");
			scelta = input.nextInt();
			switch (scelta){
				case 0:
					auto.setOptional(new SoundSystem());
					break;

				case 1:
					auto.setOptional(new FariLed());
					break;

				case 2:
					auto.setOptional(new SafetyPack());
					break;

				default:
					System.out.println("Carattere NON CONSENTITO!");
			}
		}
		
		System.out.println(auto);
		

	}

}
