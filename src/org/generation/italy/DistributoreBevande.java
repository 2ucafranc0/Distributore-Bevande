package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class DistributoreBevande {
  
    
    float credito=0;
	
	Scanner sc= new Scanner(System.in);
	
	
	HashMap<String,Float> bevande = new HashMap<>() {{
	
	put("Fanta",1.50f);
    put("Coca-Cola",1.50f);
	put("Acqua",0.50f);
	put("Powerade",2.50f);
	put("Succo Ace",2.00f);
	}};
	
	public void elencoBevande() {
	for (String n:bevande.keySet())
	System.out.println(n + " " + bevande.get(n) + "€");	
	}
	
	
    public void inserisciMoneta(Float moneta) {
    	if (moneta==0.50f)
    		credito+=0.50;
    	else if (moneta==1.00f)
    		     credito+=1.00;
    	else if (moneta==2.00f)
		     credito+=2.00; 
    }	
    public void visualizzaCredito() {
    
    	System.out.println("Credito totale "+ credito + "€");
    }
    public void erogaBevanda(String bevanda)	 {
    	
    	if(bevande.containsKey(bevanda)){
    	    if (credito>=bevande.get(bevanda)){
    		credito-=bevande.get(bevanda);
    	    System.out.println("la tua bevanda è stata erogata");
    	
    	    }else System.out.println("Credito non sufficente");
    	}else System.out.println("Prodotto non disponibile.");
    }
    }
    
	
	
	

