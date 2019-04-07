package cas07032019;

public class GlavniTransportnoVozilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrumskoVozilo d1 = new DrumskoVozilo(10, false, "Honda", 3, 2014);
		System.out.println(d1);
		d1.dodajGorivo(120);
		System.out.println(d1);

		PlovnoVozilo p1 = new PlovnoVozilo(24, false, "SkubbyDoo", "Dzinks", 3, 2016);
		System.out.println(p1);
		p1.dodajGorivo(253);
		System.out.println(p1);
	}

}
