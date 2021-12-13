package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/login.feature"},
                 glue = {"src/test/java/steps/LoginSteps.java"},
                 monochrome = true)
public class Runner {
}
