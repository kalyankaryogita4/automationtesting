package setdefinations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class addtocaertdemo {

    WebDriver driver;

    @Given("demobalze website should be launch")
    public void demobalze_website_should_be_launch() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.demoblaze.com/");
    }

    @When("click of samsung phone product")
    public void click_of_samsung_phone_product() {

        driver.findElement(By.linkText("Samsung galaxy s6")).click();
    }

    @When("click on add to cart button")
    public void click_on_add_to_cart_button() {

        driver.findElement(By.linkText("Add to cart")).click();
    }

    @When("handle the alert message")
    public void handle_the_alert_message() throws InterruptedException {

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());

        alert.accept();
    }

    @Then("validate the outcome of demoblaze add to cart")
    public void validate_the_outcome_of_demoblaze_add_to_cart() {

        driver.findElement(By.id("cartur")).click();

        String productName = driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']")).getText();

        if(productName.equals("Samsung galaxy s6")) {
            System.out.println("Product successfully added to cart");
        } else {
            System.out.println("Product not added");
        }

        driver.quit();
    }
}