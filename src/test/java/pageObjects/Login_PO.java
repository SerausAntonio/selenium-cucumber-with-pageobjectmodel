package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PO extends Base_PO {
    private @FindBy(id="text")
    WebElement usernameTxtField;

    private @FindBy(id="password")
    WebElement passwordTxtField;

    private @FindBy(id="login-button")
    WebElement loginButton;

    public Login_PO(){
        super();

    }

    public void navigateTo_WebDriverUniversity_Login_Page(){
        navigateTo_URL("https://webdriveruniversity.com/Login-Portal/index.html");
    }
    public void setUsername(String username){
        usernameTxtField.sendKeys(username);
    }
    public void setPassword(String password){
        passwordTxtField.sendKeys(password);
    }

    public void clickOnLogin(){
        loginButton.click();
    }


}
