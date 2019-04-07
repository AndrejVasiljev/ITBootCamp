package cas05032019;

public class DeteGlavni {

	public static void main(String[] args) {
		// napisati klasu dete koje ima sledece (polja)atribute, ime prezime, broj
		// godina, br.klikera
		// napisati getere i setere za sva polja
		// podrazumevani konstruktor
		// konstruktor koji prima ime,prezime,godine
		// moguce je u svakom trenutku koliko ukupno kreirana deca imaju klikera
		// i moguce je ispisati prosecan broj godina u svakom trenutku (static)
		// br klikera, br dece i sumu godina povezati

		Dete d1 = new Dete("Nikola", "Rilak", 15);
		Dete d2 = new Dete("Jelena", "Obradovic", 55);
		Dete d3 = new Dete("Miroslav", "Loncarevic", 40);

		d1.setbrKlikera(5);
		d2.setbrKlikera(9);
		d3.setbrKlikera(1);

		System.out.println(Dete.ukupanBrKlikera);
		System.out.println(Dete.getProsek());

	}

}
