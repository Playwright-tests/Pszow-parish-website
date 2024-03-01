import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.WorthSeeingSideMenu;

import java.util.function.Consumer;

public class WorthSeeingSideMenuTest extends BaseTest {

    private WorthSeeingSideMenu worthSeeingSideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());
        worthSeeingSideMenu = new WorthSeeingSideMenu(getPage());
    }

    private void actions(Consumer<WorthSeeingSideMenu> consumer, String url) {

        consumer.accept(worthSeeingSideMenu);

        Assert.assertEquals(getPage().url(), URLs.BASE_URL.getName() + url,
                "The page with address: " + URLs.BASE_URL.getName() + url + " has not been opened");
    }

    @Test
    @Description("The \"Litania do Pani Uśmiechniętej\" link")
    public void litanyLink() {

        actions(WorthSeeingSideMenu::clickLitanyLink, URLs.LITANY_PAGE.getName());
    }

    @Test
    @Description("The \"Regulamin cmentarza\" link")
    public void cementeryRegulationLink() {

        actions(WorthSeeingSideMenu::clickCementeryRegulationLink, URLs.CEMENTERY_REGULATION.getName());
    }

    @Test
    @Description("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    public void delegateLink() {

        actions(WorthSeeingSideMenu::clickDelegateLink, URLs.DELEGATE_PAGE.getName());
    }

    @Test
    @Description("The \"Archidiecezja Katowicka\" link")
    public void archdioceseLink() {

        worthSeeingSideMenu.clickArchdioceseLink();

        Assert.assertEquals(getPage().url(), URLs.ARCHDIOCESE.getName(),
                "The page with address: " + URLs.ARCHDIOCESE.getName() + " has not been opened");
    }

    @Test
    @Description("The \"Czytania liturgiczne\" link")
    public void readingLink() {

        worthSeeingSideMenu.clickReadingLink();

        Assert.assertEquals(getPage().url(), URLs.READING.getName(),
                "The page with address: " + URLs.READING.getName() + " has not been opened");
    }
}
