package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class Hrmpage extends PageObject {
	
	public void enterUname()
	{
		$(By.id("txtUsername")).type("admin");
	}
	
	public void enterPassword()
	{
		$(By.id("txtPassword")).type("admin123");
	}
	
	public void ClickonLogin()
	{
		$(By.id("btnLogin")).click();
	}

}
