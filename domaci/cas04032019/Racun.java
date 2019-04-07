package cas04032019;

public class Racun {
	// klasu koja ima dva polja, broj racuna i stanje
	// napisati getere i setere za broj racuna
	// napisati metode za vracanje kolicine novca, dodavanje i uzimanje

	private double stanjeNaRacunu;
	private String brojRacuna;

	public Racun() {
		this.stanjeNaRacunu = 0;
		this.brojRacuna = "AAA-BBBBBB-CC";
	}

	public String getbrojRacuna() {
		return this.brojRacuna;
	}

	public void setbrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public double getStanje() {
		return stanjeNaRacunu;
	}

	public void dodajNovac(double iznos) {
		if (iznos > 0) {
			this.stanjeNaRacunu += iznos;
		}
	}

	public void uzmiNovac(double iznos) {
		if (iznos <= 0 || this.stanjeNaRacunu < iznos)
			return;
		this.stanjeNaRacunu -= iznos;
	}

	public String uzmiPodatke() {
		return "Broj racuna: " + this.brojRacuna + "," + "Stanje na racunu: " + this.stanjeNaRacunu + " ;";

	}
}
