package StepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

    WebDriver driver ;


    @Given("Open FF and start application")
    public void open_FF_and_start_application() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/ServiceLogin?");
    }

    @When("I enter vaild username and password")
    public void i_enter_vaild_username_and_password() {
        driver.findElement(By.id("identifierId")).sendKeys("Test@gmail.com");
    }

    @Then("User is able to login successfully")
    public void user_is_able_to_login_successfully() {
     driver.close();
     driver.quit();
    }
}
