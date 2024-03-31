package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] age= {18,32,45,32,45};
		
		//size of the array
		//ctrl+2->'L'
		
		int length = age.length;
		System.out.println("length of the array :" +length);
		//find the index -0 
		System.out.println("index of 0 : "+age[0]);
		//find last index value
		System.out.println("last index value :"+age[length-1]);
		//Array to sort
		Arrays.sort(age);
		//18,32,32,45,45
		System.out.println("after sorting array :"+age[3]);
		//print all values from array
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			
		}
	}

}
