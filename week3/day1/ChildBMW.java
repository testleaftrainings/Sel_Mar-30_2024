package week3.day1;

public class ChildBMW extends ParentCar{

	public void sunroof() {
		System.out.println("its coming from child class : sunroof");
	}
	
	public void applyBreak() {
		System.out.println("abs break");
	}
	
	public static void main(String[] args) {
		ChildBMW cc=new ChildBMW();
		
		cc.applyBreak();
		cc.gear();
		cc.horn();
		cc.sunroof();
	}
}
