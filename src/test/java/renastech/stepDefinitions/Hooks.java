package renastech.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.BrowserUtils;
import renastech.utils.ConfigurationReader;
import renastech.utils.Driver;

public class Hooks extends BrowserUtils {

    @Before
    public void setup() {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperties("urlguru"));

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[]data=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png", scenario.getName());
        }
    }
}