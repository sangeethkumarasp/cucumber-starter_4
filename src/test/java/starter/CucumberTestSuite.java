package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
        plugin = {"pretty"},
       // features = "src/test/resources/features//search/search_by_keyword.feature"
        		features = "src/test/resources/features",
        		tags={"@tag9"}
        
)
public class CucumberTestSuite {}
