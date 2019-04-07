package cas05032019;

public class KnjigaGlavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor a1 = new Autor("Branko Copic");
		a1.setDatumRodjenja("01/01/1915");
		a1.setdatumSmrti("26/03/1984");
		Knjiga k = new Knjiga("Orlovi rano lete ", a1, 1957, 240);
		System.out.println(k);
		Autor neki = k.getNazivAutora();
		System.out.println(neki.getimePrezime());

	}

}
