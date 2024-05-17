package javaCiclabile;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	System.out.println("========DISCALIMER========\nPreghiamo i gentili utenti di "
			+ "utilizzare gli scanner nella maniera\npiu' educata possibile. Non e' ancora"
			+ " stato implementato un sistema\ndi validazione e i nostri scanner potrebbero "
			+ "reagire male.\nDiciamo 'no' alla violenza contro gli scanner."
			+ "\n==========================");
	Scanner input = new Scanner(System.in);
	int[] elencoCostr = {54,74,98,63};
	Elenco elenco = new Elenco(elencoCostr);
//toString artigianale pigro di testing
	for (int i = 0; i < elenco.getElementi().length; i++) {
		System.out.println(elenco.getElementi()[i]);
	}
	System.out.println("Numero slots: " + elenco.getSlots());
	
	int menu = 0;
	System.out.println();
	menu = ui();
	while(menu != 0 ) {
		switch(menu) {
		case 1: System.out.println(elenco.getElementoSuccessivo());
		menu = ui();
		break;
		
		case 2: System.out.println(elenco.hasAncoraElementi() == true ? "Si" : "no");
		menu = ui();
		break;
		
		case 3: System.out.println(elenco.getElementoAttuale());
		menu = ui();
		break;
		
		case 4: System.out.println("Quale numero vuoi aggiungere?");
		
		menu = ui();
		break;
		default: System.out.println("Valore inserito non valido.");
		menu = ui();
		}
	}
}
public static int ui() {
	Scanner input = new Scanner(System.in);
	int menu;
//		Uso una variabile di appoggio in modo che nel metodo stesso posso aggiungere
//		uno scanner nextLine() per non inchiodare lo scanner. avrei potuto usare lo
//		scanner nextInt come return ma devono ancora fixarlo, o avrei dovuto metter uno
//		scanner nextLine per ogni menu = piu' righe di codice
	System.out.println("\nCosa vuoi fare?"
			+ "\n1. Numero Successivo"
			+ "\n2. Ci sono altri numeri successivi?"
			+ "\n3. Numero attuale"
			+ "\n4. Aggiungi numero"
			+ "\n0. Esci");
	menu = input.nextInt();
	input.nextLine();
	return menu;
	}
}
