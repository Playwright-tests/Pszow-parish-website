import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.SacramentsSideMenu;

import java.util.function.Consumer;

public class SacramentsSideMenuTest extends BaseTest {

    private SacramentsSideMenu sacramentsSideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());

        sacramentsSideMenu = new SacramentsSideMenu(getPage());
    }

    private void actions(Consumer<SacramentsSideMenu> consumer, String url) {

        consumer.accept(sacramentsSideMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Chrzest\" link")
    @QaseId(20)
    @QaseTitle("The \"Chrzest\" link")
    public void christeningLink() {

        actions(SacramentsSideMenu::clickChristeningLink, URLs.CHRISTENING_PAGE.getName());
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Pierwsza Komunia\" link")
    @QaseId(21)
    @QaseTitle("The \"Pierwsza Komunia\" link")
    public void firstCommunionLink() {

        actions(SacramentsSideMenu::clickFirstCommunionLink, URLs.FIRST_COMMUNION_PAGE.getName());
    }

    @Test(priority = 4)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Bierzmowanie\" link")
    @QaseId(22)
    @QaseTitle("The \"Bierzmowanie\" link")
    public void confirmationLink() {

        actions(SacramentsSideMenu::clickConfirmationLink, URLs.CONFIRMATION_PAGE.getName());
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Małżeństwo\" link")
    @QaseId(23)
    @QaseTitle("The \"Małżeństwo\" link")
    public void marriageLink() {

        actions(SacramentsSideMenu::clickMarriageLink, URLs.MARRIAGE_PAGE.getName());
    }
}
