package qa.pageobject;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import qa.base.BasePage;

public class SearchResultsPage extends BasePage {

    private final Locator content;
    private int foundArticlesCount;
    private final String PAGE_HEADER_TITLE_SELECTOR = ".page-header-title.clr";
    private final String NO_CONTENT_MESSAGE = "Przepraszamy, ale nic nie pasowało do wyszukiwanych haseł. Spróbuj ponownie, używając różnych słów kluczowych.";

    public SearchResultsPage(Page page) {

        super(page);

        content = page.locator("#content");
        this.foundArticlesCount = 0;
    }

    public void findArticles() {

        foundArticlesCount = getPage().querySelectorAll("[id^='post-']").size();
    }

    public int getFoundArticlesCount() {

        return foundArticlesCount;
    }

    public String getPageHeaderTitleSelector() {

        return PAGE_HEADER_TITLE_SELECTOR;
    }

    public boolean isNoContentMessageVisible() {

        return content.textContent().trim().equals(NO_CONTENT_MESSAGE);
    }

}