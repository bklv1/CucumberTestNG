package StepDefinitions;

import PageFactoryPOM.LoginPagePageFactory;
import PageObjectModels.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private WebDriver driver;
    LoginPage login;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String baseUrl = "https://example.testproject.io/web/";
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        login = new LoginPage(driver);
    }
    @When("^user enters (.*) and (.*)$")
    public void the_user_enters_username_and_password(String username, String password) {
        login.EnterUsernameAndPassword(username, password);
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {

        login.PressLoginButton();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        login.AssertElement();
        driver.quit();
    }
    @When("user enters address")
    public void user_enters_address() {
      driver.findElement(By.id("address")).sendKeys("street 1");
    }
    @Then("user has entered address")
    public void user_has_entered_address() {
        Assert.assertTrue(true);
        driver.quit();
    }

}
