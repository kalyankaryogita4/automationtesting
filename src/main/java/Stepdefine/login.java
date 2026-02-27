package Stepdefine;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("launch oranghmr login page")
	public void create_ac()
	{
		System.out.println("create account");
	}
	
	@When("enter email and password")
	public void launch_ac()
	{
		System.out.println("launch website");
	}
	@And("click on ligin button")
	public void click_ac()
	{
		System.out.println("step 1:click the bitton");
	}
	@Then("orangehmr login should be successfull")
	public void login_ac()
	{
		System.out.println("login successfully");
	}
	
}
