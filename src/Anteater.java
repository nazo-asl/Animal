
public class Anteater extends Animal {

	public Anteater(String name) {
		super(name);
	}

	@Override
	public String getSound() {
		return "HRAGHH HRWEAGH";
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
