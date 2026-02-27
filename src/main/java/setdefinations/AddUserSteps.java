package setdefinations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.en.*;

public class AddUserSteps {

	EdgeDriver driver;

    @Given("User launch the browser")
    public void user_launch_the_browser() {
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @When("User open add user page")
    public void user_open_add_user_page() {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/addUser");
    }

    @When("User enter first name")
    public void user_enter_first_name() {
        driver.findElement(By.id("firstName")).sendKeys("Yogita");
    }

    @When("User enter last name")
    public void user_enter_last_name() {
        driver.findElement(By.id("lastName")).sendKeys("Test");
    }

    @When("User enter email")
    public void user_enter_email() {
        driver.findElement(By.id("email")).sendKeys("yogita123@gmail.com");
    }

    @When("User enter password")
    public void user_enter_password() {
        driver.findElement(By.id("password")).sendKeys("Password123");
    }

    @When("User click on submit button")
    public void user_click_on_submit_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("User should be added successfully")
    public void user_should_be_added_successfully() {

        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("contactList")) {
            System.out.println("User Added Successfully");
        } else {
            System.out.println("User Not Added");
        }

        driver.quit();
    }
}