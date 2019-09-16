
package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Study\\Automation\\src\\main\\com.gmail\\MyApplication.feature", // path of the feature file
        glue={"StepDefination"},  // path for stepDefenation file
        //format = {"pretty", },  // use to genrate output file notworking in Intellij
        monochrome =  true ,     // Use for Console outupt formating
        dryRun = false            // Use to map the Feature file with Step defination file.
)
public class TestRunner {
}
