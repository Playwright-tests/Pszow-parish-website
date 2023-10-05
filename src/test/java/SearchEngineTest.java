import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.components.MainMenu;
import qa.components.SearchEngine;
import qa.components.SearchResultPage;
import qa.stepclasses.SearchEngineSteps;
import qa.utils.Provider;
import java.util.function.Consumer;


@Epic("Smoke tests")
@Feature("Search engine tests")
public class SearchEngineTest extends BaseTest {

    private SearchEngine searchEngine;
    private SearchResultPage searchResultPage;
    private SearchEngineSteps searchEngineSteps;

    @BeforeMethod
    public void create() {

        MainMenu mainMenu = new MainMenu(getDriver());
        searchEngine = new SearchEngine(getDriver());
        searchResultPage = new SearchResultPage(getDriver());
        searchEngineSteps = new SearchEngineSteps(searchEngine);

        mainMenu.click("KONTAKT");
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Testing whether the placeholder disappears when the field is clicked")
    @Story("Clicking on the search engine field")
    public void clickingOnField() {

        //ExtentReportsManager.setTestName("Clicking on the search engine field");

        searchEngine.clickOnField();

        Assert.assertEquals(searchEngine.getFieldValue(), "");
    }

    private void check(String phrase, Consumer<Boolean> consumer) {

        searchEngineSteps.enterPhrase(phrase);
        searchEngineSteps.pressTheEnterKey();

        consumer.accept(searchResultPage.isContainerPageContentPresent());
    }

    @Test(priority = 2, dataProvider = "correctPhrase", dataProviderClass = Provider.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test description: testing whether articles will be found after searching with with a correct phrase")
    @Epic("Searching with a correct phrase")
    public void correctPhrase(String phrase) {

        //ExtentReportsManager.setTestName("Searching with correct phrase");

        check(phrase, Assert::assertTrue);
    }

    @Test(priority = 3, dataProvider = "incorrectPhrase", dataProviderClass = Provider.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test description: testing whether articles will be found after searching with with an incorrect phrase")
    @Epic("Searching with an incorrect phrase")
    public void incorrectPhrase(String phrase) {

        //ExtentReportsManager.setTestName("Searching with incorrect phrase");

        check(phrase, Assert::assertFalse);
    }
}
