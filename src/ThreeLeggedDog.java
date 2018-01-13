
public class ThreeLeggedDog extends Dog {

	public ThreeLeggedDog(String name) {
		super("Lucky");
	}
	
	@Override
	public int getNumLegs() {
		return 3;
	}
	
	@Override
	public String getSound() {
		return super.getSound()+", Woof!";
	}
	
	

}
