package WebTest;

import org.openqa.selenium.By;

public class DigitalDownloadPage extends Utils
{
    private By _addToCartButton = By.xpath("//input[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/34/1/1\"),!1']");
    private By _shoppingCartButton = By.className("cart-label");
    public static void verifyUserShouldOnDigitalDownloadsPage()
    {
        assertURL("digital-downloads");

    }

    public void clickOnAddToCartButton()
    {
        clickOnElement(_addToCartButton);
    }

    public void clickOnShoppingCart()
    {
        clickOnElement(_shoppingCartButton);
    }
}
