package header;

import com.microsoft.playwright.Page;
import io.qameta.allure.*;

import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.pageobject.Header;
import qa.pageobject.MediaIconsSection;
import qa.support.URLs;

import java.util.function.Consumer;


@Epic("E2E")
@Feature("Media icons")
public class MediaIconsSectionTest extends BaseTest {

    private Header header;

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);
        header = new Header(getPage());
    }

    private void actions(Consumer<MediaIconsSection> consumer, String url) {

        Page page = getPage().waitForPopup(() -> {
            consumer.accept(header.getMediaIconsSection());
        });

        Assert.assertTrue(page.url().contains(url));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("The Facebook icon")
    @QaseId(2)
    @QaseTitle("The Facebook icon")
    public void facebookIcon() {

        actions(MediaIconsSection::clickFacebookIcon, URLs.FACEBOOK_PAGE);
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("The Youtube icon")
    @QaseId(3)
    @QaseTitle("The Youtube icon")
    public void youtubeIcon() {

        actions(MediaIconsSection::clickYoutubeIcon, URLs.YOUTUBE_PAGE);
    }
}
