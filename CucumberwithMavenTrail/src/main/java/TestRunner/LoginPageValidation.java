package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\Vineeth V\\eclipse-workspace\\CucumberwithMavenTrail\\src\\main\\java\\feature\\login.feature",
glue ="C:\\Users\\Vineeth V\\eclipse-workspace\\CucumberwithMavenTrail\\src\\main\\java\\StepDefination\\")

public class LoginPageValidation {

}
