package attributes;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority = 2)
	public void createLead() {
		System.out.println(" createLead");
	}
	
	@Test(priority=-1)
	public void editLead() {
		System.out.println(" editLead");
	}
	
	
	@Test(enabled=false,priority=-4)
	public void duplicateLead() {
		System.out.println(" duplicateLead");
	}
}
