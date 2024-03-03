package qa.utils;

import lombok.Getter;

@Getter
public class Results {

    private final String element;
    private final boolean expected;
    private final boolean actual;

    public Results(String element, boolean expected, boolean actual) {

        this.element = element;
        this.expected = expected;
        this.actual = actual;
    }
}
