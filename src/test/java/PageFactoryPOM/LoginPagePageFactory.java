package PageFactoryPOM;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class LoginPagePageFactory {

    //If an element is not being changed frequently
    //We might use @CacheLocator and memorize the element so it will find it faster

    @FindBy(id = "name")
    private WebElement username;
    @FindBy(id = "password")
    private WebElement password;
    @FindBy(id = "login")
    private WebElement loginBtn;

    @FindBy(partialLinkText = "test")
    List<WebElement> myLinks;
    WebDriver driver;
    public LoginPagePageFactory(WebDriver driver) {
        this.driver = driver;
//        PageFactory.initElements(driver, this);
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(factory, this);
    }

    public void EnterCredentials(String username1, String password1){
        System.out.println("Username and password called");
        username.sendKeys(username1);
        password.sendKeys(password1);
    }
    public void ClickLoginButton(){
        System.out.println("Button click called");
        loginBtn.click();
    }

}
