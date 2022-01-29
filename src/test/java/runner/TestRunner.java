package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\dropdown.feature",
glue="stepdef",
monochrome=true,
dryRun=false)


public class TestRunner {

}
