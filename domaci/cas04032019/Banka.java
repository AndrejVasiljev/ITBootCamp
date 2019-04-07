package cas04032019;

import java.util.Scanner;

public class Banka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Racun r1 = new Racun();
		r1.setbrojRacuna("160 - 123456 - 78");
		r1.dodajNovac(125);
		System.out.println(r1.uzmiPodatke());
		r1.dodajNovac(126);
		System.out.println(r1.uzmiPodatke());
		r1.uzmiNovac(-125);
		System.out.println(r1.uzmiPodatke());
		r1.uzmiNovac(200);
		System.out.println(r1.uzmiPodatke());
	}

}
