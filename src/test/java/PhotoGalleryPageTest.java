import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.models.ItemData;
import qa.dataprovider.DataProviders;
import qa.enums.URLs;
import qa.pageobject.PhotoGalleryPage;
import qa.support.DataProviderNames;

@Epic("E2E")
@Feature("Photo gallery page buttons tests")
public class PhotoGalleryPageTest extends BaseTest {

    private PhotoGalleryPage photoGalleryPage;

    @BeforeMethod
    public void create() {

        goToPage(URLs.PHOTO_GALLERY.getName());
        photoGalleryPage = new PhotoGalleryPage(getPage());
    }

    private void waitForSelectorVisible(String selector) {

        try {
            Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions()
                    .setState(WaitForSelectorState.VISIBLE)
                    .setTimeout(2000);
            getPage().waitForSelector(selector, options);
        } catch (Exception e) {
            Assert.fail("The selector \""+ selector + "\" is hidden");
        }
    }

    private void waitForSelectorHidden(String selector) {

        try {
            Page.WaitForSelectorOptions options = new Page.WaitForSelectorOptions()
                    .setState(WaitForSelectorState.HIDDEN)
                    .setTimeout(2000);
            getPage().waitForSelector(selector, options);
        } catch (Exception e) {
            Assert.fail("The selector \"" + selector + "\" is visible");
        }
    }

    @Test(dataProvider = DataProviderNames.ITEMS, dataProviderClass = DataProviders.class)
    public void expandingAndCollapsing(ItemData itemData) throws InterruptedException {

        photoGalleryPage.clickButton(itemData.getName());
        waitForSelectorVisible(itemData.getTabContent());
        Assert.assertTrue(getPage().locator(itemData.getTabContent()).isVisible(), "The content is not visible");
        photoGalleryPage.clickButton(itemData.getName());
        waitForSelectorHidden(itemData.getTabContent());
        Assert.assertFalse(getPage().locator(itemData.getTabContent()).isVisible(), "The content is visible");
    }
}
