package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class GuruDemoPages extends BrowserUtils {
    public GuruDemoPages(){PageFactory.initElements(driver,this);}

    @FindBy(xpath ="//h3[.='Add Tariff Plan']") private WebElement tariffPlan;
    @FindBy(xpath = "//h1[.=Add Tariff Plans']") private WebElement profileHeader;
    @FindBy( id="rental1") private WebElement monthlyRental;
    @FindBy(id="local_minutes") private WebElement localMin;
    @FindBy(id = "inter_minutes") private WebElement internationalMin;
    @FindBy(id = "sms_pack") private WebElement smsPack;
    @FindBy(id="minutes_charges") private WebElement localPerMinChar;
    @FindBy(id = "inter_charges") private WebElement internationalPerMinChar;
    @FindBy(id= "sms_charges") private WebElement smsPerChar;
    @FindBy(xpath = "//input[@value='submit']") private WebElement submitButton;
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']") private  WebElement verification;

    public void setTariffPlan(){tariffPlan.click();}
    public void setProfileHeader(String expectedHeader){Assert.assertEquals(expectedHeader,profileHeader.getText());}
    public void setMonthlyRental(String MonthlyRental){monthlyRental.sendKeys(MonthlyRental);}
    public void setLocalMin(String LocalMin){localMin.sendKeys(LocalMin);}
    public void setInternationalMin(String InternationalMin){internationalMin.sendKeys(InternationalMin);}
    public void setSmsPack(String SmsPack){smsPack.sendKeys(SmsPack);}
    public void setLocalPerMinChar(String LocalPerMinChar){localPerMinChar.sendKeys(LocalPerMinChar);}
    public void setInternationalPerMinChar(String InternationalPerMinChar){internationalPerMinChar.sendKeys(InternationalPerMinChar);}
    public void setSmsPerChar(String SmsPerChar){smsPerChar.sendKeys(SmsPerChar);}
    public void setSubmitButton(){submitButton.click();}
    public void setVerification(String expected){Assert.assertEquals(expected,verification.getText());}
}
