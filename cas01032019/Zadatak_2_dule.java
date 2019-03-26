package cas01032019;

import java.util.Scanner;

public class Zadatak_2_dule {

	public static void main(String[] args) {
		// napisati dve metode
		// prva metoda vraca zbir elemenata na parnim pozicijama
		// druga metoda vraca proizvod na neparnim pozicijama
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza: ");
		int n;
		n = sc.nextInt();
		int[] niz = new int[n]; // kreiranje niza
		ucitaj(niz);
		//System.out.println("Zbir na parnim pozicijama je: " +zbirParnih(niz));
		//System.out.println("Proizvod na neparnim pozicijama je: " +proizvodNeparnih(niz));

		
	}

	public static void ucitaj(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi " + niz.length + " elemenata: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int zbirParnih(int[] niz) {
		int sum = 1;
		for (int i = 1; i < niz.length; i++) {
			if (i % 2 == 0)
				sum += niz[i];
		}
		return sum;
	}

	public static int proizvodNeparnih(int [] niz) {
		int pr = 1;
		for (int i = 1; i < niz.length; i++) {
			if (i % 2 != 0)
				pr *= niz[i];
		}
		return pr;
	}

}
