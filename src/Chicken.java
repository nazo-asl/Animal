
public class Chicken extends Animal {

	public Chicken(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "Squawk!";
	}

	@Override
	public boolean hasWings() {
		return true;
	}

	@Override
	public int getNumLegs() {
		return 2;
	}

}
