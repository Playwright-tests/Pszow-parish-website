package qa.pageobject;

import com.microsoft.playwright.Page;

public class MainMenu extends Menu {

    private final String ANNOUNCEMENTS_SELECTOR = "menu-item-24562";
    private final String INTENTIONS_SELECTOR = "menu-item-1458";
    private final String FUNERALS_SELECTOR = "menu-item-13836";
    private final String STEWARDS_SELECTOR = "menu-item-19387";
    private final String PRIESTS_SELECTOR = "menu-item-1466";
    private final String CONFESSION_SELECTOR = "menu-item-18889";
    private final String OFFICE_SELECTOR = "menu-item-24859";

    public MainMenu(Page page) {

        super(page);
    }

    @io.qameta.allure.Step("Click the \"Ogłoszenia duszpasterskie\" link")
    public void clickAnnouncementsLink() {

        clickLink(ANNOUNCEMENTS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Intencje mszalne\" link")
    public void clickIntentionsLink() {

        clickLink(INTENTIONS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the\"Pogrzeby\" link")
    public void clickFuneralsLink() {

        clickLink(FUNERALS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Szafarze\" link")
    public void clickStewardsLink() {

        clickLink(STEWARDS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Kapłani\" link")
    public void clickPriestsLink() {

        clickLink(PRIESTS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Spowiedź w bazylice\" link")
    public void clickConfessionLink() {

        clickLink(CONFESSION_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Kancelaria\" link")
    public void clickOfficeLink() {

        clickLink(OFFICE_SELECTOR);
    }
}
