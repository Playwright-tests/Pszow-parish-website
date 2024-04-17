package sidemenu;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Tag;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.support.URLs;
import qa.pageobject.MinistrySideMenu;

import java.util.function.Consumer;

@Epic("E2E")
@Feature("The \"Duszpasterstwo\" side menu links")
public class MinistrySideMenuTest extends BaseTest {

    private MinistrySideMenu ministrySideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);
        ministrySideMenu = new MinistrySideMenu(getPage());
    }

    private void actions(Consumer<MinistrySideMenu> consumer, String url) {

        consumer.accept(ministrySideMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 3)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Caritas i działalność charytatywna\" link")
    @QaseId(24)
    @QaseTitle("The \"Caritas i działalność charytatywna\" link")
    public void caritasLink() {

        actions(MinistrySideMenu::clickCaritasLink, URLs.CARITAS);
    }

    @Test(priority = 4)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Parafialna Rada Duszpasterska\" link")
    @QaseId(25)
    @QaseTitle("The \"Parafialna Rada Duszpasterska\" link")
    public void councilLink() {

        actions(MinistrySideMenu::clickCouncilLink, URLs.COUNCIL_PAGE);
    }

    @Test(priority = 7)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Ministranci i LSO\" link")
    @QaseId(26)
    @QaseTitle("The \"Ministranci i LSO\" link")
    public void altarBoysLink() {

        actions(MinistrySideMenu::clickAltarBoysLink, URLs.ALTAR_BOYS_PAGE);
    }

    @Test(priority = 6)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Dzieci Maryi\" link")
    @QaseId(27)
    @QaseTitle("The \"Dzieci Maryi\" link")
    public void marysChildrenLink() {

        actions(MinistrySideMenu::clickMarysChildrenLink, URLs.MARYS_CHILDREN_PAGE);
    }

    @Test(priority = 5)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Oaza młodzieżowa\" link")
    @QaseId(28)
    @QaseTitle("The \"Oaza młodzieżowa\" link")
    public void oasisLink() {

        actions(MinistrySideMenu::clickOasisLink, URLs.OASIS_PAGE);
    }

    @Test(priority = 9)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Domowy Kościół\" link")
    @QaseId(29)
    @QaseTitle("The \"Domowy Kościół\" link")
    public void homeChurchLink() {

        actions(MinistrySideMenu::clickHomeChurchLink, URLs.HOME_CHURCH_PAGE);
    }

    @Test(priority = 10)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Katecheza dorosłych\" link")
    @QaseId(30)
    @QaseTitle("The \"Katecheza dorosłych\" link")
    public void catechesisLink() {

        actions(MinistrySideMenu::clickCatechesisLink, URLs.CATECHESIS_PAGE);
    }

    @Test(priority = 11)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"PoCo\" link")
    @QaseId(31)
    @QaseTitle("The \"PoCo\" link")
    public void pocoLink() {

        actions(MinistrySideMenu::clickPocoLink, URLs.POCO_PAGE);
    }

    @Test(priority = 1)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Legion Maryi\" link")
    @QaseId(32)
    @QaseTitle("The \"Legion Maryi\" link")
    public void legionOfMaryLink() {

        actions(MinistrySideMenu::clickLegionOfMaryLink, URLs.LEGION_OF_MARY);
    }

    @Test(priority = 2)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Żywy Różaniec\" link")
    @QaseId(33)
    @QaseTitle("The \"Żywy Różaniec\" link")
    public void livingRosaryLink() {

        actions(MinistrySideMenu::clickLivingRosaryLink, URLs.LIVING_ROSARY_PAGE);
    }

    @Test(priority = 8)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Wspólnota Matki Miłosiernego\" link")
    @QaseId(34)
    @QaseTitle("The \"Wspólnota Matki Miłosiernego\" link")
    public void mothersCommunityLink() {

        actions(MinistrySideMenu::clickMothersCommunityLink, URLs.MOTHERS_COMMUNITY);
    }
}
