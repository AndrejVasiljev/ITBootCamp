package cas07032019;

public class Trougao extends Figura {
	private double stranicaA;
	private double stranicaB;
	private double stranicaC;

	public Trougao(double stranicaA, double stranicaB, double stranicaC) {
		super();
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;
	}

	public Trougao(double obim, double povrsina, String naziv, double stranicaA, double stranicaB, double stranicaC) {
		super(obim, povrsina, naziv);
		this.stranicaA = stranicaA;
		this.stranicaB = stranicaB;
		this.stranicaC = stranicaC;

	}

	public double getStranicaA() {
		return stranicaA;
	}

	public void setStranicaA(double stranicaA) {
		this.stranicaA = stranicaA;
	}

	public double getStranicaB() {
		return stranicaB;
	}

	public void setStranicaB(double stranicaB) {
		this.stranicaB = stranicaB;
	}

	public double getStranicaC() {
		return stranicaC;
	}

	public void setStranicaC(double stranicaC) {
		this.stranicaC = stranicaC;
	}
}
