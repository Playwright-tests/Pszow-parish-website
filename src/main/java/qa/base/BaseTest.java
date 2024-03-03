package qa.base;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import org.json.simple.parser.ParseException;
import org.testng.annotations.*;
import qa.support.JsonFileReader;
import qa.playwright.PlaywrightBrowserLauncher;
import qa.playwright.PlaywrightProvider;
import qa.enums.BrowserType;

import java.io.IOException;

public class BaseTest {

    private PlaywrightBrowserLauncher launcher;

    @Parameters("fileName")
    @BeforeClass
    public void readTestData(@Optional("noFileName") String fileName) throws IOException, ParseException {

        if (!fileName.equals("noFileName")) {
            JsonFileReader.load(fileName);
        }
    }

    @BeforeMethod
    public void launch() {

        launcher = PlaywrightProvider.getFactory(BrowserType.CHROME);
        launcher.create();
    }

    protected void goToPage(String url) {

        launcher.goToPage(url);
    }

    protected BrowserContext getBrowserContext() {

        return launcher.getBrowserContext();
    }

    protected Page getPage() {

        return launcher.getPage();
    }

    @AfterMethod
    public void tearDown() {

        launcher.close();
    }
}
