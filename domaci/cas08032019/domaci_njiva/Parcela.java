package domaci0803;

public abstract class Parcela {
	
	public static int uid=0;
	
	private int id;
	private double povrsina;
	
	
	public Parcela( double povrsina) {
	

		 this.povrsina=povrsina;
		 this.id=++uid;
	}
	public int getId() {
		return id;
	}
	public abstract char getVrsta();
	
	
	public abstract double prinos(int godine);
	
	public double getPovrsina() {
		return povrsina;
	}
	public static int getUid() {
		return uid;
	}
	@Override
	public String toString() {
		return this.getVrsta()+"-"+this.getId()+"["+this.getPovrsina()+"m2]";
	}
	
	
}
