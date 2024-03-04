package sidemenu;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
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

        goToPage(URLs.BASE_URL.getName());
        worthSeeingSideMenu = new WorthSeeingSideMenu(getPage());
    }

    private void actions(Consumer<WorthSeeingSideMenu> consumer, String url) {

        consumer.accept(worthSeeingSideMenu);

        Assert.assertEquals(getPage().url(), url,
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 4)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Litania do Pani Uśmiechniętej\" link")
    @QaseId(35)
    @QaseTitle("The \"Litania do Pani Uśmiechniętej\" link")
    public void litanyLink() {

        actions(WorthSeeingSideMenu::clickLitanyLink, URLs.LITANY_PAGE.getName());
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Regulamin cmentarza\" link")
    @QaseId(36)
    @QaseTitle("The \"Regulamin cmentarza\" link")
    public void cementeryRegulationLink() {

        actions(WorthSeeingSideMenu::clickCementeryRegulationLink, URLs.CEMENTERY_REGULATION.getName());
    }

    @Test(priority = 5)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    @QaseId(37)
    @QaseTitle("The \"Delegat ds. ochrony dzieci i młodzieży\" link")
    public void delegateLink() {

        actions(WorthSeeingSideMenu::clickDelegateLink, URLs.DELEGATE_PAGE.getName());
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Archidiecezja Katowicka\" link")
    @QaseId(38)
    @QaseTitle("The \"Archidiecezja Katowicka\" link")
    public void archdioceseLink() {

        actions(WorthSeeingSideMenu::clickArchdioceseLink, URLs.ARCHDIOCESE.getName());
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Czytania liturgiczne\" link")
    @QaseId(39)
    @QaseTitle("The \"Czytania liturgiczne\" link")
    public void readingLink() {

        actions(WorthSeeingSideMenu::clickReadingLink, URLs.READING.getName());
    }
}
