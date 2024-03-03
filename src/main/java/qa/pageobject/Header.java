package qa.pageobject;

import com.microsoft.playwright.Page;
import qa.base.BasePage;

public class Header extends BasePage {

    private final String LOGO_SELECTOR = ".custom-logo-link";
    private MediaIconsSection mediaIconsSection;

    public Header(Page page) {

        super(page);
        mediaIconsSection = new MediaIconsSection(page);
    }

    @io.qameta.allure.Step("Click the logo")
    @io.qase.api.annotation.Step("Click the logo")
    public void clickLogo() {

        getPage().locator(LOGO_SELECTOR).click();
    }

    public MediaIconsSection getMediaIconsSection() {

        return mediaIconsSection;
    }
}
