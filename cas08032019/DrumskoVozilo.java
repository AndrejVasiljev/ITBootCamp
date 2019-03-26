package cas08032019;

public class DrumskoVozilo extends TransportnoVozilo {
//sa override-om
	public static int brDrumskoVozilo = 0; // za ispis uk broj drumskih vozila

	private String model;
	private int kapacitet;
	private int godinaProizvodnje;

	public DrumskoVozilo() {
		super();
		model = "";
		kapacitet = 0;
		godinaProizvodnje = 0;
	}

	public DrumskoVozilo(double gorivo, boolean servis, String model, int kapacitet, int godinaProizvodnje) {
		super(gorivo, servis);
		this.model = model;
		this.kapacitet = kapacitet;
		this.godinaProizvodnje = godinaProizvodnje;
	}

	public String ispis() { // ispis
		return model + "(" + godinaProizvodnje + ")";
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}

	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}

	@Override
	public String toString() {
		return "DrumskoVozilo";
	}
}
