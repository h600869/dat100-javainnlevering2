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
		if(tabell.length == 0)
			return "[]";
		
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

		int posisjon = -1;
		
		for(int e =0; (e<tabell.length) && (posisjon == -1); e++) {
			if(tabell[e] == tall) {
				posisjon = e;
			}
		}
			return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] kopi = new int[tabell.length];
		
		for(int f = tabell.length;f>0; f--) {
			kopi[tabell.length-f] = tabell[f-1];
		}
		
		return kopi;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

			boolean erSortert =false;
			
			if (tabell.length == 1 || tabell.length==0) {
				return true;
			}
			
			for (int g=1; g<tabell.length; g++) {
				if(tabell[g]>=tabell[g-1]) {
					erSortert = true;
				}
				else {
					return false;
				}
			}
			return erSortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int tabell3 = tabell1.length + tabell2.length;
		
		int[] t3 = new int[tabell3];
		
		//første tabell
		for(int h=0; h<tabell1.length; h++){
			t3[h] = tabell1[h];
		}
		
		//andre tabell
		for(int h=0; h<tabell2.length;h++) {
			t3[tabell1.length + h] = tabell2[h];
			
		}
		return t3;
	}
}
