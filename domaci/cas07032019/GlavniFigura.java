package cas07032019;

public class GlavniFigura {

	public static void main(String[] args) {
		Krug k1 = new Krug(5, 10, "k1", 2);
		Figura f1 = new Figura(23, 54, "pravougaonik");
		System.out.println(f1.ispis());
		System.out.println(k1.ispis());

		Trougao t1 = new Trougao(10, 20, "Trougao", 3, 4, 5);
		System.out.println(t1.ispis());
	}

}
