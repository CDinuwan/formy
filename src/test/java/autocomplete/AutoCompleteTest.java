package autocomplete;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AutoCompleteWebFormPage;

public class AutoCompleteTest extends BaseTest {
    
    @Test
    public void testAutoComplete() throws InterruptedException {
        AutoCompleteWebFormPage autoCompleteTest=homePage.clickAutoCompleteFormLink();
        Thread.sleep(5000);
        autoCompleteTest.setAddressField("1555 Park Blvd, Palo Alto, CA");
    }
}
