package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static org.junit.Assert.assertEquals;

import pages.LoginPage;

public class LoginStepDefinitions {

    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I am on the SkillFactory login page")
    public void i_am_on_the_skill_factory_login_page() {
        driver.get("https://skillfactory.ru/login");
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter valid email and password")
    public void i_enter_valid_email_and_password() {
        loginPage.enterEmail("valid-email@example.com");
        loginPage.enterPassword("password123");
        throw new io.cucumber.java.PendingException();
    }

    @When("click the {string} button")
    public void click_the_button(String string) {
        loginPage.clickLoginButton();
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should see the {string} message")
    public void i_should_see_the_message(String string) {
        wait.until(ExpectedConditions.textToBePresentInElement(loginPage.getWelcomeMessage(), "Welcome back"));
        assertEquals("Welcome back", loginPage.getWelcomeMessage().getText());
        throw new io.cucumber.java.PendingException();
    }

}