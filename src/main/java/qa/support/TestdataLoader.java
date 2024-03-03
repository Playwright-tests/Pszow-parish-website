package qa.support;

import org.json.JSONArray;
import org.json.JSONObject;
import qa.models.ItemData;

import java.util.stream.IntStream;

public class TestdataLoader {

    public static String[] getPhrases(String key) {

        JSONObject jsonObject = new JSONObject(JsonFileReader.getSource());
        JSONArray jsonArray = jsonObject.getJSONArray(key);

        return IntStream.range(0, jsonArray.length())
                .mapToObj(jsonArray::getString)
                .toArray(String[]::new);
    }

    public static ItemData[] getItems(String key) {

        JSONObject jsonObject = new JSONObject(JsonFileReader.getSource());
        JSONArray jsonArray = jsonObject.getJSONArray(key);

        return IntStream.range(0, jsonArray.length())
                .mapToObj(i -> new ItemData(
                        jsonArray.getJSONObject(i).getString("name"),
                        jsonArray.getJSONObject(i).getString("tabContent")
                ))
                .toArray(ItemData[]::new);
    }
}
