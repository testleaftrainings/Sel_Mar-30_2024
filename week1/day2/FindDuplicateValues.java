package week1.day2;

public class FindDuplicateValues {

	public static void main(String[] args) {
		
		int[] age= {18,32,45,18,45};
		//nested for loop
		//compare b/w two values
		
		//outer loop
		for (int i = 0; i < age.length; i++) {
			//age[0]=18
			//age[1]=32
			//age[2]=45
			//age[3]=32
			//age[4]=45
			
			//inner loop
			for (int j = i+1; j < age.length; j++) {
				//age[1]=32,age[2]=45,age[3]=32,age[4]=45
				//age[2]=45,age[3]=32,age[4]=45
				//age[3]=32,age[4]=45
				//age[4]=45
				if(age[i]==age[j]) {
					System.out.println("Duplicate value :"+age[j]);
					//32
					//45
				}
			}
		}
	}

}
