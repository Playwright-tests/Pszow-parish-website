package qa.models;

import lombok.Getter;

@Getter
public class ItemData {

    private final String name;
    private final String tabContent;

    public ItemData(String name, String tabContent) {

        this.name = name;
        this.tabContent = tabContent;
    }
}
