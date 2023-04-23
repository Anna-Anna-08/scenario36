package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    private final By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome back')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public By getWelcomeMessage() {
        return welcomeMessage;
    }
}