package cas07032019;

public class GlavniOrdinacija {

	public static void main(String[] args) {

		// Stomatolog ima 3 stolice, svuda treba da sedi pacijent
		// Napisati klasu pacijent, pacijent ima jedinstveni identifikator koji se
		// zadaje
		// automatski prilikom kreiranja pacijenta
		// pacijent poseduje ime i prezime koje se moze zadati kasnije, get set
		// pacijent takodje poseduje broj knjizice tipa string koji se zadaje pri
		// kreiranju pacijenta samo get
		// Pacijent se moze ispisati u fomratu:
		// IME_PREZIME[ID:BRK]
		// KLASA ordinacija poseduje naziv ordinacije koji se zadaje prilikom kreiranja
		// i samo GET
		// ordinacija poseduje niz stolica ciji se broj zadaje prilikom kreiranja i na
		// njima sede pacijenti
		// moguce je dohvatiti broj stolica, moguce je postaviti pacijenta na stolicu
		// tako da se vrati indikator
		// da li je pacijent uspesno postavljen na stolicu (ako je prazna i ako postoji)
		// moguce je skloniti pacijenta sa stolice
		// pacijenta je moguce i spisati u formatu -
		// ordinaciju je moguce ispisati u formatu -
		// NAZIV[BRSTOLICA:PACIJENTI]
		// napisati glavni program koji kreira nekoliko pacijenata kreira ordinaciju,
		// dodaje pacijenta na stolicu
		// i uklanja ih sa stolice

		// NOTE: Samo get znaci moze se dohvatiti
		// set i get znaci moze se i dohvatiti i postaviti

		Ordinacija o1 = new Ordinacija("Zubic Majstor", 3);
		Pacijent p1 = new Pacijent("01"), p2 = new Pacijent("02"), p3 = new Pacijent("04");
		p1.setImeP("Mile");
		p2.setImeP("Boban");
		p3.setImeP("Stefan");
		if (o1.postaviPacijenta(p1, 0)) {
			System.out.println("Pacijent 1 postavljen");
		}
		if (o1.postaviPacijenta(p2, 0)) {
			System.out.println("Pacijent 2 postavljen");
		} else {
			System.out.println("Pacijent 2 nije postavljen");
		}
		if (o1.postaviPacijenta(p3, 2)) {
			System.out.println("Pacijent 3 postavljen");
		} else {
			System.out.println("Pacijent 3 nije postavljen");
		}
		System.out.println(o1);
		o1.skloniPacijenta(0);
		o1.skloniPacijenta(p3);
		System.out.println(o1);

	}

}