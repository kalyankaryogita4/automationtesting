package setdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	EdgeDriver driver;
	@Given("launch oranghmr login page")
	public void create_ac()
	{
		driver = new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("enter username and password of orangehmr website")
	public void username_enter()
	{
	driver.findElement(By.name("username")).sendKeys("yogita");
	driver.findElement(By.name("password")).sendKeys("yogita@123");
	}
	@And("click on ligin button of orangehmr")
	public void login_hmr()
	{
		driver.findElement(By.tagName("button")).click();
		
	}
	@Then("orangehmr login should be successfull")
	public void validate()
	{
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
