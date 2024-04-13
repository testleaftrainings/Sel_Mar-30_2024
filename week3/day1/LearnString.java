package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		
		String name="Test Leaf";
		
		String s=new String("Test leaf");
		
		String b=new String("Test leaf");
		
		//no of char present -length()
		int length = name.length();
		System.out.println("no of chars :"+length);

		//equals()-
		if(name.equals(s)) {
			System.out.println("matched");
		}else {
			System.out.println("Not matched");
		}
		//diff b/w == and .equals()
		//== it will check memory value for the String
		if(s==b){
			System.out.println(" == matched");
		}else {
			System.out.println(" == Not matched");
		}
		
		if(s.equals(b)) {
			System.out.println(" .equals() matched");
		}else {
			System.out.println(".equals () Not matched");
		}
		
		//equalsIngorecase
		
		if(name.equalsIgnoreCase(s)){
			System.out.println(" .equalsIngoreCase() matched");
		}else {
			System.out.println(".equalsIngoreCase () Not matched");
		} 
		
		//contains
		String value="Selenium";
		
		boolean contains = value.contains("S*");
		System.out.println("contains() :"+ contains);
		
		//chatAt- index value start from '0'
		char charAt = value.charAt(4);
		System.out.println("charAt (4) :"+ charAt);
		
		//toCharArray

        char[] ch = value.toCharArray();
        for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
        
        String data="String";
        String d="";
        //gnirtS
        char[] charArray = data.toCharArray();
        
        for (int i = charArray.length-1 ; i >=0 ; i--) {
        	d=d+charArray[i];
		}
        System.out.println(d);
      
     System.out.println(value.toUpperCase());   
     System.out.println(value.toLowerCase());
        
		
	}

}
