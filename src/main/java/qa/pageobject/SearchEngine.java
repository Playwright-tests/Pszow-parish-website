package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import qa.base.BasePage;

public class SearchEngine extends BasePage {

    private final Locator icon;
    private final Locator searchField;
    public SearchEngine(Page page) {

        super(page);

        icon = page.locator(".search-toggle-li");
        searchField = page.locator("#ocean-search-form-1");
    }

    @io.qameta.allure.Step("Click the icon")
    public void clickIcon() {

        icon.click();
    }

    @io.qameta.allure.Step("Enter the phrase")
    public void setPhrase(String phrase) {

        searchField.fill(phrase);
    }

    @io.qameta.allure.Step("Press the ENTER key")
    public void submit() {

        searchField.press("Enter");
    }

    public Locator getSearchField() {

        return searchField;
    }

    public String getText() {

        return searchField.innerText();
    }
}
