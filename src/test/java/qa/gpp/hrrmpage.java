package qa.gpp;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class hrrmpage extends PageObject {

    @FindBy(xpath="//input[@id='txtUsername']")
    WebElement uname;

    @FindBy(xpath="//input[@id='txtPassword']")
    WebElement loginpassword;

    @FindBy(xpath="//input[@id='btnLogin']")
    WebElement loginbutton;






}
