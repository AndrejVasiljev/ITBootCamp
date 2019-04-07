package cas08032019;

public class Krava extends Zivotinja {
	public Krava(String naziv, boolean rep, int brNogu) {
		super(naziv, rep, brNogu);

	}

	@Override
	public String glas() {
		return "muuu";
	}

	@Override  // pregazi nadklasu Krava
	public String toString() {
		return "Krava:" + getNaziv();
	}
}
