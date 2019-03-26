package cas05032019;

public class GlavniLamp {

	public static void main(String[] args) {

		// System.out.println(Lamp.brOn++); - brojac
		// preko klase Lamp. smo pristupili defaultnoj vrednosti u memoriji
		System.out.println("Trenutni broj upaljenih lampi je: " + Lamp.brOn);

		Lamp l1 = new Lamp();
		System.out.println("Trenutni broj upaljenih lampi je: " + Lamp.brOn);
		Lamp l2 = new Lamp(true);
		System.out.println("Trenutni broj upaljenih lampi je: " + Lamp.brOn);

		System.out.println("Trenutni broj upaljenih lampi je: " + Lamp.getBrOn());

	}

}
