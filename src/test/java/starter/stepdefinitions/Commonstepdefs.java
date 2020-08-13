package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.DeleteSession;
import org.openqa.selenium.support.PageFactory;
import pages.FbImple;
import pages.Utility;
import qa.gpp.hrrmpage;

import java.lang.reflect.Field;

public class Commonstepdefs extends Utility {
    static WebDriver driver;
    public static Object pageObj;
   public  static hrrmpage hrmp;

    private org.openqa.selenium.WebElement WebElement;


    @Given("^I am on the (.*) page$")
    public static Object i_am_on_the_Page(String pageName) throws Exception {
        hrmp.open();
        String appendStr = "Page";
        pageName = pageName.trim().replace(" ", "") + appendStr;
       // pageObj = PageFactory.initElements(driver, Class.forName("qa.gpp" + "." + pageName));
        pageObj = PageFactory.initElements(driver, Class.forName("qa.gpp.hrrmpage"));
        System.out.println("The Web elements initialized for " + pageName);

        return pageObj;

    }

    public static WebElement getWebElementByObjectAndName(Object object, String fieldName) {
        System.out.println("Getting WebElement for...." + fieldName);
        if (fieldName != null) {
            fieldName = fieldName.trim().replace(" ", "");
            fieldName = Character.toLowerCase(fieldName.charAt(0)) + fieldName.substring(1);
        }
        WebElement commonWebElement = null;
        Class<?> validationClass = object.getClass();
        Field[] fields = validationClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == WebElement.class) {
                field.setAccessible(true);
                if (field.getName().equals(fieldName)) {
                    try {
                        commonWebElement = (WebElement) field.get(object);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (commonWebElement == null) {
            System.out.println("Web elemnt with name " + fieldName + " is not declared in page " + object);
        }
        return commonWebElement;
    }


    @When("^i enter (.*) in (.*) (?:field|link|button|radiobutton|expander|checkbox|icon|tab)$")
    public void iEnterInField(String tex, String elementName) {
        //getWebElementByObjectAndName()

        //if (elementName.contains("Header")) {

                WebElement = getWebElementByObjectAndName(pageObj, elementName);
     boolean a=WebElement.isDisplayed();
     System.out.println(a);
                Utility.userinput(tex,WebElement);






    }
}



