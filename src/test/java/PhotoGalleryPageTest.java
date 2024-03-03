import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.Item;
import qa.pageobject.PhotoGalleryPage;
import qa.utils.AssertionUtils;
import qa.utils.Results;

import java.util.ArrayList;
import java.util.List;


@Epic("E2E")
@Feature("Photo gallery page buttons tests")
public class PhotoGalleryPageTest extends BaseTest {

    private PhotoGalleryPage photoGalleryPage;
    private List<Results> results;

    @BeforeMethod
    public void create() {

        goToPage(URLs.PHOTO_GALLERY.getName());
        photoGalleryPage = new PhotoGalleryPage(getPage());
        photoGalleryPage.findItems();
        results = new ArrayList<>();
    }

    private boolean checkLocatorVisibility(Item item, boolean isExpanded) {

        if (item.getGalleryContentLocator().isVisible() != isExpanded) {
            results.add(new Results("Item [" + item.getTitle() + "] is expanded",
                    isExpanded, !isExpanded));
            return false;
        }

        return true;
    }

    @Test
    public void expandingAndCollapsing() {

        for (int i = 1; i < photoGalleryPage.getItemsCount(); i++) {

            photoGalleryPage.getItem(i).clickIconClosed();
            boolean isExpanded = checkLocatorVisibility(photoGalleryPage.getItem(i), true);

            if (isExpanded) {
                photoGalleryPage.getItem(i).clickIconOpened();
                checkLocatorVisibility(photoGalleryPage.getItem(i), false);
            }
        }

        Assert.assertTrue(results.isEmpty(), AssertionUtils.formatAssertionMessage(results));
    }
}
