package inputtest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.UserInputPage;

public class InputTest extends BaseTest {

    @Test
    public void inputTest(){
        UserInputPage userInputPage= homePage.clickUserInputLink();
        userInputPage.setUserInputField("Chanuka Dinuwan");
        userInputPage.clickButton();
    }
}
