package week3.day2;

public class LearnStringMethods {

	public static void main(String[] args) {

		//tolowercase
		String  name="TesT LEaf";
		String lowerCase = name.toLowerCase();
		System.out.println("LowerCase :"+lowerCase);
		
		//touppercase
		String upperCase = name.toUpperCase();
		System.out.println("UpperCase :"+upperCase);
		
		//split
		String value="No Such Element Exception";
		//NoSuchElementException
		//No
		//Such
		//Element
		//Exception
		//----------------------------
		//No Such El
		//m
		//nt Exc
		//ption
		String[] split = value.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		System.out.println(" ");
		//replace
		String data="Dilip";
		String replace = data.replace('i', '@');
		System.out.println("Replace :"+replace);
		
		//replaceAll
		String data1="Amazon have 100 Products";
		
		String replaceAll = data1.replaceAll("[ ]", "Dilip");
		System.out.println("ReplaceAll :"+replaceAll);
		//^ -retain the value a-z
		
		//Sub String
		String val="TestLeaf";
		String substring = val.substring(2);
		System.out.println("subString with index value :"+substring);
	
	String substring2 = val.substring(1, 8);
	//9-1=8
	//8-1=7
	System.out.println("with start n end index :"+substring2);
	
	//
	String values="10";
int parseInt = Integer.parseInt(values);
System.out.println(parseInt);
	
	
	
	
	}

}
