package qa.jsonreader;

import lombok.Getter;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestdataLoader {

    private static final String path = "./src/test/resources/testdata/";

    @Getter
    private static String source;

    public static void load(String fileName) throws IOException, ParseException {

        Reader reader = new FileReader(path + fileName);
        JSONParser jsonParser = new JSONParser();
        source = jsonParser.parse(reader).toString();
    }
}
