package cas05032019;

public class Lamp {

	public static int brOn = 0;

	private boolean isOn;
	
	public static int getBrOn() {
		return brOn;
	}

	public Lamp() { // podrazumevani konstruktor (podrazumevana vrednost)
		this.isOn = false;
	}

	// all attribute konstruktor
	public Lamp(boolean isOn) {
		this.isOn = isOn;
		if (this.isOn == true) {
			brOn++;
		}
	}

	public void turnOn() {
		this.isOn = true;
		brOn++;
	}

	public void turnOff() {
		this.isOn = false;
		brOn--;
	}

	public boolean getIsOn() {
		return this.isOn;
	}

}
