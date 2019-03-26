package cas07032019;

public class Krug extends Figura {
//u javi je zabranjeno nasledjivanje vise od jedne klase - extends

	private double poluprecnik;

	public Krug(double poluprecnik) {
								// super(2.3,4,"krug");
		super(); 				// za pozivanje podrazumevanog konstruktora
		this.poluprecnik = poluprecnik;
							// rec super u konstruktoru se nalazi na prvom mesto
							// i poziva konstruktor iz nadklase
	}

	public Krug(double obim, double povrsina, String naziv, double poluprecnik) {
		super(obim, povrsina, naziv); 	// poziv podrazumevanog konstruktora
		this.poluprecnik = poluprecnik;

	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

}
