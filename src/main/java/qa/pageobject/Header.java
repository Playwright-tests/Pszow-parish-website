package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.Getter;
import qa.base.BasePage;

@Getter
public class Header extends BasePage {

    private final Locator logo;
    private final MediaIconsSection mediaIconsSection;

    public Header(Page page) {

        super(page);
        logo = page.locator(".custom-logo-link");
        mediaIconsSection = new MediaIconsSection(page);
    }

    @io.qameta.allure.Step("Click the logo")
    @io.qase.api.annotation.Step("Click the logo")
    public void clickLogo() {

        logo.click();
    }
}
