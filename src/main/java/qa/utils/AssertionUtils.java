package qa.utils;

import java.util.List;
import java.util.stream.Collectors;

public class AssertionUtils {

    public static String formatAssertionMessage(List<Results> results) {

        return results.stream()
                .map(r -> r.getElement() + ": expected: " + r.isExpected() + " actual: " + r.isActual())
                .collect(Collectors.joining("\n"));
    }
}
