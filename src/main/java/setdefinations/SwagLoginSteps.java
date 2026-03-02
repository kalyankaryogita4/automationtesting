package setdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class SwagLoginSteps {

    WebDriver driver;

    @Given("launch swaglab website")
    public void launch_swaglab_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @When("enter username as {string} and password as {string}")
    public void enter_username_and_password(String uname, String pass) {
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.id("user-name")).sendKeys(uname);

        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(pass);

        driver.findElement(By.id("login-button")).click();
    }

    @Then("swaglab login should be successfull")
    public void swaglab_login_should_be_successfull() {

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("inventory.html")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}