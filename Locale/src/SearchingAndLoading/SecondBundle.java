package SearchingAndLoading;

import java.util.ListResourceBundle;

public class SecondBundle  extends ListResourceBundle {

    protected Object[][] getContents() {
        return new Object[][]{
                {"default", "Yes"},
                {"synonyms", new String[]{"Yea", "Yep", "Sure", "Of course"}},
                {"jane", new Employee("Jane", "HR", "Manager")},
                {"age", 40}
        };
    }
}
