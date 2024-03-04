package photogallery;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.models.ItemData;
import qa.dataprovider.DataProviders;
import qa.enums.URLs;
import qa.pageobject.PhotoGalleryPage;
import qa.support.DataProviderNames;
import qa.support.WaitForSelector;

@Epic("E2E")
@Feature("Photo gallery page buttons tests")
public class PhotoGalleryPageTest extends BaseTest {

    private PhotoGalleryPage photoGalleryPage;

    @BeforeMethod
    public void create() {

        goToPage(URLs.PHOTO_GALLERY.getName());
        photoGalleryPage = new PhotoGalleryPage(getPage());
    }

    @Test(dataProvider = DataProviderNames.ITEMS, dataProviderClass = DataProviders.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Expanding and collapsing the content of the photo gallery")
    @QaseId(45)
    @QaseTitle("Expanding and collapsing the content of the photo gallery")
    public void contentVisibility(ItemData itemData) {

        photoGalleryPage.clickTriggerElement(itemData.getName());
        WaitForSelector.visible(getPage(), itemData.getTabContent());
        photoGalleryPage.clickTriggerElement(itemData.getName());
        WaitForSelector.hidden(getPage(), itemData.getTabContent());
    }
}
