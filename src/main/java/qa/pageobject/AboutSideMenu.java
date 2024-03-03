package qa.pageobject;

import com.microsoft.playwright.Page;

public class AboutSideMenu extends Menu {

    private final String CONTACT_SELECTOR = "menu-item-24716";
    private final String PARISH_HISTORY_SELECTOR = "menu-item-24864";
    private final String CALVARY_SELECTOR = "menu-item-24866";
    private final String PILGRIMAGES_SELECTOR = "menu-item-24867";
    private final String PHOTO_GALLERY_SELECTOR = "menu-item-24862";
    private final String FILM_GALLERY_SELECTOR = "menu-item-24863";
    private final String TRANSMISSION_SELECTOR = "menu-item-24861";
    private final String SUPPORT_SELECTOR = "menu-item-24860";

    public AboutSideMenu(Page page) {

        super(page);
    }

    @io.qameta.allure.Step("Click the \"Kontakt\" link")
    @io.qase.api.annotation.Step("Click the \"Kontakt\" link")
    public void clickContactLink() {

        clickLink(CONTACT_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Historia parafii\" link")
    @io.qase.api.annotation.Step("Click the \"Historia parafii\" link")
    public void clickParishHistoryLink() {

        clickLink(PARISH_HISTORY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Kalwaria Pszowska\" link")
    @io.qase.api.annotation.Step("Click the \"Kalwaria Pszowska\" link")
    public void clickCalvaryLink() {

        clickLink(CALVARY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Pielgrzymki\" link")
    @io.qase.api.annotation.Step("Click the \"Pielgrzymki\" link")
    public void clickPilgrimagesLink() {

        clickLink(PILGRIMAGES_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Galeria zdjęć\" link")
    @io.qase.api.annotation.Step("Click the \"Galeria zdjęć\" link")
    public void clickPhotoGalleryLink() {

        clickLink(PHOTO_GALLERY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Galeria filmów\" link")
    @io.qase.api.annotation.Step("Click the \"Galeria filmów\" link")
    public void clickFilmGalleryLink() {

        clickLink(FILM_GALLERY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Transmisja Mszy św.\" link")
    @io.qase.api.annotation.Step("Click the \"Transmisja Mszy św.\" link")
    public void clickTransmissionLink() {

        clickLink(TRANSMISSION_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Wsparcie Parafii\" link")
    @io.qase.api.annotation.Step("Click the \"Wsparcie Parafii\" link")
    public void clickSupportLink() {

        clickLink(SUPPORT_SELECTOR);
    }
}
