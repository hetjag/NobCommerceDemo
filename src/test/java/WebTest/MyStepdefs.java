
package WebTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    CompareSuccessPage compareSuccessPage = new CompareSuccessPage();


    @Given("user is on register page")
    public void userIsOnRegisterPage() {
        homePage.verifyUserIsOnHOmePage();
        homePage.clickOnRegisterButton();
    }

    @When("user enters all registration details")
    public void userEntersAllRegistrationDetails() {
        registrationPage.verifyUserIsOnRegisterPage();
        registrationPage.userEntrsRegistrationDetails();
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registrationPage.userClicksOnRegisterSubmitButton();
    }

    @Then("user should able to successfully")
    public void userShouldAbleToSuccessfully() {
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

    @Given("I am on the NopeCommerce  homepage")
    public void iAmOnTheNopeCommerceHomepage() {
    }

    @When("I click on two product for add compare list")
    public void iClickOnTwoProductForAddCompareList() {
        homePage.addProductsForComparison();
    }

    @And("i click compare product")
    public void iClickCompareProduct() {
        homePage.clickCompareButton();

    }

    @Then("I should able to compare two product and see <compare products> message")
    public void iShouldAbleToCompareTwoProductAndSeeCompareProductsMessage() {
        compareSuccessPage.verifyUserShouldSeeCompareSuccessMassage();

    }
}
