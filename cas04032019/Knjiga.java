package cas04032019;

public class Knjiga {
	// opsisati knjigu koja ima sledeca polja:
	// naziv knjige, naziv autora, godina izdanja, broj strana

	// napraviti glavni brogram koji kreira 3 knjige i ispisuje njihove podatke
	public String nazivKnjige;
	public String nazivAutora;
	public int godinaIzdanja;
	public int brojStrana;

	public Knjiga(String nazivKnjige, String nazivAutora, int godinaIzdanja, int brojStrana) {
		this.nazivKnjige = nazivKnjige;
		this.nazivAutora = nazivAutora;
		this.godinaIzdanja = godinaIzdanja;
		this.brojStrana = brojStrana;
	}

	public Knjiga(String nazivKnjige, int godinaIzdanja, int brojStrana) {
		this.nazivKnjige = nazivKnjige;
		this.godinaIzdanja = godinaIzdanja;
		this.brojStrana = brojStrana;
		this.nazivAutora = "Nepoznati autor";
	}

}