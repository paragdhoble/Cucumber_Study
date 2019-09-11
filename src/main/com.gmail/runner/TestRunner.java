package runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Study\\Automation\\src\\main\\com.gmail\\MyApplication.feature",
                glue={"StepDefination"},
                //format = {"pretty", },
                monochrome =  true ,
                dryRun = false
)
public class TestRunner {
}
