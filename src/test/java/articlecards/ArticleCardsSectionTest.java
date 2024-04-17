package articlecards;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Tag;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.support.URLs;
import qa.support.AllureAttachments;

@Epic("E2E")
@Feature("The article cards section")
public class ArticleCardsSectionTest extends BaseTest {

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);
    }

    @io.qameta.allure.Step("Click the link")
    @io.qase.api.annotation.Step("Click the link")
    private void clickLink() {

        Locator link = getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Zobacz więcej aktualności ..."));
        AllureAttachments.takeScreenshot(link, "seeMoreLink");
        link.click();
    }

    @Test
    @Tag("Links")
    @Owner("Paweł Aksman")
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Zobacz więcej aktualności ...\" link")
    @QaseId(46)
    @QaseTitle("The \"Zobacz więcej aktualności ...\" link")
    public void newsLink() {

        clickLink();
        Assert.assertEquals(getPage().url(), URLs.NEWS_PAGE, "The new page has not been opened");
    }
}
