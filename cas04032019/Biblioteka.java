package cas04032019;

public class Biblioteka {

	public static void main(String[] args) {
		// opsisati knjigu koja ima sledeca polja:
		// naziv knjige, naziv autora, godina izdanja, broj strana

		// napraviti glavni brogram koji kreira 3 knjige i ispisuje njihove podatke
		// Knjiga k1,k2,k3 - rezervisemo imena za knjigu
		Knjiga k1 = new Knjiga("Porodica", "Mario Puzo", 2002, 600);
		//k1.nazivKnjige = "Porodica";
		//k1.nazivAutora = "Mario Puzo";
		//k1.godinaIzdanja = 2002;
		//k1.brojStrana = 600;

		Knjiga k2 = new Knjiga("Orlovi rano lete", "Branko Copic",2002,600);
		//k2.nazivKnjige = "Orlovi rano lete";
		//k2.nazivAutora = "Branko Copic";
		//k2.godinaIzdanja = 2002;
		//k2.brojStrana = 600;

		Knjiga k3 = new Knjiga("Porodica", "Mario Puzo", 2002, 600);
		//k3.nazivKnjige = "Porodica";
		//k3.nazivAutora = "Mario Puzo";
		//k3.godinaIzdanja = 2002;
		//k3.brojStrana = 600;
		Knjiga k5;
		k5 = new Knjiga("Narodne umotvorine" , 1899, 50);
		ispisiKnjigu(k1);
		ispisiKnjigu(k2);
		ispisiKnjigu(k3);
		ispisiKnjigu(k5);
		// System.out.println(k1.nazivKnjige + " " + k1.nazivAutora + " " +
		// k1.godinaIzdanja + " " + k1.brojStrana);
		// umesto dugog ispisivanja syso, pravimo metodu KNJIGA K, za sve ispise zajedno
	}

	public static void ispisiKnjigu(Knjiga k) {
		System.out.println(k.nazivKnjige + " " + k.nazivAutora + " " + k.godinaIzdanja + " " + k.brojStrana);
		
	}

}
