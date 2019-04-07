package cas08032019;

public class Zivotinja {

	private String naziv;
	private boolean rep;
	private int brNogu;

	public Zivotinja(String naziv, boolean rep, int brNogu) {
		super();
		this.naziv = naziv;
		this.rep = rep;
		this.brNogu = brNogu;
	}

	public String glas() {
		return "aaaa";
	}

	@Override
	public String toString() {
		return naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public boolean isRep() {
		return rep;
	}

	public void setRep(boolean rep) {
		this.rep = rep;
	}

	public int getBrNogu() {
		return brNogu;
	}

	public void setBrNogu(int brNogu) {
		this.brNogu = brNogu;
	}

}
