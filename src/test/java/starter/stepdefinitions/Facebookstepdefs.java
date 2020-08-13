package starter.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.FacebookLogin;
import pages.FbImple;
import pages.Homepage;

public class Facebookstepdefs extends FacebookLogin {
	
	static FacebookLogin fbloginn;
@Managed
static WebDriver driver;
	@Steps
	FbImple fb;
	//FacebookLogin fb =new FacebookLogin();
	@Given("User is in Facebook Loginpage")
	public void user_is_in_Facebook_Loginpage() throws InterruptedException {
	   Thread.sleep(5000);
	   fb.openapplication();
	   String title=driver.getTitle();
	   System.out.println(title);
	  
	}
	        
	@When("^User enters \"(.*)\" in firstname field$")
	public void userenters_sangeeth_infirstnamefield(String username) {
		
fb.enterusername(username);
		
	}


//	@Given("^I am on the (.*) page$")
//	public static Object i_am_on_the_Page(String pageName) throws Exception {
//		//String appendStr = "Page";
//		//pageName = pageName.trim().replace(" ", "") + appendStr;
//		Object pageObj = PageFactory.initElements(driver, Class.forName("qa.gpp.Pages" + "." + pageName));
//		System.out.println("The Web elements initialized for " + pageName);
//		return pageObj;
//
//	}
//
	@When("^User enters \"(.*)\" in Lastnamefield$")
	public void userenters_surname_inLastnamefield(String surname) {
		fb.enterlastname(surname);
	}

	@When("^User enters \"(.*)\" in emailaddress field$")
	public void user_enters_value_in_emailaddress_field(String emailadd) {
	  // fb.enteremailaddress(emailadd);
		fb.enteremailaddress(emailadd);
	}


@When("User enters {string} in re-enteremailaddress field")
public void user_enters_in_re_enteremailaddress_field(String reenteremail) {
    fb.reenteremailaddress(reenteremail);
}

@When("user enters {string} in password field")
public void user_enters_in_password_field(String passwordvalue) {
    fb.enterpassword(passwordvalue);
}
@When("user selects {string} radiobutton")
public void user_selects_radiobutton(String gendervalue) {
	fb.selectradiobutton(gendervalue);


}

@When("user selcts {string} value in dropdown")
public void user_selcts_dayvalue_in_dropdown(String dayvalue) {
    fb.selectdayvalue(dayvalue);
}

@When("user selects {string} value in dropdown")
public void user_selects_monthvalue_in_dropdown(String monthvalue) {
    fb.selectmonthvalue(monthvalue);
    
  
}

@When("user selcts {string} value in year dropdown")
public void user_selcts_value_in_year_dropdown(String yearvalue) {
	fb.selectyearvalue(yearvalue);
	
    
}


//@Then("user click on signup button and able to signup")
//public void user_click_on_signup_button_and_able_to_signup() throws InterruptedException {
//	fb.signupclick();
//	  
//	  Thread.sleep(10000);
//}


@Then("user click on signup button and able to signup")
public void user_click_on_signup_button_and_able_to_signup() throws InterruptedException {
	fb.signupclick();
	
	  Thread.sleep(10000);
}


@Then("verify otp is trigerred for user signup")
public void verify_otp_is_trigerred_for_user_signup() throws InterruptedException {
	WebElement element = (new WebDriverWait(driver, 100))
			   .until(ExpectedConditions.visibilityOf(fb.webele()));
	//Thread.sleep(5000);
	String title=driver.getTitle();
	System.out.println("the title is"+title);
	
    
}



@When("user enter {string} in loginemail field")
public void user_enter_in_loginemail_field(String string) {
    fb.fbusername(string);
}



@When("user enters {string} in loginpasword field")
public void user_enters_in_loginpasword_field(String string) {
    fb.fbpassword(string);
}


@When("user click on loginbutton")
public void user_click_on_loginbutton() throws InterruptedException {
    fb.loginclick();
}

@Then("verify errormessage {string} in the screen")
public void verify_errormessage_in_the_screen(String string) {
	
	WebElement element = (new WebDriverWait(driver, 10))
			   .until(ExpectedConditions.visibilityOf(fbloginn.fbLoginalert));
					   

String c=	fb.loginalert();
System.out.println(c);

if (string.contentEquals(c))
{


  Assert.assertEquals("values are equal", string, c);
}
else
{
	Assert.fail("Values are not equal");
}
 
  
   
   
}




}