/***
 * Represents the concept of an animal.
 * 
 * @author kentc14
 *
 */
public class Animal {

	String sound;
	boolean hasWings;
	int numLegs;
	
	public Animal(String sound, boolean hasWings, int numLegs) {
		super();
		this.sound = sound;
		this.hasWings = hasWings;
		this.numLegs = numLegs;
	}
	
	/**
	 * Pretend to speak
	 * 
	 * @return the animal's sound
	 */
	public String speak() {
		return sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public boolean isHasWings() {
		return hasWings;
	}

	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}

	public int getNumLegs() {
		return numLegs;
	}

	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
}
