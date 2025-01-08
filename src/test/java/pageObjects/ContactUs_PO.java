package pageObjects;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_PO extends Base_PO{
    public ContactUs_PO(){
        super();
    }

  private @FindBy(name="first_name")
  WebElement firstnameTxtField;

   private @FindBy(name="last_name")
    WebElement lastnameTxtField;

   private @FindBy(name="email")
    WebElement emailTxtField;

   private @FindBy(name="message")
    WebElement messageTxtField;

   private @FindBy(xpath="//input[@type='submit']")
    WebElement submitButton;

     public void navigateTo_WebDriverUniversity_ContactUs_Page(){
        navigateTo_URL("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    public void setFirstName(String firstname){
         firstnameTxtField.sendKeys(firstname);
    }
    public void setLastName(String lastname){
        lastnameTxtField.sendKeys(lastname);
    }
    public void setEmailAdress(String email){
        emailTxtField.sendKeys(email);
    }
    public void setMessage(String message){
        messageTxtField.sendKeys(message);
    }
    public void clickOnSummitButton(){
         submitButton.click();
    }
}
