package qa.base;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import org.json.simple.parser.ParseException;
import org.testng.annotations.*;
import qa.support.JsonFileReader;
import qa.playwright.PlaywrightBrowserLauncher;
import qa.playwright.PlaywrightProvider;
import qa.support.BrowserType;

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

        String browserType = System.getenv("BROWSER_TYPE");

        BrowserType type =

                switch (browserType) {
                    case "chrome"-> BrowserType.CHROME;
                    case "firefox"-> BrowserType.FIREFOX;
                    case "edge"-> BrowserType.EDGE;
                    default -> throw new IllegalStateException("Unexpected value: " + browserType);
                };

        launcher = PlaywrightProvider.getFactory(type);
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
