package cas04032019;

public class GlavniP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Covek c1 = new Covek("Mitar Miric", 192, 105), c2 = new Covek("Petar Petrovic", 195, 65);
		ispisiC(c1);
		// ispisiC(c2);
		/*
		 * c1.imeP = "Mitar Miric"; c1.visina = 192; c1.tezina = 105; c2.imeP =
		 * "Petar Petrovic"; c2.visina = 195; c2.tezina = 65;
		 */
		// System.out.println(c1.imeP + " " + c1.visina + " " + c1.tezina);
		// System.out.println(c2.imeP + " " + c2.visina + " " + c2.tezina);
		// c2.imeP = "Petar Markovic";
		// c2.visina = 195;
		// c2.tezina = 65;
		// ispisiC(c2);
		c2.setImeP("Petar Markovic");
		ispisiC(c2);
	}

	public static void ispisiC(Covek c) {
		System.out.println(c.getImeP() + " " + c.getVisina() + " " + c.getTezina());
	}
}
