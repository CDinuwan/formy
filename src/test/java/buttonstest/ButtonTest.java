package buttonstest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ButtonsPage;

public class ButtonTest extends BaseTest {

    @Test
    public void testBtnPage(){
        ButtonsPage buttonsPage=homePage.clickButtonsLink();
        buttonsPage.clickPrimaryBtn();
    }
}
