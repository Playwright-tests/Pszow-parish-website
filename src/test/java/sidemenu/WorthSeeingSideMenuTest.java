package sidemenu;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Tag;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.WorthSeeingSideMenu;

import java.util.function.Consumer;

@Epic("E2E")
@Feature("The \"Warto zobaczyć\" side menu links")
public class WorthSeeingSideMenuTest extends BaseTest {

    private WorthSeeingSideMenu worthSeeingSideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);
        worthSeeingSideMenu = new WorthSeeingSideMenu(getPage());
    }

    private void actions(Consumer<WorthSeeingSideMenu> consumer, String url) {

        consumer.accept(worthSeeingSideMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 1)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Litania do Pani Uśmiechniętej\" link")
    @QaseId(35)
    @QaseTitle("The \"Litania do Pani Uśmiechniętej\" link")
    public void litanyLink() {

        actions(WorthSeeingSideMenu::clickLitanyLink, URLs.LITANY_PAGE);
    }

    @Test(priority = 2)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Regulamin cmentarza\" link")
    @QaseId(36)
    @QaseTitle("The \"Regulamin cmentarza\" link")
    public void cemeteryRegulationLink() {

        actions(WorthSeeingSideMenu::clickCementeryRegulationLink, URLs.CEMENTERY_REGULATION);
    }

    @Test(priority = 3)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    @QaseId(37)
    @QaseTitle("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    public void delegateLink() {

        actions(WorthSeeingSideMenu::clickDelegateLink, URLs.DELEGATE_PAGE);
    }
}
