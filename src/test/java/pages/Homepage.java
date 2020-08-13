package pages;

import net.thucydides.core.annotations.Step;

public class Homepage {
	
	Hrmpage hrmpage;
	
	@Step
	public void openapplication()
	{
		hrmpage.open();
	}
	@Step
	public void enterusername()
	{
		hrmpage.enterUname();
	}
	@Step
	public void enterpassword()
	{
		hrmpage.enterPassword();
	}
	@Step
	public void clickonloginbutton()
	{
		hrmpage.ClickonLogin();
	}
	
	
	
	
	

}
