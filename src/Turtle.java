public class Turtle extends Animal {

	public Turtle(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "whoosh";
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
