package cas08032019;

public class PlovnoVozilo extends TransportnoVozilo {
//sa override-om
	public static int brPlovnoVozilo = 0; // za ispis uk broj plovnih vozila

	private String nazivVozila;
	private String ImePrezime;
	private int brClanova;
	private int godinaPlovidbe;

	public PlovnoVozilo() {
		super();
		this.nazivVozila = "";
		this.ImePrezime = "";
		this.brClanova = 0;
		this.godinaPlovidbe = 0;
	}

	public PlovnoVozilo(double gorivo, boolean servis, String nazivVozila, String imePrezime, int brClanova,
			int godinaPlovidbe) {
		super(gorivo, servis);
		this.nazivVozila = nazivVozila;
		this.ImePrezime = imePrezime;
		this.brClanova = brClanova;
		this.godinaPlovidbe = godinaPlovidbe;
		brPlovnoVozilo++;
	}

	@Override //08.03 dodatak
	public void isprazniGorivo(double gorivo) { // isprazni gorivo
		if (getGorivo() > 0 && getGorivo() - 3 * gorivo > 0)
			setGorivo(getGorivo() - 3 * gorivo);
		else
			System.out.println("Nemate dovoljno goriva");
	}

	public String ispis() { // ispis
		return nazivVozila + "(" + godinaPlovidbe + ")";
	}

	public String getImePVozila() {
		return nazivVozila;
	}

	public void setImePVozila(String imePVozila) {
		this.nazivVozila = imePVozila;
	}

	public String getImePrezime() {
		return ImePrezime;
	}

	public void setImePrezime(String imePrezime) {
		ImePrezime = imePrezime;
	}

	public int getBrClanova() {
		return brClanova;
	}

	public void setBrClanova(int brClanova) {
		this.brClanova = brClanova;
	}

	public int getGodinaPlovidbe() {
		return godinaPlovidbe;
	}

	public void setGodinaPlovidbe(int godinaPlovidbe) {
		this.godinaPlovidbe = godinaPlovidbe;
	}

}
