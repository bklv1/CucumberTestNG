package StepDefinitions;

import PageFactoryPOM.LoginPagePageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsPF {
    WebDriver driver;
    LoginPagePageFactory pageFactory;
    @Given("user is on pagefactory page")
    public void user_is_on_pagefactory_page() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        String baseUrl = "https://example.testproject.io/web/";
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
    }
    @When("the pagefactory enters username and password")
    public void the_pagefactory_enters_username_and_password() {
        pageFactory = new LoginPagePageFactory(driver);
        pageFactory.EnterCredentials("ceco","12345");
    }
    @When("clicks on pagefactory button")
    public void clicks_on_pagefactory_button() {
        pageFactory.ClickLoginButton();
    }
    @Then("pagefactory is navigated to the home page")
    public void pagefactory_is_navigated_to_the_home_page() {

        driver.quit();
    }
}
