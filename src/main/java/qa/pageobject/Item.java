package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import qa.base.BasePage;

public class Item extends BasePage {

    private final String ICON_CLOSED_SELECTOR = "span.elementor-accordion-icon-closed";
    private final String ICON_OPENED_SELECTOR = "span.elementor-accordion-icon-opened";
    private final String TITLE_SELECTOR = "a.elementor-accordion-title";
    private final String GALLERY_CONTENT_SELECTOR = "div.elementor-tab-content.elementor-clearfix.elementor-active";

    private final Locator parent;

    public Item(Page page, Locator parent) {

        super(page);
        this.parent = parent;
    }

    public void clickIconClosed() {

        parent.locator(ICON_CLOSED_SELECTOR).click();
    }

    public void clickIconOpened() {

        parent.locator(ICON_OPENED_SELECTOR).click();
    }

    public Locator getGalleryContentLocator() {

        return parent.locator(GALLERY_CONTENT_SELECTOR);
    }

    public String getTitle() {

        return parent.locator(TITLE_SELECTOR).textContent();
    }
}
