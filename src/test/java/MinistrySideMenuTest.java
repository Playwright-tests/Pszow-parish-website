import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.enums.URLs;
import qa.pageobject.MinistrySideMenu;

import java.util.function.Consumer;

public class MinistrySideMenuTest extends BaseTest {

    private MinistrySideMenu ministrySideMenu;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());
        ministrySideMenu = new MinistrySideMenu(getPage());
    }

    private void actions(Consumer<MinistrySideMenu> consumer, String url) {

        consumer.accept(ministrySideMenu);

        Assert.assertEquals(getPage().url(), URLs.BASE_URL.getName() + url,
                "The page with address: " + URLs.BASE_URL.getName() + url + " has not been opened");
    }

    @Test
    @Description("The \"Caritas i działalność charytatywna\" link")
    public void caritasLink() {

        actions(MinistrySideMenu::clickCaritasLink, URLs.CARITAS.getName());
    }

    @Test
    @Description("The \"Parafialna Rada Duszpasterska\" link")
    public void councilLink() {

        actions(MinistrySideMenu::clickCouncilLink, URLs.COUNCIL_PAGE.getName());
    }

    @Test
    @Description("The \"Ministranci i LSO\" link")
    public void altarBoysLink() {

        actions(MinistrySideMenu::clickAltarBoysLink, URLs.ALTAR_BOYS_PAGE.getName());
    }

    @Test
    @Description("The \"Dzieci Maryi\" link")
    public void marysChildrenLink() {

        actions(MinistrySideMenu::clickMarysChildrenLink, URLs.MARYS_CHILDREN_PAGE.getName());
    }

    @Test
    @Description("The \"Oaza młodzieżowa\" link")
    public void oasisLink() {

        actions(MinistrySideMenu::clickOasisLink, URLs.OASIS_PAGE.getName());
    }

    @Test
    @Description("The \"Domowy Kościół\" link")
    public void homeChurchLink() {

        actions(MinistrySideMenu::clickHomeChurchLink, URLs.HOME_CHURCH_PAGE.getName());
    }

    @Test
    @Description("The \"Katecheza dorosłych\" link")
    public void catechesisLink() {

        actions(MinistrySideMenu::clickCatechesisLink, URLs.CATECHESIS_PAGE.getName());
    }

    @Test
    @Description("The \"PoCo\" link")
    public void pocoLink() {

        actions(MinistrySideMenu::clickPocoLink, URLs.POCO_PAGE.getName());
    }

    @Test
    @Description("The \"Legion Maryi\" link")
    public void legionOfMaryLink() {

        actions(MinistrySideMenu::clickLegionOfMaryLink, URLs.LEGION_OF_MARY.getName());
    }

    @Test
    @Description("The \"Żywy Różaniec\" link")
    public void livingRosaryLink() {

        actions(MinistrySideMenu::clickLivingRosaryLink, URLs.LIVING_ROSARY_PAGE.getName());
    }

    @Test
    @Description("The \"Wspólnota Matki Miłosiernego\" link")
    public void mothersCommunityLink() {

        actions(MinistrySideMenu::clickMothersCommunityLink, URLs.MOTHERS_COMMUNITY.getName());
    }
}
