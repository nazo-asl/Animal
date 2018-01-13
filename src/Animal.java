/***
 * Represents the concept of an animal.
 * 
 * @author kentc14
 *
 */
public abstract class Animal {

	String sound;
	boolean hasWings;
	int numLegs;
	String name;
	
	public Animal(String sound, boolean hasWings, int numLegs, String name) {
		super();
		this.sound = sound;
		this.hasWings = hasWings;
		this.numLegs = numLegs;
		this.name = name;
	}

	/**
	 * Returns the common name of the animal
	 * 
	 * @return the animal's name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
