package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;

import static drivers.DriverFactory.getDriver;

public class Contact_Us_Steps extends Base_PO {
    private WebDriver driver= getDriver();

    @Given("I access the webdriver university contact us page")
    public void iAccessTheWebdriverUniversityContactUsPage() {

        navigateTo_URL("https://webdriveruniversity.com/Contact-Us/contactus.html");
        By pageTitle = By.xpath("//*[@class='section_header']");
        String expectedPageTitle = "CONTACT US";
        String actualPageTitle = driver.findElement(pageTitle).getText();
        Assert.assertEquals(actualPageTitle,expectedPageTitle);
    }

    @When("I enter a unique firstname")
    public void iEnterAUniqueFirstname() {
         sendKeys(By.name("first_name"),"Joice");
    }
    @And("I enter a unique lastname")
    public void iEnterAUniqueLastname() {
       sendKeys(By.name("last_name"),"Sloan");
    }
    @And("I enter a unique email adress")
    public void iEnterAUniqueEmailAdress() {
        sendKeys(By.name("email"),"joice.sloan@gmail.com");
    }
    @And("I add a unique comment")
    public void iAddAUniqueComment() {
        sendKeys(By.name("message"),"this is a message");
    }

    @And("I click on the submit button")
    public void iClickOnTheSubmitButton() {
       waitForWebElementAndClick(By.xpath("//input[@type='submit']"));
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
