package switchwindow;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SwitchWindowPage;

public class SwitchToWindowTest extends BaseTest {

    @Test
    public void switchToWindowTest(){
        SwitchWindowPage windowPage= homePage.clickSwitchWindowLink();
        windowPage.clickNewTabButton();
    }

}
