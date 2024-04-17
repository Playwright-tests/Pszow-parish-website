package photogallery;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Tag;
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

        goToPage(URLs.PHOTO_GALLERY);
        photoGalleryPage = new PhotoGalleryPage(getPage());
    }

    @Test(dataProvider = DataProviderNames.ITEMS, dataProviderClass = DataProviders.class)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.PHOTO_GALLERY)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Expanding and collapsing the content of the photo gallery")
    @QaseId(45)
    @QaseTitle("Expanding and collapsing the content of the photo gallery")
    public void contentVisibility(ItemData itemData) {

        Allure.parameter("Item name", itemData.getName());
        Allure.parameter("Tab content", itemData.getTabContent());
        photoGalleryPage.clickTriggerElement(itemData.getName());
        WaitForSelector.visible(getPage(), itemData.getTabContent());
        photoGalleryPage.clickTriggerElement(itemData.getName());
        WaitForSelector.hidden(getPage(), itemData.getTabContent());
    }
}
