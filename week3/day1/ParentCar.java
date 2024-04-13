package week3.day1;

public class ParentCar extends GrandParent {

	public void gear() {
		System.out.println("its coming from parent class: gear");

	}
	
	public static void main(String[] args) {
		ParentCar pc=new ParentCar();
		
		pc.applyBreak();
		pc.horn();
		pc.gear();
	}
}
