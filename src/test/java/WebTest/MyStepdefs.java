
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
    ProductPage productPage = new ProductPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    BooksCategoryPage booksCategoryPage = new BooksCategoryPage();
    DigitalDownloadPage digitalDownloadPage = new DigitalDownloadPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsAGuestPage checkoutAsAGuestPage = new CheckoutAsAGuestPage();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
    PaymentPage paymentPage = new PaymentPage();
    ConfirmPage confirmPage = new ConfirmPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
    News news = new News();









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
    public void iClickCompareProduct() { homePage.clickCompareButton();}

    @Then("I should able to compare two product and see <compare products> message")
    public void iShouldAbleToCompareTwoProductAndSeeCompareProductsMessage() { compareSuccessPage.verifyUserShouldSeeCompareSuccessMassage(); }

    @Given("I am already registered on nopcommerce")
    public void iAmAlreadyRegisteredOnNopcommerce() {
        homePage.clickOnRegisterButton();
        registrationPage.userEntrsRegistrationDetails();
        registrationPage.userClicksOnRegisterSubmitButton();
    }
    @And("I am on product page")
    public void iAmOnProductPage() { homePage.navigateToHomepage(); }

    @When("I click on any product")
    public void iClickOnAnyProduct() { homePage.clickOnProduct(); }

    @And("I click on email a friend")
    public void iClickOnEmailAFriend() { productPage.clickOnEmail(); }

    @And("I enter all details for refer a product")
    public void iEnterAllDetailsForReferAProduct() { emailAFriendPage.emailAFriendDetails();}


    @And("I click on send email")
    public void iClickOnSendEmail() {
    }

    @Then("I should see <Your message has been sent>")
    public void iShouldSeeYourMessageHasBeenSent() {
        emailAFriendPage.verifyUserSeeSuccessMessageOfEmailAFriend();
    }
    @Then("I should see error message <Only registered customers can use email a friend feature>")
    public void iShouldSeeErrorMessageOnlyRegisteredCustomersCanUseEmailAFriendFeature() {
        emailAFriendPage.verifyUserSeeErrorMessage();
    }

    @When("I click on any category")
    public void iClickOnAnyCategory()
    {
        homePage.clickOnBookCategory();
    }

    @And("I select on high to low")
    public void iSelectOnHighToLow()
    {
        booksCategoryPage.selectCategoryOpitionsHighToLow();
    }

    @Then("I should see price organised high to low")
    public void iShouldSeePriceOrganisedHighToLow()
    {
        booksCategoryPage.verifyPriceOrganisedHighToLow();
    }

    @Given("guest user is on the Nopcommerce homepage")
    public void guestUserIsOnTheNopcommerceHomepage() {
    }

    @When("guest user click on Digitaldownlod button")
    public void guestUserClickOnDigitaldownlodButton()
    {
        homePage.clickOnDigitalDownloadsCategory();
    }

    @And("guest user can click on add to cart")
    public void guestUserCanClickOnAddToCart()
    {
        digitalDownloadPage.clickOnAddToCartButton();
    }

    @And("guest user can click on shipping cart")
    public void guestUserCanClickOnShippingCart()
    {
        digitalDownloadPage.clickOnShoppingCart();
    }

    @And("guest user can tick on terms box")
    public void guestUserCanTickOnTermsBox()
    {
        shoppingCartPage.clickOnTickBox();
    }

    @And("guest user can click on checkout")
    public void guestUserCanClickOnCheckout()
    {
        shoppingCartPage.clickOnCheckoutButton();
    }

    @And("guest user can click on checkout as guest")
    public void guestUserCanClickOnCheckoutAsGuest()
    {
         checkoutAsAGuestPage.clickOCheckoutAsGuestButton();
    }

    @And("guest user can enter all compulsory field")
    public void guestUserCanEnterAllCompulsoryField()
    {
        onePageCheckoutPage.fillInAllCompulsoryFields();
    }

    @And("guest user can click o n continue")
    public void guestUserCanClickONContinue()
    {
        onePageCheckoutPage.selectContinueButton();
    }
    @And("guest user can Enter Payment information")
    public void guestUserCanEnterPaymentInformation()
    {
        paymentPage.selectAndFillCreditCardDetails();
    }

    @And("guest user can click on payment button")
    public void guestUserCanClickOnPaymentButton()
    {
        paymentPage.paymentContinueButton();
    }

    @And("guest user can click on conform button")
    public void guestUserCanClickOnConformButton()
    {
        confirmPage.clickOnConfirm();
    }

    @Then("guest user can buy product successfully and see message")
    public void guestUserCanBuyProductSuccessfullyAndSeeMessage()
    {
        checkoutCompletePage.verifyOrderSuccessMessage();
    }

    @When("I change currency to USD")
    public void iChangeCurrencyToUSD()
    {
        homePage.selectCurrencyFromDropDown();
    }

    @Then("I can see all the prices have change to USD")
    public void iCanSeeAllThePricesHaveChangeToUSD()
    {
        homePage.verifyingCurrencySymbolPresent();
    }

    @Then("I also could have see add to cart button in all")
    public void iAlsoCouldHaveSeeAddToCartButtonInAll()
    {
        homePage.checkAddToCartButtonOnAllProducts();
    }


    @Given("user is on the Nopcommerce homepage")
    public void userIsOnTheNopcommerceHomepage() {
    }

    @When("user navigate to new comments")
    public void userNavigateToNewComments() {

        news.userNavigateToFirstDetailOnNews();
    }

    @And("user fills comment fields")
    public void userFillsCommentFields() {
        news.addNewComment();
    }

    @And("user click on new comment button")
    public void userClickOnNewCommentButton() {
        news.submitNewComment();
    }

    @Then("comment should be added and message display <News comment is successfully added.>")
    public void commentShouldBeAddedAndMessageDisplayNewsCommentIsSuccessfullyAdded() {
        news.verifyNewCommentAddedSuccessfully();
    }

    @And("I enter all details except own email")
    public void iEnterAllDetailsExceptOwnEmail() {
        emailAFriendPage.userFillsFriendDetailsWithoutOwnEmail();
    }

    @Given("user us on homepage")
    public void userUsOnHomepage()
    {homePage.verifyUserIsOnHOmePage();
    }

    @When("user clicks on {string} link from top menu")
    public void userClicksOnLinkFromTopMenu(String category)
    {
        homePage.clickOnCategoryLinks(category);
    }

    @Then("user should able to navigate to {string} successfully")
    public void userShouldAbleToNavigateToSuccessfully(String related_category_page)
    { Utils.assertURL(related_category_page);
    }
}
