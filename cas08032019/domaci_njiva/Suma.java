package domaci0803;

public class Suma extends Parcela{
	private double povrsstabla;
	private double prinosZS;
	private int periodSZR;
	
	
	public Suma(double povrsina,double povrsstabla,double prinosZS, int periodSZR) {
		super(povrsina);
		this.prinosZS=prinosZS;
		this.periodSZR=periodSZR;
		this.povrsstabla=povrsstabla;
		
	}
	@Override
	public char getVrsta() {
		return 'S';
	}
	
	

@Override
public double prinos(int godine) {
	return this.getPovrsina()/this.povrsstabla*this.prinosZS*(godine/this.periodSZR) ;
}



@Override
	public String toString() {
	return super.toString()+":("+this.povrsstabla+", "+this.prinosZS+", "+this.periodSZR+")";
}
}
