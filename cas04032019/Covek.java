package cas04032019;

public class Covek { // KLASE 04.03.19. konstruktori/polja/metode

	// polja
	private String imeP;
	private double visina;
	private double tezina;
	private int pare;

	// konstruktore //nema povratnu *void vrednost
	public Covek(String imeP, double visina, double tezina) {
		this.imeP = imeP; // this. se odnosi na klasu koja ga poziva,
		this.visina = visina;
		this.tezina = tezina;
	}

	// metode
	public String getImeP() { // istog tipa kao podatak koji hocemo da dohvatimo
		return this.imeP;
	}

	public void setImeP(String imeP) { // prima podatak koje je istog Tipa kao polje koje zelimo da promenimo
		this.imeP = imeP;
	}

	public double getVisina() {
		return this.visina;
	}

	public double getTezina() {
		return this.tezina;
	}

	public int getPare() {
		return this.pare;
	}

	public void primiNovac(int iznos) {
		if (iznos > 0) {
			this.pare += iznos;
		}
	}

	public void uzmiNovac(int iznos) {
		if (iznos > this.pare || iznos<=0)
			return;
		this.pare-=iznos;
	}

}
