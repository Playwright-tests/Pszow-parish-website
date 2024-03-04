package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import qa.base.BasePage;

public class PhotoGalleryPage extends BasePage {
    private final String ELEMENTOR_ACCORDION_SELECTOR = ".elementor-accordion";

    public PhotoGalleryPage(Page page) {

        super(page);
    }

    @io.qameta.allure.Step("Click the trigger element")
    @io.qase.api.annotation.Step("Click the trigger element")
    public void clickTriggerElement(String name) {

        getPage()
                .locator(ELEMENTOR_ACCORDION_SELECTOR)
                .getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName(name)).click();
    }
}
