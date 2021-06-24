package alerttest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.SwitchWindowPage;

public class AlertTest extends BaseTest {

    @Test
    public void alertTest(){
        SwitchWindowPage windowPage= homePage.clickSwitchWindowLink();
        windowPage.clickAlertButton();
    }
}
