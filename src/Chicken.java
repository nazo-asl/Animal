
public class Chicken extends Animal {

	public Chicken(String sound, boolean hasWings, int numLegs, String name) {
		super(sound, hasWings, numLegs, name);
	}
	
	public String getSound() {
		return "Squawk!";
	}

}
