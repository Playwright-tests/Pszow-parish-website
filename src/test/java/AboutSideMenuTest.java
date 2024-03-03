import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.pageobject.AboutSideMenu;
import qa.enums.URLs;

import java.util.function.Consumer;


@Epic("E2E")
@Feature("The \"O Parafii\" side menu links")
public class AboutSideMenuTest extends BaseTest {

    private AboutSideMenu aboutSideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());

        aboutSideMenu = new AboutSideMenu(getPage());
    }

    private void actions(Consumer<AboutSideMenu> consumer, String url) {

        consumer.accept(aboutSideMenu);

        Assert.assertTrue(getPage().url().contains(url),
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 3)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Kontakt\" link")
    @QaseId(12)
    @QaseTitle("The \"Kontakt\" link")
    public void contactLink() {

        actions(AboutSideMenu::clickContactLink, URLs.CONTACT_PAGE.getName());
    }

    @Test(priority = 6)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Historia parafii\" link")
    @QaseId(13)
    @QaseTitle("The \"Historia parafii\" link")
    public void historyLink() {

        actions(AboutSideMenu::clickParishHistoryLink, URLs.HISTORY_PAGE.getName());
    }

    @Test(priority = 7)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Kalwaria Pszowska\" link")
    @QaseId(14)
    @QaseTitle("The \"Kalwaria Pszowska\" link")
    public void calvaryLink() {

        actions(AboutSideMenu::clickCalvaryLink, URLs.CALVARY_PAGE.getName());
    }

    @Test(priority = 8)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Pielgrzymki\" link")
    @QaseId(15)
    @QaseTitle("The \"Pielgrzymki\" link")
    public void pilgrimagesLink() {

        actions(AboutSideMenu::clickPilgrimagesLink, URLs.PILGRIMAGES_PAGE.getName());
    }

    @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Galeria zdjęć\" link")
    @QaseId(16)
    @QaseTitle("The \"Galeria zdjęć\" link")
    public void photoGalleryLink() {

        actions(AboutSideMenu::clickPhotoGalleryLink, URLs.PHOTO_GALLERY.getName());
    }

    @Test(priority = 4)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Galeria filmów\" link")
    @QaseId(17)
    @QaseTitle("The \"Galeria filmów\" link")
    public void filmGalleryLink() {

        actions(AboutSideMenu::clickFilmGalleryLink, URLs.FILM_GALLERY_PAGE.getName());
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Transmisja Mszy św.\" link")
    @QaseId(18)
    @QaseTitle("The \"Transmisja Mszy św.\" link")
    public void transmissionLink() {

        actions(AboutSideMenu::clickTransmissionLink, URLs.YOUTUBE_TRANSMISSION.getName());
    }

    @Test(priority = 5)
    @Severity(SeverityLevel.NORMAL)
    @Description("The \"Wsparcie parafii\" link")
    @QaseId(19)
    @QaseTitle("The \"Wsparcie parafii\" link")
    public void supportLink() {

        actions(AboutSideMenu::clickSupportLink, URLs.SUPPORT_PAGE.getName());
    }
}
