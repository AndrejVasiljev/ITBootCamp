package cas07032019;

public class DrumskoVozilo extends TransportnoVozilo {
	private String model;
	private double kapacitet;
	private int godProizvodnje;

	public DrumskoVozilo() {
		super();
		this.model = "";
		this.kapacitet = 0;
		this.godProizvodnje = 0;

	}

	public DrumskoVozilo(double gorivo, boolean servis, String model, double kapacitet, int godProizvodnje) {
		super(gorivo, servis);
		this.model = model;
		this.kapacitet = kapacitet;
		this.godProizvodnje = godProizvodnje;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(double kapacitet) {
		this.kapacitet = kapacitet;
	}

	public int getGodProizvodnje() {
		return godProizvodnje;
	}

	public void setGodProizvodnje(int godProizvodnje) {
		this.godProizvodnje = godProizvodnje;
	}

	@Override
	public String toString() {

		return "[" + this.getGorivo() + "lit " + "servis:" + this.getServis() + " Model:" + model + " putnika:"
				+ kapacitet + " Godina:" + godProizvodnje + "]";

	}

}
