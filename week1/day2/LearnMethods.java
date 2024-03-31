package week1.day2;

public class LearnMethods {
//type method name -> ctrl + space
	public void browser() {
             System.out.println("Chrome");
	}
	public void addNumber(int a,int b) {
		System.out.println(a+b);
	}
	private int noOfBicycles() {
		return 2;
	}
	//default access modifier
	  boolean isJavaplatformIndependent() {
			return true;
		}
	  
	  public String browser(String name) {
		return name;  
	  }
	  
	  
	  public static void main(String[] args) {
		  //classname object = new classname();
		  LearnMethods lm=new LearnMethods();
		  //objectName.methodName
		  lm.addNumber(5, 15);
		  lm.browser();
		  //ctrl+2 -> 2nd option 'L'
		  int noOfBicycles = lm.noOfBicycles();
		  System.out.println(noOfBicycles);
		  
		  boolean js = lm.isJavaplatformIndependent();
		  System.out.println(js);
		  
		  String browser = lm.browser("Chrome");
		  System.out.println(browser);
	}
	  
	  
	  
		
		
	
}
