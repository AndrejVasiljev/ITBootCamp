package cas07032019;

public class Pacijent {
	public static int uid=0;
	private int id;
	private String imeP;
	private String brK;
	
	
	public Pacijent(String brK) {
		this.id=++uid;
		this.imeP="";
		this.brK=brK;
	}	
	public String getImeP() {
		return this.imeP;
	}
	public void setImeP(String imeP) {
		this.imeP = imeP;
	}
	public String getBrK() {
		return this.brK;
	}
	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return this.getImeP()+"["+this.getId()+":"+this.getBrK()+"]";
	}
	
}
