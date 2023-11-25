package org.generation.italy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String risposta,bevandaScelta; 
		Float monetaInserita;
		Scanner sc= new Scanner(System.in);
		
      DistributoreBevande dB = new DistributoreBevande();
      System.out.println("Le bevende disponibili sono:");
		dB.elencoBevande();
		do {
		System.out.println("inserirsci la moneta? 0.50/1.00/2.00");
		monetaInserita=Float.parseFloat(sc.nextLine());
			dB.inserisciMoneta(monetaInserita);
	        dB.visualizzaCredito();
	    System.out.println("Vuoi inserire un altra moneta? si/no");
		risposta=sc.nextLine();
		}while(risposta.equals("si"));
		do {
		System.out.println("Scegli una bevanda?");
		bevandaScelta=sc.nextLine();
          dB.erogaBevanda(bevandaScelta);
	
          System.out.println("il tuo credito è:");
	      dB.visualizzaCredito();
	     System.out.println("Vuoi prendere un altra bevanda?");
		 risposta=sc.nextLine();
		}while(risposta.equals("si"));
	
	
	System.out.println("il tuo resto è:");
	dB.visualizzaCredito();
	System.out.println("Arrivederci");
	}
	

	
	
	

}
