package qa.support;

import lombok.Getter;

@Getter
public enum BrowserType {

    CHROME("chrome"),
    FIREFOX("firefox"),
    EDGE("edge");

    private final String name;

    BrowserType(String name) {

        this.name = name;
    }
}
