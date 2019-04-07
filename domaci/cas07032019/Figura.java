package cas07032019;

public class Figura {
	private double obim;
	private double povrsina;
	private String naziv;

	public Figura() {
		this.obim = 0;
		this.povrsina = 0;
		this.naziv = "";

	}

	public Figura(double obim, double povrsina, String naziv) {
		this.obim = obim;
		this.povrsina = povrsina;
		this.naziv = naziv;
	}

	public String ispis() {
		return this.naziv + "( O:" + this.obim + " " + "P:" + this.povrsina + " )";
	}

	public double getObim() {
		return obim;
	}

	public void setObim(double obim) {
		this.obim = obim;
	}

	public double getPovrisna() {
		return povrsina;
	}

	public void setPovrisna(double povrisna) {
		this.povrsina = povrisna;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}
