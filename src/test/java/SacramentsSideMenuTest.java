import io.qameta.allure.Description;
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

        Assert.assertEquals(getPage().url(), URLs.BASE_URL.getName() + url,
                "The page with address: " + URLs.BASE_URL.getName() + url + " has not been opened");
    }

    @Test
    @Description("The \"Chrzest\" link")
    public void christeningLink() {

        actions(SacramentsSideMenu::clickChristeningLink, URLs.CHRISTENING_PAGE.getName());
    }

    @Test
    @Description("The \"Pierwsza Komunia\" link")
    public void firstCommunionLink() {

        actions(SacramentsSideMenu::clickFirstCommunionLink, URLs.FIRST_COMMUNION_PAGE.getName());
    }

    @Test
    @Description("The \"Bierzmowanie\" link")
    public void confirmationLink() {

        actions(SacramentsSideMenu::clickConfirmationLink, URLs.CONFIRMATION_PAGE.getName());
    }

    @Test
    @Description("The \"Małżeństwo\" link")
    public void marriageLink() {

        actions(SacramentsSideMenu::clickMarriageLink, URLs.MARRIAGE_PAGE.getName());
    }
}
