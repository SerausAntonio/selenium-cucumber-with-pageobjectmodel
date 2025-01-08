package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;

public class ContactUs_Steps extends Base_PO {
    private WebDriver driver= getDriver();

    private ContactUs_PO contactUs_PO;

    public ContactUs_Steps(ContactUs_PO contactUs_PO){
        this.contactUs_PO = contactUs_PO;
    }

    @Given("I access the webdriver university contact us page")
    public void iAccessTheWebdriverUniversityContactUsPage() {

        contactUs_PO.navigateTo_WebDriverUniversity_ContactUs_Page();

    }

    @When("I enter a unique firstname")
    public void iEnterAUniqueFirstname() {
          contactUs_PO.setFirstName("Joice");
    }
    @And("I enter a unique lastname")
    public void iEnterAUniqueLastname() {
       contactUs_PO.setLastName("Sloan");
    }

    @And("I enter a unique email adress")
    public void iEnterAUniqueEmailAdress() {
        contactUs_PO.setEmailAdress("joice.sloan@gmail.com");
    }

    @And("I add a unique comment")
    public void iAddAUniqueComment() {

        contactUs_PO.setMessage("this is a message");
    }

    @And("I click on the submit button")
    public void iClickOnTheSubmitButton() {
         contactUs_PO.clickOnSummitButton();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void iShouldBePresentedWithASuccessfulContactUsSubmissionMessage() {
        By reply = By.id("contact_reply");
        String expectedReply = "Thank You for your Message!";
        String actualReply = driver.findElement(reply).getText();
        Assert.assertEquals(actualReply,expectedReply);
    }

    @When("I enter a specific firstname {string}")
    public void iEnterASpecificFirstname(String firstName) {
        sendKeys(By.name("first_name"),firstName);

    }

    @And("I enter a specific lastname {string}")
    public void iEnterASpecificLastname(String lastName) {
        sendKeys(By.name("last_name"),lastName);

    }

    @And("I enter a specific email adress {string}")
    public void iEnterASpecificEmailAdress(String email) {
        sendKeys(By.name("email"),email);

    }

    @And("I add a specific comment {string}")
    public void iAddASpecificComment(String comment) {
        sendKeys(By.name("message"),comment);

    }
}
