package setdefinations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoblaze {
	EdgeDriver driver;
	@Given("launch demoblaze website")
	public void launch_demoblaze()
	{
		driver = new EdgeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("user click on signup button on navbar")
	public void signup()
	{
		driver.findElement(By.id("signin2")).click();
	}
	
	@When("user enter username")
	public void username()
	{
		driver.findElement(By.id("sign-username")).sendKeys("mobita");;
	}
	
	@And("user enter password")
	public void password()
	{
	driver.findElement(By.id("sign-password")).sendKeys("1234567");
	}
	
	@And("click on signup button of demoblaze")
	public void sign_button()
	{
		driver.findElement(By.xpath("//button[@onclick='register()']"));
	}
	
	@Then("demoblaze signup successfully and should display alert msg")
	public void display_alert() throws InterruptedException
	{
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println("alert msg:"+al.getText());
		al.accept();
		driver.close();
	}
}
