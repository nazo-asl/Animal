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

	/** Returns the given name of the animal
	 * @return the animal's name
	 */
	public String getName() {
		return name;
	}

	/** Builds a string containing the animal's sound.
	 * @return a string describing the sound
	 */
	public String makeSound() {
		return "The "+ this.getClass().getName() + " goes " + getSound();
	}
	
	/** Completely describe the animal
	 * @return a string describing the animal
	 */
	public String describe() {
		String s = this.toString();
		s+= " has "+getNumLegs()+" legs and ";
		s+= hasWings()?"wings.":"no wings.";
		return s;
	}

}
