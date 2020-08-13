package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.Homepage;

public class Loginstepdefinition {
	
	@Steps
	Homepage home;
	
	@Given("user is on Homepage")
	public void user_is_on_Homepage() {
	    home.openapplication();
	}

	@When("user Enters admin as username")
	public void user_Enters_admin_as_username() {
	    home.enterusername();
	}

	@When("user Enters admin{int} as password")
	public void user_Enters_admin_as_password(Integer int1) {
	    home.enterpassword();
	}

	@Then("user should able to login")
	public void user_should_able_to_login() {
	    home.clickonloginbutton();
	}

	
	

}
