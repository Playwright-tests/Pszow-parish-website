package header;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.Header;

@Epic("E2E")
@Feature("The logo link")
public class LogoTest extends BaseTest {

    private Header header;

    @BeforeMethod
    public void init() {

        goToPage(URLs.PILGRIMAGES_PAGE.getName());
        header = new Header(getPage());
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("The logo")
    @QaseId(1)
    @QaseTitle("The logo")
    public void clickingLogo() {

        header.clickLogo();
        Assert.assertEquals(getPage().url(), URLs.BASE_URL.getName(),
                "The home page has not been opened");
    }
}
