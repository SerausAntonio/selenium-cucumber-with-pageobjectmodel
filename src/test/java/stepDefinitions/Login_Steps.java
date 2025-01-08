package stepDefinitions;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonToken;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

import static drivers.DriverFactory.getDriver;
import static org.testng.Assert.assertEquals;

public class Login_Steps extends Base_PO {
    private WebDriver driver = getDriver();

    private Login_PO login_po;

    public Login_Steps(Login_PO login_po){
        this.login_po = login_po;

    }
    @Given("I access the webdriver university login page")
    public void iAccessTheWebdriverUniversityLoginPage() {
        login_po.navigateTo_WebDriverUniversity_Login_Page();
     }

    @When("I enter a username {string}")
    public void iEnterAUsername(String userName) {
        login_po.setUsername(userName);
    }

    @And("I enter a password {string}")
    public void iEnterAPassword(String passwd) {
        login_po.setPassword(passwd);

    }
    @And("I click on the login button")
    public void iClickOnTheLoginButton() {
         login_po.clickOnLogin();
    }
    @Then("I should be presented with a {string}")
    public void iShouldBePresentedWithA(String validationMessage) {
        waitForAlertValidation(validationMessage);

    }


}
