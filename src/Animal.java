/***
 * Represents an animal.
 *
 */
public abstract class Animal {

	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public abstract String getSound();

	public abstract boolean hasWings();

	public abstract int getNumLegs();

	@Override
	public String toString() {
		return getName() + " the " + this.getClass().getName();
	}

	/**
	 * Returns the given name of the animal
	 * 
	 * @return the animal's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Print a descriptive string and the sound this animal makes.
	 * 
	 * @return a string describing our sound
	 */
	public String makeSound() {
		return this.toString() + " goes " + getSound();
	}

}
