package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import lombok.Getter;
import qa.base.BasePage;

public class SearchEngine extends BasePage {

    private final String SEARCH_FIELD_SELECTOR = "#ocean-search-form-1";
    @Getter
    private final Locator icon;
    @Getter
    private final Locator searchField;


    public SearchEngine(Page page) {

        super(page);

        icon = page.locator(".search-toggle-li");
        searchField = page.locator(SEARCH_FIELD_SELECTOR);
    }

    @io.qameta.allure.Step("Click the search engine icon")
    @io.qase.api.annotation.Step("Click the search engine icon")
    public void clickIcon() {

        icon.click();
    }

    @io.qameta.allure.Step("Enter a phrase")
    @io.qase.api.annotation.Step("Enter a phrase")

    public void setPhrase(String phrase) {

        searchField.fill(phrase);
    }

    @io.qameta.allure.Step("Press the ENTER key")
    @io.qase.api.annotation.Step("Press the ENTER key")
    public void submit() {

        searchField.press("Enter");
    }

    public String getSearchFieldSelector() {

        return SEARCH_FIELD_SELECTOR;
    }

    public String getText() {

        return searchField.innerText();
    }
}
