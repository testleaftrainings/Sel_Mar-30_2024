package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {

	public static void main(String[] args) throws IOException {
		/*
		 * step1 : set path for the report ExtentHtmlReporter 
		 * step2: Create object for ExtentReports
		 *  step3: attach the data with physical file (combine step1 and step2) 
		 *  step4: create testcase and adding details about testcase(tc name,tc desp,category,author) 
		 * step5: step level status(fail,pass) 
		 * step6: mandatory close report flush();
		 */
		
		//step1
		ExtentHtmlReporter er=new ExtentHtmlReporter("./reports/extentReport.html");
		
		//to retain old reports
		er.setAppendExisting(true);
		
		//step2
		ExtentReports repo=new ExtentReports();
		
		//step3
		repo.attachReporter(er);
		
		//step4 
		ExtentTest test=repo.createTest("Loginpage", "Login with Vaild Data");
		test.assignAuthor("Dilip");
		test.assignCategory("resgression");
		
		//step5
		
		test.pass("Enter the UserName",MediaEntityBuilder.createScreenCaptureFromPath(".././Snap/img.png").build());
		test.pass("Enter the password",MediaEntityBuilder.createScreenCaptureFromPath(".././Snap/img1.png").build());
		test.fail("Click on login button",MediaEntityBuilder.createScreenCaptureFromPath(".././Snap/img.png").build());
		
		ExtentTest test1=repo.createTest("CreateLead", "create lead with vaild adtaa");
		test1.assignAuthor("Gokul");
		test1.assignCategory("Smoke");
		
		//step5
		test1.pass("Enter the CompanyName");
		test1.pass("Enter the FirstName");
		test1.pass("Enter the LastName");
		
		
		//step6
		
		repo.flush();
		System.out.println("done");
		
		
	
	}

}
