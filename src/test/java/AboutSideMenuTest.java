import io.qameta.allure.*;
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

        Assert.assertEquals(getPage().url(), URLs.BASE_URL.getName() + url,
                "The page with address: " + URLs.BASE_URL.getName() + url + " has not been opened");
    }

    @Test
    @Description("The \"Kontakt\" link")
    public void contactLink() {

        actions(AboutSideMenu::clickContactLink, URLs.CONTACT_PAGE.getName());
    }

    @Test
    @Description("The \"Historia parafii\" link")
    public void historyLink() {

        actions(AboutSideMenu::clickParishHistoryLink, URLs.HISTORY_PAGE.getName());
    }

    @Test
    @Description("The \"Kalwaria Pszowska\" link")
    public void calvaryLink() {

        actions(AboutSideMenu::clickCalvaryLink, URLs.CALVARY_PAGE.getName());
    }

    @Test
    @Description("The \"Pielgrzymki\" link")
    public void pilgrimagesLink() {

        actions(AboutSideMenu::clickPilgrimagesLink, URLs.PILGRIMAGES_PAGE.getName());
    }

    @Test
    @Description("The \"Galeria zdjęć\" link")
    public void photoGalleryLink() {

        actions(AboutSideMenu::clickPhotoGalleryLink, URLs.PHOTO_GALLERY.getName());
    }

    @Test
    @Description("The \"Galeria filmów\" link")
    public void filmGalleryLink() {

        actions(AboutSideMenu::clickFilmGalleryLink, URLs.FILM_GALLERY_PAGE.getName());
    }

    @Test
    @Description("The \"Wsparcie parafii\" link")
    public void supportLink() {

        actions(AboutSideMenu::clickSupportLink, URLs.SUPPORT_PAGE.getName());
    }
}
