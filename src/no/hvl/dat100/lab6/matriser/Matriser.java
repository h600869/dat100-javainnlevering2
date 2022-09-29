package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int A=0; A<matrise.length; A++) {
			for(int a=0; a<matrise[A].length; a++) {
				System.out.println(matrise[A][a] + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String a = "";
		for (int b = 0; b < matrise.length; b++) {

			for (int B = 0; B < matrise[0].length; B++) {
				a += matrise[b][B] + " ";
			}
			a += "\n";
		}
		return a;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] tme = matrise;
		
		for (int c = 0; c < matrise.length; c++) {

			for (int C = 0; C < matrise[c].length; C++) {
				tme[c][C] = matrise[c][C] * tall;
			}
		}
		return tme;
		
		//viste ikke hva jeg skulle gjøre her
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;

		if (a.length == b.length) {
			
			for (int d = 0; d < a.length; d++) {

				for (int D = 0; D < a[d].length; D++) {
					
					if (a[d][D] != b[d][D]) {
						erLik = false;
					}
				}
			}
		} else
			erLik = false;

		return erLik;		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
		
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
