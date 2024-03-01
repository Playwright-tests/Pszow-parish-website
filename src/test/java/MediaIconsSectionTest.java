import com.microsoft.playwright.Page;
import io.qameta.allure.*;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.pageobject.MediaIconsSection;
import qa.enums.URLs;

import java.util.function.Consumer;


@Epic("E2E")
@Feature("Media icons tests")
public class MediaIconsSectionTest extends BaseTest {

    private MediaIconsSection mediaIconsSection;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());
        mediaIconsSection = new MediaIconsSection(getPage());
    }

    private void actions(Consumer<MediaIconsSection> consumer, String url) {

        Page page = getPage().waitForPopup(() -> {
            consumer.accept(mediaIconsSection);
        });

        Assert.assertTrue(page.url().contains(url));
    }

    @Test
    @Description("The Facebook icon")
    public void facebookIcon() {

        actions(MediaIconsSection::clickFacebookIcon, URLs.FACEBOOK_PAGE.getName());
    }

    @Test
    @Description("The Youtube icon")
    public void youtubeIcon() {

        actions(MediaIconsSection::clickYoutubeIcon, URLs.YOUTUBE_PAGE.getName());
    }
}
