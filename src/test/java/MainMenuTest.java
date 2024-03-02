import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import qa.base.BaseTest;
import org.testng.annotations.Test;
import qa.enums.URLs;
import io.qameta.allure.*;
import qa.pageobject.MainMenu;

import java.util.function.Consumer;

@Epic("E2E")
@Feature("The main menu links")
public class MainMenuTest extends BaseTest {

    private MainMenu mainMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());

        mainMenu = new MainMenu(getPage());
    }

    private void actions(Consumer<MainMenu> consumer, String url) {

        consumer.accept(mainMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test
    @Description("The \"Ogłoszenia duszpasterskie\" link")
    public void announcementsLink() {

        actions(MainMenu::clickAnnouncementsLink, URLs.ANNOUNCEMENTS_PAGE.getName());
    }

    @Test
    @Description("The \"Intencje mszalne\" link")
    public void intentionsLink() {

        actions(MainMenu::clickIntentionsLink, URLs.INTENTION_PAGE.getName());
    }

    @Test
    @Description("The \"Pogrzeby\" link")
    public void funeralsLink() {

        actions(MainMenu::clickFuneralsLink, URLs.FUNERALS_PAGE.getName());
    }

    @Test
    @Description("The \"Szafarze\" link")
    public void stewardsLink() {

        actions(MainMenu::clickStewardsLink, URLs.STEWARDS_PAGE.getName());
    }

    @Test
    @Description("The \"Duszpasterze\" link")
    public void priestsLink() {

        actions(MainMenu::clickPriestsLink, URLs.PRIESTS_PAGE.getName());
    }

    @Test
    @Description("The \"Spowiedź\" link")
    public void confessionLink() {

        actions(MainMenu::clickConfessionLink, URLs.CONFESSION_PAGE.getName());
    }

    @Test
    @Description("The \"Kancelaria\" link")
    public void officeLink() {

        actions(MainMenu::clickOfficeLink, URLs.OFFICE_PAGE.getName());
    }
}
