package cas07032019;

public class Ordinacija {
	private String naziv;
	private Pacijent[] stolice;

	public Ordinacija(String naziv, int k) {
		this.naziv = naziv;
		stolice = new Pacijent[k];
	}

	public String getNaziv() {
		return this.naziv;
	}

	public int getBrStolica() {
		return this.stolice.length;
	}

	public boolean postaviPacijenta(Pacijent p, int i) {
		if (i >= this.stolice.length || i < 0)
			return false;
		if (stolice[i] != null)
			return false;
		for (int j = 0; j < stolice.length; j++) {
			if (stolice[j] != null) {
				if (stolice[j] == p) {
					return false;
				}
			}
		}
		stolice[i] = p;
		return true;
	}

	public void skloniPacijenta(int i) {
		if (i >= this.stolice.length || i < 0)
			return;
		if (stolice[i] == null) {
			return;
		}
		stolice[i] = null;
	}

	public void skloniPacijenta(Pacijent p) {
		for (int i = 0; i < stolice.length; i++) {
			if (stolice[i] != null) {
				if (stolice[i] == p) {
					stolice[i] = null;
					return;
				}
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(this.getNaziv());
		sb.append("[");
		sb.append(this.getBrStolica());
		sb.append(":");
		for (int i = 0; i < stolice.length; i++) {
			if (stolice[i] != null)
				sb.append(stolice[i]);
		}
		sb.append("]");
		return sb.toString();
	}
}