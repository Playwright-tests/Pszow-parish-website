import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import qa.base.BaseTest;
import org.testng.annotations.Test;
import qa.enums.URLs;
import qa.stepclasses.MainMenuSteps;
import io.qameta.allure.*;

import java.util.function.Consumer;

@Epic("E2E")
@Feature("Main menu links")
public class MainMenuTest extends BaseTest {

    private MainMenuSteps steps;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());

        steps = new MainMenuSteps(getPage());
    }

    private void actions(Consumer<MainMenuSteps> consumer, String url) {

        consumer.accept(steps);

        Assert.assertEquals(getPage().url(), URLs.BASE_URL.getName() + url,
                "The page with address: " + URLs.BASE_URL.getName() + url + " has not been opened");
    }

    @Test
    public void announcementsLink() {

        actions(MainMenuSteps::clickAnnouncementsLink, URLs.ANNOUNCEMENTS_PAGE.getName());
    }

    @Test
    public void intentionsLink() {

        actions(MainMenuSteps::clickIntentionsLink, URLs.INTENTION_PAGE.getName());
    }

    @Test
    public void funeralsLink() {

        actions(MainMenuSteps::clickFuneralsLink, URLs.FUNERALS_PAGE.getName());
    }

    @Test
    public void stewardsLink() {

        actions(MainMenuSteps::clickStewardsLink, URLs.STEWARDS_PAGE.getName());
    }

    @Test
    public void priestsLink() {

        actions(MainMenuSteps::clickPriestsLink, URLs.PRIESTS_PAGE.getName());
    }

    @Test
    public void confessionLink() {

        actions(MainMenuSteps::clickConfessionLink, URLs.CONFESSION_PAGE.getName());
    }

    @Test
    public void officeLink() {

        actions(MainMenuSteps::clickOfficeLink, URLs.OFFICE_PAGE.getName());
    }
}
