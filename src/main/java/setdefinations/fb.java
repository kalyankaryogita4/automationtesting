package setdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class fb {

    EdgeDriver driver;

    @Given("Edge browser should be invoked")
    public void chrome_browser_should_be_invoked() {
        driver = new EdgeDriver();
   
    }

    @And("fb login page should be visible")
    public void fb_login_page_should_be_visible() {
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
    }

    @When("enter email {string} and password {string}")
    public void enter_email_and_password(String email, String pass) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("pass")).sendKeys(pass);
    }

    @And("click on login button of fb page")
    public void click_on_login_button_of_fb_page() {
    	driver.findElement(By.xpath("//div[@role='button']")).click();
      
    }

    @Then("login failed when user enter the invalid credential")
    public void login_failed_when_user_enter_the_invalid_credential() {
        System.out.println("Login Failed");
        
    }
}