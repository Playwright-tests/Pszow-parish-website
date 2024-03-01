package qa.pageobject;

import com.microsoft.playwright.Page;

public class WorthSeeingSideMenu extends Menu {

    private final String LITANY_SELECTOR = "menu-item-24725";
    private final String CEMENTERY_REGULATION_SELECTOR = "menu-item-24875";
    private final String DELEGATE_SELECTOR = "menu-item-24727";
    private final String ARCHDIOCESE_SELECTOR = "menu-item-24876";
    private final String READING_SELECTOR = "menu-item-24877";

    public WorthSeeingSideMenu(Page page) {

        super(page);
    }

    @io.qameta.allure.Step("Click the \"Litania do Pani Uśmiechniętej\" link")
    public void clickLitanyLink() {

        clickLink(LITANY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Regulamin cmentarza\" link")
    public void clickCementeryRegulationLink() {

        clickLink(CEMENTERY_REGULATION_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Delegat ds. ochrony dzieci i młodzieży\" link")
    public void clickDelegateLink() {

        clickLink(DELEGATE_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Archidiecezja Katowicka\" link")
    public void clickArchdioceseLink() {

        clickLink(ARCHDIOCESE_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Czytania liturgiczne\" link")
    public void clickReadingLink() {

        clickLink(READING_SELECTOR);
    }
}
