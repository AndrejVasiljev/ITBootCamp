package cas05032019;

public class Dete {
//napisati klasu dete koje ima sledece (polja)atribute, ime prezime, broj godina, br.klikera
//napisati getere i setere za sva polja	
//podrazumevani konstruktor (defaultni sa default vrednostima
//konstruktor koji prima ime,prezime,godine
//moguce je u svakom trenutku koliko ukupno kreirana deca imaju klikera
// i moguce je ispisati prosecan broj godina u svakom trenutku (static)	
// br klikera, br dece i sumu godina	

	// desni klik, sourse, generate getters and setters ili ctrl-shift-alt-s
	public static int ukupanBrKlikera = 0;
	public static double prosekGodina = 0;
	public static int brDece = 0;

	private String ime;
	private String prezime;
	private int brGodina;
	private int brKlikera;

	public Dete() {
		this.ime = " ";
		this.prezime = " ";
		this.brGodina = 0;
		this.brKlikera = 0;
		brDece++;

	}

	public Dete(String ime, String prezime, int brGodina) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGodina = brGodina;
		brDece++;
		prosekGodina += this.brGodina;

	}

	public static double getProsek() {
		return prosekGodina / brDece;
	}

	public String getIme() {
		return this.ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return this.prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getbrGodina() {
		return this.brGodina;
	}

	public void setBrGodina(int brGodina) {
		this.brGodina = brGodina;
	}

	public int getbrKlikera() {
		return this.brKlikera;
	}

	public void setbrKlikera(int brKlikera) {
		this.brKlikera = brKlikera;
		ukupanBrKlikera += brKlikera;
	}

}
