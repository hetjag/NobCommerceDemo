package WebTest;


import org.junit.After;
import org.junit.Before;


public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();
@Before
    public void openBrowser() {
        browserSelector.setUpBrowser();

    }

   @After
    public void closeBrowser() {
        browserSelector.closeBrowser();

    }
}
