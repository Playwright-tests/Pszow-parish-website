package qa.support;

import com.microsoft.playwright.Locator;
import java.nio.file.Paths;

public class AllureAttachments {

    public static void takeScreenshot(Locator locator, String fileName) {

        locator.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get(fileName + ".png")));
    }
}
