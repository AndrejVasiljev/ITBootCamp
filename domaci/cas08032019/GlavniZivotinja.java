package cas08032019;

public class GlavniZivotinja {

	public static void main(String[] args) {

		Krava k = new Krava("Belka", true, 4);
		Vuk v = new Vuk("Vucko", true, 4);

		Zivotinja z = new Vuk("Vuk2", true, 4);
		//Zivotinja z1 = new Zivotinja("Petao", false,2)
		// Vuk = new Zivotinja("Zivotinja", true, 4); nije moguce jer nije svaka zivotinja vuk.
		System.out.println(k.toString()); // ispisao bi i samo k, bez toString()
		System.out.println(v.toString());

		System.out.println(k.glas());
		System.out.println(v.glas());

		System.out.println(z.toString());
		//System.out.println(z1.toString());
	}

}
