package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import qa.base.BasePage;

import java.util.List;

public class PhotoGalleryPage extends BasePage {

    private final String ELEMENTOR_ACCORDION_SELECTOR = ".elementor-accordion";
    private final String ELEMENTOR_ACCORDION_ITEM_SELECTOR = "div.elementor-accordion-item";
    private List<Locator> items;

    public PhotoGalleryPage(Page page) {

        super(page);
    }

    public void findItems() {

        items = getPage().locator(ELEMENTOR_ACCORDION_SELECTOR)
                .locator(ELEMENTOR_ACCORDION_ITEM_SELECTOR).all();
    }

    public int getItemsCount() {

        return items.size();
    }

    public Item getItem(int index) {

        return new Item(getPage(), items.get(index));
    }

    public void clickButton(String name) {

        getPage().getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName(name)).click();
    }
}
