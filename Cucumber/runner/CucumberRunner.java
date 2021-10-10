package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
				 glue = {"steps","hooks"}, 
				 monochrome = true,
				 publish = true,
				// tags = "@smoke" //execute all the scenarios having @smoke
				// tags = "@smoke or @functional" // excute the scenarios having either @smoke or @functional
				// tags = "@smoke and @functional" //excute testcases having both @smoke and @functional
				 tags = "not @regression" //execute all the testcases except @regression
				 )
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
