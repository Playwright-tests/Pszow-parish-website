package qa.pageobject;

import com.microsoft.playwright.Page;

public class SacramentsSideMenu extends Menu {

    private final String CHRISTENING_SELECTOR = "menu-item-24798";
    private final String FIRST_COMMUNION_SELECTOR = "menu-item-24872";
    private final String CONFIRMATION_SELECTOR = "menu-item-24799";
    private final String MARRIAGE_SELECTOR = "menu-item-24797";

    public SacramentsSideMenu(Page page) {

        super(page);
    }

    @io.qameta.allure.Step("Click the \"Chrzest\" link")
    public void clickChristeningLink() {

        clickLink(CHRISTENING_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Pierwsza Komunia\" link")
    public void clickFirstCommunionLink() {

        clickLink(FIRST_COMMUNION_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Bierzmowanie\" link")
    public void clickConfirmationLink() {

        clickLink(CONFIRMATION_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Małżeństwot\" link")
    public void clickMarriageLink() {

        clickLink(MARRIAGE_SELECTOR);
    }
}
