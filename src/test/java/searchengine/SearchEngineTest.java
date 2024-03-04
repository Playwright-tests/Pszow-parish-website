package searchengine;

import io.qameta.allure.*;
import io.qase.api.annotation.QaseId;
import io.qase.api.annotation.QaseTitle;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qa.base.BaseTest;
import qa.pageobject.SearchEngine;
import qa.pageobject.SearchResultsPage;
import qa.dataprovider.DataProviders;
import qa.enums.URLs;
import qa.support.DataProviderNames;
import qa.support.WaitForSelector;

@Epic("E2E")
@Feature("Search engine")
public class SearchEngineTest extends BaseTest {
    private SearchEngine searchEngine;
    private SearchResultsPage searchResultsPage;

    @BeforeMethod
    public void create() {

        goToPage(URLs.BASE_URL.getName());

        searchEngine = new SearchEngine(getPage());
        searchResultsPage = new SearchResultsPage(getPage());
    }

    private void actions(String phrase) {

        searchEngine.clickIcon();
        searchEngine.setPhrase(phrase);
        searchEngine.submit();
    }

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("The search field visibility")
    @QaseId(40)
    @QaseTitle("The search field visibility")
    public void searchFieldVisibility() {

        searchEngine.clickIcon();
        WaitForSelector.visible(getPage(), searchEngine.getSearchFieldSelector());
        searchEngine.clickIcon();
        WaitForSelector.hidden(getPage(), searchEngine.getSearchFieldSelector());
    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Text input verification")
    @QaseId(41)
    @QaseTitle("Text input verification")
    public void inputTextVerification() {

        String text = "Example";
        searchEngine.clickIcon();
        searchEngine.setPhrase(text);

        Assert.assertEquals(searchEngine.getText(), text, "Incorrect input");
    }

    @Test(priority = 2, dataProvider = DataProviderNames.CORRECT, dataProviderClass = DataProviders.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Searching with a correct phrase")
    @QaseId(42)
    @QaseTitle("Searching with a correct phrase")
    public void correctPhrase(String phrase) {

        actions(phrase);
        getPage().waitForSelector(searchResultsPage.getPageHeaderTitleSelector());
        searchResultsPage.findArticles();

        Assert.assertTrue(searchResultsPage.getFoundArticlesCount() > 0, "No found articles");
        Assert.assertFalse(searchResultsPage.isNoContentMessageVisible(), "The message about no articles found is visible");
    }

    @Test(priority = 3, dataProvider = DataProviderNames.INCORRECT, dataProviderClass = DataProviders.class)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Searching with an incorrect phrase")
    @QaseId(43)
    @QaseTitle("Searching with an incorrect phrase")
    public void incorrectPhrase(String phrase) {

        actions(phrase);
        getPage().waitForSelector(searchResultsPage.getPageHeaderTitleSelector());
        searchResultsPage.findArticles();

        Assert.assertFalse(searchResultsPage.getFoundArticlesCount() > 0, "Articles have been found");
        Assert.assertTrue(searchResultsPage.isNoContentMessageVisible(), "The message about no articles found is not visible");
    }
}