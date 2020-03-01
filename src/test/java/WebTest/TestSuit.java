package WebTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;
import static org.testng.Assert.assertTrue;

public class TestSuit extends BaseTest {
    String registrationSuccessMessageExpected = "Your registration completed";
    HomePage homePage = new HomePage();
    CompareSuccessPage compareSuccessPage = new CompareSuccessPage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ProductPage productPage = new ProductPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    BooksCategoryPage booksCategoryPage = new BooksCategoryPage();
    DigitalDownloadPage digitalDownloadPage = new DigitalDownloadPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsAGuestPage checkoutAsAGuestPage = new CheckoutAsAGuestPage();
    OnePageCheckoutPage onePageCheckoutPage = new OnePageCheckoutPage();
    News news = new News();
    PaymentPage paymentPage = new PaymentPage();
    ConfirmPage confirmPage = new ConfirmPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @Test
    public void verifyGuestUserShouldAbleToCheckOutSuccessfully()
    {
        //verifyUserShouldOnHomePage
        homePage.verifyUserIsOnHOmePage();
        //clickOnDigitalDownloadsCategory
        homePage.clickOnDigitalDownloadsCategory();
        //verifyUserShouldOnDigitalDownloadsPage
        digitalDownloadPage.verifyUserShouldOnDigitalDownloadsPage();
        //ClickOnAddToCartButton
        digitalDownloadPage.clickOnAddToCartButton();

        //ClickOnShoppingCart
        digitalDownloadPage.clickOnShoppingCart();
        // verifyUserShouldOnShoppingCartPage
        shoppingCartPage.verifyUserShouldOnShoppingCartPage();
        //ClickOnTickBox
        shoppingCartPage.clickOnTickBox();
        //ClickOnCheckoutButton
        shoppingCartPage.clickOnCheckoutButton();
        // verifyUserShouldOnCheckoutAsAGuestPage
        checkoutAsAGuestPage.verifyUserShouldOnCheckoutAsAGuestPage();
        //clickOCheckoutAsGuestButton
        checkoutAsAGuestPage.clickOCheckoutAsGuestButton();
        //verifyUserShouldOnOnePageCheckoutPage
        onePageCheckoutPage.verifyUserShouldOnOnePageCheckoutPage();
        //ClickOnAllCompulsoryFilled
        onePageCheckoutPage.fillInAllCompulsoryFields();
        //ClickOnCreditCard
        paymentPage.selectAndFillCreditCardDetails();

        //ClickOnConfirm
        confirmPage.clickOnConfirm();

        //VerifyUserSeeThankYouMessage
        checkoutCompletePage.verifyOrderSuccessMessage();

    }

    @Test
    public void verifyUserShouldAbleToChangeCurrency()
    {
        //verifying default home page currency
        homePage.verifyingCurrencySymbolPresent();

        //change currency to another one
        homePage.selectCurrencyFromDropDown();

        //verifying default home page currency
        homePage.verifyingCurrencySymbolPresent();
    }

    @Test
    public void verifyAddToCArtButtonIsPresentOnAllFeatureProduct()
    {
         //verifying add to cart button present in all feature product
         homePage.checkAddToCartButtonOnAllProducts();
    }

    @Test
    public void verifyGuestUserShouldAbleToAddNewCommentInNobCommerce()
    {
        //User click on view news archive
        homePage.clickOnDetailsButton();
        news.userNavigateToFirstDetailOnNews();
        news.addNewComment();
        news.submitNewComment();
        news.verifyNewCommentAddedSuccessfully();

    }

    @Test
    public void userShouldAbleToRegisterSuccessfully() {
        //user clicks on register button
        homePage.clickOnRegisterButton();
        takeScreenShot("sample");
        //verify that user is on register page
        registrationPage.verifyUserIsOnRegisterPage();
        //fill up registration details
        registrationPage.userEntrsRegistrationDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

    }

    @Test
    public void userShouldBeAbleToCompareTwoDifferentProductSuccessfully() {

        //select two products & click compare
        homePage.addProductsForComparison();
        //verify compare success massage
        compareSuccessPage.verifyUserShouldSeeCompareSuccessMassage();

    }

    @Test
    public void registeredUserShouldBeAbleToReferAProductTOAFriend() {
        homePage.clickOnRegisterButton();
        registrationPage.userEntrsRegistrationDetails();

        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();

        //click on continue registration
        registrationResultPage.pageContinue();

        //click on any product
        homePage.clickOnProduct();

        //click on product
        productPage.clickOnEmail();

        //verify user in product email a friend page
        emailAFriendPage.verifyUserOnEmailAFriendPage();

        //user entering details
        emailAFriendPage.emailAFriendDetails();

        //verify email a friend massage display
        emailAFriendPage.verifyUserSeeSuccessMessageOfEmailAFriend();

    }

    @Test
    public void nonRegisteredUserShouldNotBeAbleToReferAProductToAFriend() {
//        click on any product
        homePage.clickOnProduct();

      //  Enter friends email
        productPage.clickOnEmail();

        //verify user in product email a friend page
        emailAFriendPage.verifyUserOnEmailAFriendPage();

        //Enter friend details
        emailAFriendPage.emailAFriendDetails();

       // verify error massage
        emailAFriendPage.verifyUserSeeErrorMessage();
    }

    @Test
    public void userShouldBeAbleToSortProductHighToLowByPrice() {
        sleep(3);

        //click on book category
        homePage.clickOnBookCategory();

        //verify user on books category page
        booksCategoryPage.verifyUserShouldOnCategoryPage();

        //select sort by opitions High to Low
        booksCategoryPage.selectCategoryOpitionsHighToLow();

        // verify price organised high to low
//        booksCategoryPage.verifyPriceOrganisedHighToLow();
    }


//    @Test
    public void printPriceForEachProduct()
    {
        List<WebElement> productList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
                for (WebElement we: productList)
                {
                    System.out.println(we.getText());
                    System.out.println("***********");
                   assertTrue(we.getText().contains("$"),"$ not found in price " + we.getText());
                }

    }

    {


    }







}

