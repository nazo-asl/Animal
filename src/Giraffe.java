public class Giraffe extends Animal {
	
	public Giraffe(String name) {
		super(name);
	}
	
	@Override
	public String getSound() {
		return "mm";
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
