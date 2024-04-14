package week3.day2;

public abstract class Sbi implements RBI {

	//0 to 100 % abstract methods
	//i can both implements and unimplements methods
	
	@Override
	public void desposit() {
		System.out.println("Above 10L");
	}

	@Override
	public void kyc() {
		System.out.println("pan card");
	}
	
	//own implementation
	public void minbal() {
		System.out.println("5000rs");
	}
	
	
	//unimplements methods
	public abstract void value();
	
	
	public static void main(String[] args) {
		//we can create object for interface-- No
		// RBI b=new RBI();
		
		//we can create object for abstract class-- No
		//Sbi s=new Sbi();
		}

}
