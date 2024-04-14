package week3.day2;

public class SBIConcreteClass extends Sbi {

	//fully it should be implemented
	
	@Override
	public void pl() {
	System.out.println("Personal loan");
	}
	
	public static void main(String[] args) {
		SBIConcreteClass s=new SBIConcreteClass();
		s.desposit();
		s.kyc();
		s.minbal();
		s.pl();
	}

	@Override
	public void value() {
		// TODO Auto-generated method stub
		
	}

}
