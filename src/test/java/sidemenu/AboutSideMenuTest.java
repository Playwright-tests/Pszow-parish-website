package sidemenu;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.junit.jupiter.api.Tag;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.pageobject.AboutSideMenu;
import qa.support.URLs;

import java.util.function.Consumer;


@Epic("E2E")
@Feature("The \"O Parafii\" side menu links")
public class AboutSideMenuTest extends BaseTest {

    private AboutSideMenu aboutSideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.HOME_PAGE);

        aboutSideMenu = new AboutSideMenu(getPage());
    }

    private void actions(Consumer<AboutSideMenu> consumer, String url) {

        consumer.accept(aboutSideMenu);

        Assert.assertTrue(getPage().url().contains(url),
                "The page with address: " + url + " has not been opened");
    }

    @Test(priority = 1)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Kontakt\" link")
    @QaseId(12)
    @QaseTitle("The \"Kontakt\" link")
    public void contactLink() {

        actions(AboutSideMenu::clickContactLink, URLs.CONTACT_PAGE);
    }

    @Test(priority = 4)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Historia parafii\" link")
    @QaseId(13)
    @QaseTitle("The \"Historia parafii\" link")
    public void historyLink() {

        actions(AboutSideMenu::clickParishHistoryLink, URLs.HISTORY_PAGE);
    }

    @Test(priority = 6)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Kalwaria Pszowska\" link")
    @QaseId(14)
    @QaseTitle("The \"Kalwaria Pszowska\" link")
    public void calvaryLink() {

        actions(AboutSideMenu::clickCalvaryLink, URLs.CALVARY_PAGE);
    }

    @Test(priority = 7)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.MINOR)
    @Description("The \"Pielgrzymki\" link")
    @QaseId(15)
    @QaseTitle("The \"Pielgrzymki\" link")
    public void pilgrimagesLink() {

        actions(AboutSideMenu::clickPilgrimagesLink, URLs.PILGRIMAGES_PAGE);
    }

    @Test(priority = 2)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Galeria zdjęć\" link")
    @QaseId(16)
    @QaseTitle("The \"Galeria zdjęć\" link")
    public void photoGalleryLink() {

        actions(AboutSideMenu::clickPhotoGalleryLink, URLs.PHOTO_GALLERY);
    }

    @Test(priority = 3)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Galeria filmów\" link")
    @QaseId(17)
    @QaseTitle("The \"Galeria filmów\" link")
    public void filmGalleryLink() {

        actions(AboutSideMenu::clickFilmGalleryLink, URLs.FILM_GALLERY_PAGE);
    }

    @Test(priority = 5)
    @Tag("Links")
    @Tag("Side menu")
    @Owner("Paweł Aksman")
    @Link(name = "Home page", url = URLs.HOME_PAGE)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The \"Wsparcie parafii\" link")
    @QaseId(19)
    @QaseTitle("The \"Wsparcie parafii\" link")
    public void supportLink() {

        actions(AboutSideMenu::clickSupportLink, URLs.SUPPORT_PAGE);
    }
}
