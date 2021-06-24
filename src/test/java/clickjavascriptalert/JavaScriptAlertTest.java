package clickjavascriptalert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ModelPage;

public class JavaScriptAlertTest extends BaseTest {

    @Test
    public void javaScriptExecutorTest(){
        ModelPage modelPage= homePage.clickModelLink();
        modelPage.clickJsAlertBtn();
        modelPage.clickCloseBtn();
    }
}
