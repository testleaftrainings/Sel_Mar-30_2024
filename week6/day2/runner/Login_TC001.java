package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdef.ProjectSpecficMethod;



@CucumberOptions(features="src/test/java/features/Login.feature",
glue={"stepdef"},
monochrome=true,
publish=true,
tags="not @sanity"
)

public class Login_TC001 extends ProjectSpecficMethod{

	
	
	
}
