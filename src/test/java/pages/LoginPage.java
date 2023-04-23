
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    private By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome back')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password123) {

    }

    public void clickLoginButton() {

    }

    public WebElement getWelcomeMessage() {
        return null;
    }
}