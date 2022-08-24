package PageObjectModels;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    private By Username = By.id("name");
    private By Password = By.id("password");
    private By LoginButton = By.id("login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void EnterUsernameAndPassword(String username, String password)    {
        driver.findElement(Username).sendKeys(username);
        driver.findElement(Password).sendKeys(password);

    }
    public void PressLoginButton(){
        driver.findElement(LoginButton).click();
    }
    public void AssertElement(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement elementForAssertion = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout")));

        String assertMe = elementForAssertion.getAttribute("id");
        Assert.assertEquals("logout", assertMe);

    }
    public void QuitWhenExceptionIsThrown(){
        driver.quit();
    }

}
