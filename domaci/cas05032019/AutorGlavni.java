package cas05032019;

import java.util.Scanner;

import homework04032019.Auto;

public class AutorGlavni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi ime autora: "); // za rucno unosenje, dodat skener
		String ime = sc.nextLine();              // String ime - sc.nextLine
		Autor a1 = new Autor(ime); 	            // potrebno je izmeniti bez apostrofa (ime)string						
		a1.setDatumRodjenja("01/01/1915");
		a1.setdatumSmrti("26/03/1984");
		Autor a2 = new Autor("Mario Puzo");
		a2.setDatumRodjenja("02/02/1946");
		a2.setdatumSmrti("03/03/2012");
		

		System.out.println("Prvi autor: " + a1 + "\n" + "Drugi autor: " + a2);
		/*
		Autor[] nizA=new Autor[10]; //ovaj niz sa for petljom je dodatak za ispis vise autora
		for(int i=0;i<nizA.length;i++) {
			nizA[i]=new Autor("Autor"+(i+1));
		}
		for(int i =0;i<nizA.length;i++) {
			System.out.println(nizA[i]);
		}*/
		// System.out.println(a1.ispisiPodatke()); - public string ispisiPodatke
	}

}
