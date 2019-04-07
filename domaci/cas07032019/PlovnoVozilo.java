package cas07032019;

public class PlovnoVozilo extends TransportnoVozilo {

	private String naziv;
	private String ImeP;
	private int brClanova;
	private int godPlovidbe;

	public PlovnoVozilo() {
		super();
		this.naziv = "";
		this.ImeP = "";
		this.brClanova = 0;
		this.godPlovidbe = 0;
	}

	public PlovnoVozilo(double gorivo, boolean servis, String naziv, String ImeP, int brClanova, int godPlovidbe) {
		super(gorivo, servis);
		this.naziv = naziv;
		this.ImeP = ImeP;
		this.brClanova = brClanova;
		this.godPlovidbe = godPlovidbe;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getImeP() {
		return ImeP;
	}

	public void setImeP(String imeP) {
		ImeP = imeP;
	}

	public int getBrClanova() {
		return brClanova;
	}

	public void setBrClanova(int brClanova) {
		this.brClanova = brClanova;
	}

	public int getGodPlovidbe() {
		return godPlovidbe;
	}

	public void setGodPlovidbe(int godPlovidbe) {
		this.godPlovidbe = godPlovidbe;
	}

	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder("PlovnoVozilo");
		sb.append("[").append("Gorivo:").append(this.getGorivo()).append("Servis: ").append(this.getServis());
		sb.append("Naziv:").append(this.getNaziv()).append("Kapetan:").append(this.getImeP()).append("br.clanova:")
				.append(this.getBrClanova());
		sb.append("Godina plovidbe:").append(this.getGodPlovidbe()).append("]");
		return sb.toString();
	}

}
