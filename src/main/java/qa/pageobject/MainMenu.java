package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.Getter;

@Getter
public class MainMenu extends Menu {

    private final Locator announcementLink;
    private final Locator intentionsLink;
    private final Locator funeralsLink;
    private final Locator stewardsLink;
    private final Locator priestsLink;
    private final Locator confessionLink;
    private final Locator officeLink;

    public MainMenu(Page page) {

        super(page);

        announcementLink = page.locator("#menu-item-24562");
        intentionsLink = page.locator("#menu-item-1458");
        funeralsLink = page.locator("#menu-item-13836");
        stewardsLink = page.locator("#menu-item-19387");
        priestsLink = page.locator("#menu-item-1466");
        confessionLink = page.locator("#menu-item-18889");
        officeLink = page.locator("#menu-item-24859");
    }

    @io.qameta.allure.Step("Click the \"Ogłoszenia duszpasterskie\" link")
    @io.qase.api.annotation.Step("Click the \"Ogłoszenia duszpasterskie\" link")
    public void clickAnnouncementsLink() {

        announcementLink.click();
    }

    @io.qameta.allure.Step("Click the \"Intencje mszalne\" link")
    @io.qase.api.annotation.Step("Click the \"Intencje mszalne\" link")
    public void clickIntentionsLink() {

        intentionsLink.click();
    }

    @io.qameta.allure.Step("Click the\"Pogrzeby\" link")
    @io.qase.api.annotation.Step("Click the\"Pogrzeby\" link")
    public void clickFuneralsLink() {

        funeralsLink.click();
    }

    @io.qameta.allure.Step("Click the \"Szafarze\" link")
    @io.qase.api.annotation.Step("Click the \"Szafarze\" link")
    public void clickStewardsLink() {

        stewardsLink.click();
    }

    @io.qameta.allure.Step("Click the \"Duszpasterze\" link")
    @io.qase.api.annotation.Step("Click the \"Duszpasterze\" link")
    public void clickPriestsLink() {

        priestsLink.click();
    }

    @io.qameta.allure.Step("Click the \"Spowiedź\" link")
    @io.qase.api.annotation.Step("Click the \"Spowiedź\" link")
    public void clickConfessionLink() {

        confessionLink.click();
    }

    @io.qameta.allure.Step("Click the \"Kancelaria\" link")
    @io.qase.api.annotation.Step("Click the \"Kancelaria\" link")
    public void clickOfficeLink() {

        officeLink.click();
    }
}
