package cas08032019;

public class TransportnoVozilo {
//sa override-om 08032019
	
	/*07.03.2019
	 * Napisati klasu transportno vozilo koje sadrzi sledece atribute:
	 * gorivo(jedinica mere litar) servisirano(true ili false)
	 * 
	 * Transportno vozilo moze biti drumsko i plovno. Drumsko vozilo ima sledece
	 * atribute: model,kapacitet, godina proizvodnje. Plovno vozilo sadrzi i sledece
	 * atribute: ime plovnog vozila ime i prezime kapetana broj clanova posede
	 * godina plovidbe(kada je prvi put zaplovilo u vode) Napisati gettere i settere
	 * za sva polja.
	 * 
	 * Napisati to string metodu za drumska i plovna vozila. Napisati metode dodaj
	 * gorivo i isprazni gorivo. Takodje potrebno je napisati metodu servisiraj
	 * vozilo. U svakom trenutku moguce je ispisati ukupan broj drumskih i ukupan
	 * broj plovnih vozila.
	 */
	
	//08.03.2019.
	//Potrebno je predefinisati to string metode u izvedenim klasama
	//dodati to string metodu u transportno vozilo
	//plovno vozilo trosi 3x vise goriva od drumskog

	private double gorivo;
	private boolean servis;

	public TransportnoVozilo() {
		gorivo = 0;
		servis = false;
	}

	public TransportnoVozilo(double gorivo, boolean servis) {
		super();
		this.gorivo = gorivo;
		this.servis = servis;
	}

	public void servisVozila() { // servis
		if (servis)
			System.out.println("Vozilo je vec servisirano");
		else
			servis = true;
	}

	public void dodajGorivo(double gorivo) { // dodaj gorivo
		this.gorivo += gorivo;
	}

	public void isprazniGorivo(double gorivo) { // isprazni gorivo
		if (this.gorivo > 0 && this.gorivo - gorivo > 0)
			this.gorivo -= gorivo;
		else
			System.out.println("Nemate dovoljno goriva");
	}

	public double getGorivo() {
		return gorivo;
	}

	public void setGorivo(double gorivo) {
		this.gorivo = gorivo;
	}

	public boolean getServis() {
		return servis;
	}

	public void setServis(boolean servis) {
		this.servis = servis;
	}
	
	@Override
	public String toString() {
		return "TransportnoVozilo";
	}

}
