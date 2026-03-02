package setdefinations;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class swaglab {
	EdgeDriver driver;
	@Given("launch swaglab website")
	public void launch_swaglab_website() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new EdgeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	@When("enter username as <uname> and password as <pass>")
	public void enter_username_as_uname_and_password_as_pass() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("swaglab login should be successfull")
	public void swaglab_login_should_be_successfull() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
