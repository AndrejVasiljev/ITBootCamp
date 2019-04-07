package cas05032019;

public class Knjiga {
	// 04.03.opisati knjigu koja ima sledeca polja:
	// naziv knjige, naziv autora, godina izdanja, broj strana
	// napraviti glavni brogram koji kreira 3 knjige i ispisuje njihove podatke

	// DODATNI 05.03: Modifikovati klasu knjiga tako da autor vise ne bude String
	// vec konkretan objekat klase autor.
	// Napisati toString metodu za klasu knjiga, koja ispisuje knjigu u sledecem
	// formatu:
	// NAZIV_KNJIGE [NAZIV AUTOA][GODINA_IZDANJA][BROJ_STRANA]
	private String nazivKnjige;
	private Autor nazivAutora;
	private int godinaIzdanja;
	private int brojStrana;

	public Knjiga(String nazivKnjige, Autor nazivAutora, int godinaIzdanja, int brojStrana) {
		this.nazivKnjige = nazivKnjige;
		this.nazivAutora = nazivAutora;
		this.godinaIzdanja = godinaIzdanja;
		this.brojStrana = brojStrana;
	}

	public Knjiga(String nazivKnjige, int godinaIzdanja, int brojStrana) {
		this.nazivKnjige = nazivKnjige;
		this.godinaIzdanja = godinaIzdanja;
		this.brojStrana = brojStrana;
		this.nazivAutora = new Autor("Nepoznati autor");
	}

	public Autor getNazivAutora() {
		return this.nazivAutora;
	}

	public String getNazivKnjige() {
		return this.nazivKnjige;
	}

	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}

	public int getGodinaIzdanja() {
		return this.godinaIzdanja;
	}

	public void setgodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public int getbrojStrana() {
		return this.brojStrana;
	}

	public void setbrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	@Override
	public String toString() {
		// metoda toString
		return this.getNazivKnjige() + this.getNazivAutora() + this.getGodinaIzdanja() + this.getbrojStrana();
	}

}
