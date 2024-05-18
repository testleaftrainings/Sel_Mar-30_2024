package week8.day1;

public class ExceptionHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;
int[] age= {20,45,32,56,78};

try {
	System.out.println(a/b);
}

catch(ArrayIndexOutOfBoundsException n) {
	System.out.println(age[8]);
}

catch (Exception e) {
	System.out.println(e);
	System.out.println(a/2);
}

finally {
	System.out.println("This is finally block");
}
System.out.println("Done");
	}

}
