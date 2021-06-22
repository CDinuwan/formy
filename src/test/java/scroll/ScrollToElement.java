package scroll;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.PageScroll;

public class ScrollToElement extends BaseTest {

    @Test
    public void testScrollToElement(){
        PageScroll pageScroll=homePage.clickPageScrollLink();
        pageScroll.setFullNameField("Chanuka Dinuwan");
        pageScroll.setDateField("01/02/2020");
    }
}
