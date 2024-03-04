package qa.pageobject;

import com.microsoft.playwright.Page;

public class MinistrySideMenu extends Menu {

    private final String CARITAS_SELECTOR = "menu-item-24879";
    private final String COUNCIL_SELECTOR = "menu-item-24880";
    private final String ALTAR_BOYS_SELECTOR = "menu-item-24881";
    private final String MARYS_CHILDREN_SELECTOR = "menu-item-24882";
    private final String OASIS_SELECTOR = "menu-item-24883";
    private final String HOME_CHURCH_SELECTOR = "menu-item-24886";
    private final String CATECHESIS_SELECTOR = "menu-item-24887";
    private final String POCO_SELECTOR = "menu-item-24889";
    private final String LEGION_OF_MARY_SELECTOR = "menu-item-24891";
    private final String LIVING_ROSARY_SELECTOR = "menu-item-24894";
    private final String MOTHERS_COMMUNITY_SELECTOR = "menu-item-24902";

    public MinistrySideMenu(Page page) {

        super(page);
    }

    @io.qameta.allure.Step("Click the \"Caritas i działalność charytatywna\" link")
    @io.qase.api.annotation.Step("Click the \"Caritas i działalność charytatywna\" link")
    public void clickCaritasLink() {

        clickLink(CARITAS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Parafialna Rada Duszpasterska\" link")
    @io.qase.api.annotation.Step("Click the \"Parafialna Rada Duszpasterska\" link")
    public void clickCouncilLink() {

        clickLink(COUNCIL_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Ministranci i LSO\" link")
    @io.qase.api.annotation.Step("Click the \"Ministranci i LSO\" link")
    public void clickAltarBoysLink() {

        clickLink(ALTAR_BOYS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Dzieci Maryi\" link")
    @io.qase.api.annotation.Step("Click the \"Dzieci Maryi\" link")
    public void clickMarysChildrenLink() {

        clickLink(MARYS_CHILDREN_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Oaza młodzieżowa\" link")
    @io.qase.api.annotation.Step("Click the \"Oaza młodzieżowa\" link")
    public void clickOasisLink() {

        clickLink(OASIS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Domowy Kościół\" link")
    @io.qase.api.annotation.Step("Click the \"Domowy Kościół\" link")
    public void clickHomeChurchLink() {

        clickLink(HOME_CHURCH_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Katecheza dorosłych\" link")
    @io.qase.api.annotation.Step("Click the \"Katecheza dorosłych\" link")
    public void clickCatechesisLink() {

        clickLink(CATECHESIS_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"PoCo\" link")
    @io.qase.api.annotation.Step("Click the \"PoCo\" link")
    public void clickPocoLink() {

        clickLink(POCO_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Legion Maryi\" link")
    @io.qase.api.annotation.Step("Click the \"Legion Maryi\" link")
    public void clickLegionOfMaryLink() {

        clickLink(LEGION_OF_MARY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Żywy Różaniec\" link")
    @io.qase.api.annotation.Step("Click the \"Żywy Różaniec\" link")
    public void clickLivingRosaryLink() {

        clickLink(LIVING_ROSARY_SELECTOR);
    }

    @io.qameta.allure.Step("Click the \"Wspólnota Matki Miłosiernego\" link")
    @io.qase.api.annotation.Step("Click the \"Wspólnota Matki Miłosiernego\" link")
    public void clickMothersCommunityLink() {

        clickLink(MOTHERS_COMMUNITY_SELECTOR);
    }
}
