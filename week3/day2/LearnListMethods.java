package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {

		List<String> mentors=new ArrayList<String>();
	
		mentors.add("Aravind");
		mentors.add("Vinoth");
		mentors.add("Gokul");
		mentors.add("Ragu");
		mentors.add("Vineeth");
		
		System.out.println("Add the mentors name :"+mentors);
	//add my name in index 2
		//index value start from '0'
		
		mentors.add(2, "Dilip");
		
		System.out.println(mentors);
		
		//get
		String string = mentors.get(5);
		System.out.println("get () :"+string);
		
		//
		mentors.add("Dilip");
		System.out.println(mentors);
		
		//remove
		mentors.remove(1);
		System.out.println(mentors);
		
		//sort
		Collections.sort(mentors);
		
		//System.out.println(mentors);
		
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
		
		//clear
		mentors.clear();
		System.out.println(mentors);
		
	
	}

}
