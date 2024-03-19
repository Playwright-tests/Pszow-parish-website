package qa.playwright;

import com.microsoft.playwright.BrowserType;

public class FirefoxPlaywrightBrowserLauncher extends PlaywrightBrowserLauncher {


    @Override
    protected void setBrowser() {

        browser = playwright
                .firefox()
                .launch(new BrowserType.LaunchOptions().setHeadless(true).setSlowMo(50));

        setBrowserInfo();
    }
}
