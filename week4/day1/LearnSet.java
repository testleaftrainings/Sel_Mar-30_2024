package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		int[] number= {41,8,2,3,81,9,4,6,5,10,9,6};
		
		Set<Integer> unq=new TreeSet<Integer>();
		
		Set<Integer> dup= new TreeSet<Integer>();
		
		//forloop
//		for (int i = 0; i < number.length; i++) {
//			unq.add(number[i]);
//		}
//		
//		System.out.println(unq);
		
		//foreach
		
		for (Integer i : number) {
			
			if(!unq.add(i)) {
				dup.add(i);
			}
		}
		System.out.println(unq);
		System.out.println(dup);
		
		//how convert set in the list
		
		List<Integer> data=new ArrayList<Integer>(unq);
		
		Integer integer = data.get(4);
		System.out.println(integer);
		
		
		String companyName="Google";
		//tocharArray
		//create empty set
		//foreach
		//print value
	}

}
