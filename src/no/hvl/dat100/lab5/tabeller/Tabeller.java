package no.hvl.dat100.lab5.tabeller;

import java.lang.reflect.Array;
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

		// int[] tabell = new int[tabel.length];

		String s = "";

		for (int i = 0; i < tabell.length - 1; i++) {

			s += tabell[i] + ",";

		}

		s += tabell[tabell.length - 1];
		String s2 = "[" + s + "]";
		return s2;
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
		
		/*
		 * tredje måte å gjøre det på (med en utvidet for - løkke)
		for (int A:a) {
			sum = sum + A;
		}
		
		*/
		
		return sum;
		
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean fant = false;
		
		for (int d =0; d<tabell.length; d++) {
			if(tabell[d] == tall) {
				fant = true;
			}
			
		}
		
		return fant;
		
		
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
