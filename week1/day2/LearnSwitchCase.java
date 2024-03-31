package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="IE";
		
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome browser launched");
			break;
		case "Edge":
			System.out.println("Edge browser launched");
           break;
		case "Safari":
			System.out.println("Safari browser launched");
			break;
		
			default:
				System.out.println("IE -"+browser); break;
		}
	}

}
