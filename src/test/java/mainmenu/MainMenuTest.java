package mainmenu;

import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Tag;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import qa.base.BaseTest;
import org.testng.annotations.Test;
import qa.enums.URLs;
import io.qameta.allure.*;
import qa.pageobject.MainMenu;
import qa.support.AllureAttachments;

import java.util.function.Consumer;

@Epic("E2E")
@Feature("The main menu links")
public class MainMenuTest extends BaseTest {

    private MainMenu mainMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);

        mainMenu = new MainMenu(getPage());
    }

    private void actions(Consumer<MainMenu> consumer, String url) {

        consumer.accept(mainMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 1)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Ogłoszenia duszpasterskie\" link")
    @QaseId(5)
    @QaseTitle("The \"Ogłoszenia duszpasterskie\" link")
    public void announcementsLink() {

        AllureAttachments.takeScreenshot(mainMenu.getAnnouncementLink(), "announcementLink");
        actions(MainMenu::clickAnnouncementsLink, URLs.ANNOUNCEMENTS_PAGE);
    }

    @Test(priority = 2)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Intencje mszalne\" link")
    @QaseId(6)
    @QaseTitle("The \"Intencje mszalne\" link")
    public void intentionsLink() {

        AllureAttachments.takeScreenshot(mainMenu.getIntentionsLink(), "intentionsLink");
        actions(MainMenu::clickIntentionsLink, URLs.INTENTION_PAGE);
    }

    @Test(priority = 3)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Pogrzeby\" link")
    @QaseId(7)
    @QaseTitle("The \"Pogrzeby\" link")
    public void funeralsLink() {

        AllureAttachments.takeScreenshot(mainMenu.getFuneralsLink(), "funeralsLink");
        actions(MainMenu::clickFuneralsLink, URLs.FUNERALS_PAGE);
    }

    @Test(priority = 7)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Szafarze\" link")
    @QaseId(8)
    @QaseTitle("The \"Szafarze\" link")
    public void stewardsLink() {

        AllureAttachments.takeScreenshot(mainMenu.getStewardsLink(), "stewardsLink");
        actions(MainMenu::clickStewardsLink, URLs.STEWARDS_PAGE);
    }

    @Test(priority = 6)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Duszpasterze\" link")
    @QaseId(9)
    @QaseTitle("The \"Duszpasterze\" link")
    public void priestsLink() {

        AllureAttachments.takeScreenshot(mainMenu.getPriestsLink(), "priestsLink");
        actions(MainMenu::clickPriestsLink, URLs.PRIESTS_PAGE);
    }

    @Test(priority = 5)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Spowiedź\" link")
    @QaseId(10)
    @QaseTitle("The \"Spowiedź\" link")
    public void confessionLink() {

        AllureAttachments.takeScreenshot(mainMenu.getConfessionLink(), "confessionLink");
        actions(MainMenu::clickConfessionLink, URLs.CONFESSION_PAGE);
    }

    @Test(priority = 4)
    @Tag("Links")
    @Tag("Main menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Kancelaria\" link")
    @QaseId(11)
    @QaseTitle("The \"Kancelaria\" link")
    public void officeLink() {

        AllureAttachments.takeScreenshot(mainMenu.getOfficeLink(), "officeLink");
        actions(MainMenu::clickOfficeLink, URLs.OFFICE_PAGE);
    }
}
