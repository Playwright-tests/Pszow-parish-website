package qa.dataprovider;

import org.testng.annotations.DataProvider;
import qa.jsonreader.JSONReader;
import qa.utils.DataProviderNames;

public class DataProviders {

    @DataProvider(name = DataProviderNames.EXPANDED)
    public Object[] expanded() {

        return JSONReader.getGalleryButtonNames(DataProviderNames.EXPANDED);
    }

    @DataProvider(name = DataProviderNames.COLLAPSED)
    public Object[] collapsed() {

        return JSONReader.getGalleryButtonNames(DataProviderNames.COLLAPSED);
    }

    @DataProvider(name = DataProviderNames.CORRECT)
    public Object[] correctPhrase() {

        return JSONReader.getPhrases(DataProviderNames.CORRECT);
    }

    @DataProvider(name = DataProviderNames.INCORRECT)
    public Object[] incorrectPhrase() {

        return  JSONReader.getPhrases(DataProviderNames.INCORRECT);
    }
}