package cas05032019;

public class Autor {
	// datum rodjenja, datum smrti, ime i prezime,
	// ime i prezime se moze dohvatiti
	// datum smrti i rodjenja se moze izmeniti i dohvatiti
	private String imePrezime;
	private String datumRodjenja;
	private String datumSmrti;

	public Autor(String imePrezime) {
		this.imePrezime = imePrezime;
		this.datumRodjenja = "";
		this.datumSmrti = "";

	}

	public String getimePrezime() {
		return this.imePrezime;
	}

	public String getDatumRodjenja() {
		return this.datumRodjenja;
	}

	public String getDatumSmrti() {
		return this.datumSmrti;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public void setdatumSmrti(String datumSmrti) {
		this.datumSmrti = datumSmrti;
	}

	/*
	 * public String ispisiPodatke() { return imePrezime + " " + datumRodjenja + " "
	 * + datumSmrti; }
	 */

	@Override
	public String toString() {

		return this.getimePrezime() + ":" + this.getDatumRodjenja() + "-" + this.getDatumSmrti();
	}

}
