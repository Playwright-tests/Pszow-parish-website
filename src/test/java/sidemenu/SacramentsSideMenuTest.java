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
import qa.pageobject.SacramentsSideMenu;

import java.util.function.Consumer;

@Epic("E2E")
@Feature("The \"Sakramenty Święte\" side menu links")
public class SacramentsSideMenuTest extends BaseTest {

    private SacramentsSideMenu sacramentsSideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);

        sacramentsSideMenu = new SacramentsSideMenu(getPage());
    }

    private void actions(Consumer<SacramentsSideMenu> consumer, String url) {

        consumer.accept(sacramentsSideMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 1)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Chrzest\" link")
    @QaseId(20)
    @QaseTitle("The \"Chrzest\" link")
    public void christeningLink() {

        actions(SacramentsSideMenu::clickChristeningLink, URLs.CHRISTENING_PAGE);
    }

    @Test(priority = 2)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Pierwsza Komunia\" link")
    @QaseId(21)
    @QaseTitle("The \"Pierwsza Komunia\" link")
    public void firstCommunionLink() {

        actions(SacramentsSideMenu::clickFirstCommunionLink, URLs.FIRST_COMMUNION_PAGE);
    }

    @Test(priority = 4)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Bierzmowanie\" link")
    @QaseId(22)
    @QaseTitle("The \"Bierzmowanie\" link")
    public void confirmationLink() {

        actions(SacramentsSideMenu::clickConfirmationLink, URLs.CONFIRMATION_PAGE);
    }

    @Test(priority = 3)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Małżeństwo\" link")
    @QaseId(23)
    @QaseTitle("The \"Małżeństwo\" link")
    public void marriageLink() {

        actions(SacramentsSideMenu::clickMarriageLink, URLs.MARRIAGE_PAGE);
    }
}
