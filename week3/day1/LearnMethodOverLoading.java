package week3.day1;

public class LearnMethodOverLoading {

	
	public void browser() {
		System.out.println("Browser");
	}
	
	public void browser(int noOfbrowser,String browserName) {
		System.out.println(noOfbrowser +" "+ browserName);
		
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int c,int d) {
		return a+c+d;
		
	}
	
	public static void main(String[] args) {
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		ol.browser();
		ol.browser(2, "chrome");
		int add = ol.add(2, 3);
		System.out.println(add);
		int add2 = ol.add(4, 5, 6);
		System.out.println(add2);
	}
}
