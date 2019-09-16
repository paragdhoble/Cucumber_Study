package StepDefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*

 */

public class SmokeTest {

    WebDriver driver;


    @Given("Open FF and start application")
    public void open_FF_and_start_application() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/login");
    }

    //Reg Exp:  Which is user for passing the value eg. Username & Password
    //1. \"([^\"]*)\"
//2. \"(.*)\"

   /* @When("Enter {string} and {string} and click on Signin Button")
    public void i_enter_vaild_username_and_password(String userName  , String password) {
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/form/button")).click();

    }*/

    @When("Enter {string} and {string} and click on Signin Button")
    public void i_enter_vaild_username_and_password(String userName  , String password) {
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[1]/form/button")).click();

    }

    @Then("User is able to login successfully")
    public void user_is_able_to_login_successfully() {
        driver.quit();
    }
}
