package qa.stepclasses;

import com.microsoft.playwright.Page;
import qa.pageobject.MainMenu;
public class MainMenuSteps {

    private final MainMenu MAIN_MENU;

    public MainMenuSteps(Page page) {

        this.MAIN_MENU = new MainMenu(page);
    }

    @io.qameta.allure.Step("Click the \"Ogłoszenia duszpasterskie\" link")
    public void clickAnnouncementsLink() {

        MAIN_MENU.clickAnnouncementsLink();
    }

    @io.qameta.allure.Step("Click the \"Intencje mszalne\" link")
    public void clickIntentionsLink() {

        MAIN_MENU.clickIntentionsLink();
    }

    @io.qameta.allure.Step("Click the\"Pogrzeby\" link")
    public void clickFuneralsLink() {

        MAIN_MENU.clickFuneralsLink();
    }

    @io.qameta.allure.Step("Click the \"Szafarze\" link")
    public void clickStewardsLink() {

        MAIN_MENU.clickStewardsLink();
    }

    @io.qameta.allure.Step("Click the \"Kapłani\" link")
    public void clickPriestsLink() {

        MAIN_MENU.clickPriestsLink();
    }

    @io.qameta.allure.Step("Click the \"Spowiedź w bazylice\" link")
    public void clickConfessionLink() {

        MAIN_MENU.clickConfessionLink();
    }

    @io.qameta.allure.Step("Click the \"Kancelaria\" link")
    public void clickOfficeLink() {

        MAIN_MENU.clickOfficeLink();
    }
}
