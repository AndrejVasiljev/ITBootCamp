package cas08032019;

public class Vuk extends Zivotinja {
	
	public Vuk(String naziv, boolean rep, int brNogu) {
		super(naziv,rep,brNogu);
	}
	
	@Override 
	public String glas() {
		return "auuuu";
	}
	
	@Override
	public String toString() {
		return "Vuk:" + getNaziv();
	}

}
