package qa.pageobject;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import qa.base.BasePage;

public class MediaIconsSection extends BasePage {

    private final String FACEBOOK_NAME = "Facebook (opens in a new tab)";
    private final String YOUTUBE_NAME = "Youtube (opens in a new tab)";

    public MediaIconsSection(Page page) {

        super(page);
    }

    private void clickIcon(String text) {

        getPage().getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName(text)).click();
    }

    @io.qameta.allure.Step("Click the Facebook icon")
    public void clickFacebookIcon() {

        clickIcon(FACEBOOK_NAME);
    }

    @io.qameta.allure.Step("Click the Youtube icon")
    public void clickYoutubeIcon() {

        clickIcon(YOUTUBE_NAME);
    }
}
