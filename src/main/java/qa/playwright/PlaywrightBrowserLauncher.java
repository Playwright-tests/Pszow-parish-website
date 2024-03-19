package qa.playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PlaywrightBrowserLauncher {

    protected Playwright playwright;
    @Getter
    protected Browser browser;
    @Getter
    protected BrowserContext browserContext;
    @Getter
    protected Page page;
    private final Logger logger = LoggerFactory.getLogger(PlaywrightBrowserLauncher.class);

    protected void setBrowserInfo() {

        logger.info("Browser: " + browser.browserType().name() + " " + browser.version());
    }

    protected void setPlaywright() {

        playwright = Playwright.create();
    }

    protected void setBrowserContext() {

        browserContext = browser.newContext();
    }

    protected void setPage() {

        page = browserContext.newPage();
    }

    protected abstract void setBrowser();

    public void create() {

        setPlaywright();
        setBrowser();
        setBrowserContext();
        setPage();
    }

    public void goToPage(String url) {

        logger.info("Opening page with url: " + url + " ...");

        page.navigate(url);
    }

    public void close() {

        logger.info("Closing page...");

        page.close();
    }
}
