package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class LoginStepDefinitions {

    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Admin\\IdeaProjects\\scenarioSkillFactory\\src\\test\\resources\\chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("I am on the SkillFactory login page")
    public void i_am_on_the_skill_factory_login_page() {
        driver.get("https://skillfactory.ru/login");
    }

    @When("I enter valid email and password")
    public void i_enter_valid_email_and_password() {
        loginPage.enterEmail("valid-email@example.com");
        loginPage.enterPassword("password123");
    }

    @When("click the {string} button")
    public void click_the_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should see the {string} message")
    public void i_should_see_the_message(String message) {
        wait.until(ExpectedConditions.textToBePresentInElement((WebElement) loginPage.getWelcomeMessage(), message));
        assertEquals(message, ((WebElement) loginPage.getWelcomeMessage()).getText());
    }
}