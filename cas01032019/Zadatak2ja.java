package cas01032019;

import java.util.Scanner;

public class Zadatak2ja {

	public static void main(String[] args) {
		// napisati dve metode
		// prva metoda vraca zbir elemenata na parnim pozicijama
		// druga metoda vraca proizvod na neparnim pozicijama
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza: ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitaj(niz);
		System.out.println("Suma elemenata na parnim pozicijama je: " + sumaParnih(niz));

		System.out.println("Proizvod elemenata na neparnim pozicijama je: " + proizvodNeparnih(niz));

	}
	
	public static void ucitaj(int[] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi " +niz.length+ " elemenata: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
	}

	public static int sumaParnih(int niz[]) {
		for (int i = 1; i < niz.length; i++) {
			System.out.println(i + " ");

		}
		int s = 1;
		for (int i = 1; i < niz.length; i++) {
			if (i % 2 == 0)
				s += niz[i];
		}
		return s;
	}

	public static int proizvodNeparnih(int niz[]) {
		for (int i = 1; i < niz.length; i++) {
			System.out.println(i + " ");

		}
		int p = 1;
		for (int i = 1; i < niz.length; i++) {
			if (i % 2 != 0)
				p *= niz[i];

		}
		return p;

	}


}
