package qa.support;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.testng.Assert;

public class WaitForSelector {

    public static void visible(Page page, String selector) {

        try {
            Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions()
                    .setState(WaitForSelectorState.VISIBLE)
                    .setTimeout(2000);
            page.waitForSelector(selector, options);
        } catch (Exception e) {
            Assert.fail("The \"" + selector + "\" selector is not visible");
        }
    }

    public static void hidden(Page page, String selector) {

        try {
            Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions()
                    .setState(WaitForSelectorState.HIDDEN)
                    .setTimeout(2000);
            page.waitForSelector(selector, options);
        } catch (Exception e) {
            Assert.fail("The \"" + selector + "\" selector is not hidden");
        }
    }
}
