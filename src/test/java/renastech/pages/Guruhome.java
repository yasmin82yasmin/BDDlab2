package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowserUtils;

public class Guruhome extends BrowserUtils {
    public Guruhome(){PageFactory.initElements(driver,this);  }
    @FindBy(xpath="//a[.='Add Customer']")
    private WebElement addCostumer;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement header2;
    @FindBy(xpath="//label[@for='done']")
    private WebElement doneButton;
    @FindBy(xpath="//label[@for='pending']")
    private WebElement pendingButton;
    @FindBy(id="fname")
    private WebElement fName;
    @FindBy(id="lname")
    private WebElement lName;
    @FindBy(id="email")
    private WebElement emailID;
    @FindBy(name="addr")
    private WebElement addressBox;
    @FindBy(id="telephoneno")
    private WebElement pNumber;


    public void setAddCostumer(){clickWithWait(addCostumer);}
    public void setHeader2(String expectedheader2){
        Assert.assertEquals(expectedheader2,header2.getText());}
    public void setDoneButton(String DoneButton){clickWithWait(doneButton);}
    public void setPendingButton(String PendingButton){clickWithWait(pendingButton);}

    public void setBackgroundCheck (String Background){
        if (Background.equalsIgnoreCase(pendingButton.getText())){

            pendingButton.click();
        } else {
            doneButton.click();
        }
    }
    public void setFName(String fname){enterText(fName,fname);}
    public void setLName(String lname){enterText(lName,lname);}
    public void setEmailID(String email){enterText(emailID,email);}          //{emailID.sendKeys(email);}
    public void setAddressBox(String address){enterText(addressBox,address);}
    public void setPNumber(String number){enterText(pNumber,number);}


}