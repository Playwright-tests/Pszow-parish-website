package qa.dataprovider;

import org.testng.annotations.DataProvider;
import qa.support.TestdataLoader;
import qa.support.DataProviderNames;

public class DataProviders {

    @DataProvider(name = DataProviderNames.ITEMS)
    public Object[] expanded() {

        return TestdataLoader.getItems(DataProviderNames.ITEMS);
    }

    @DataProvider(name = DataProviderNames.CORRECT)
    public Object[] correctPhrase() {

        return TestdataLoader.getPhrases(DataProviderNames.CORRECT);
    }

    @DataProvider(name = DataProviderNames.INCORRECT)
    public Object[] incorrectPhrase() {

        return  TestdataLoader.getPhrases(DataProviderNames.INCORRECT);
    }
}