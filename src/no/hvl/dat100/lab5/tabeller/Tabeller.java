package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i =0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO
	
		throw new UnsupportedOperationException("tilStreng ikke implementert");
	}	
	
	// c)
	public static int summer(int[] tabell) {

		int [] a = tabell;
		int sum = 0;
		/*
		 * første måte ( med en for løkke)
		for (int n =0; n<a.length; n++) {
			sum = sum + a[n];
		}
		*/
		
		
		/*
		 * andre måte å gjøre det på (med en while -løkke)
		 
		int n =0;
		while (n<a.length) {
			sum = sum + a[n];
			
			n++;
		}
		*/
		
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
