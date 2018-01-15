public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "Woof";
	}

	@Override
	public boolean hasWings() {
		return false;
	}

	@Override
	public int getNumLegs() {
		return 4;
	}
	
}
