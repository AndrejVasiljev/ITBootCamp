package domaci0803;

public class Njiva extends Parcela{

	private double prinosKVM;
	
public Njiva(double povrsina, double prinosKVM)	{
	super(povrsina);
	this.prinosKVM=prinosKVM;
	
}
public void setPrinosKVM(double prinosKVM) {
	this.prinosKVM = prinosKVM;
}
@Override
public double prinos(int godine) {
	return this.getPovrsina()*this.prinosKVM*godine;
}
	@Override
public char getVrsta() {
	return 'N';
}
@Override
public String toString() {
	return super.toString()+":"+this.prinosKVM+".";
}


}
