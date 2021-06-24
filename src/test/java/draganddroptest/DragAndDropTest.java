package draganddroptest;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DragAndDropPage;

import static com.codeborne.selenide.Selenide.sleep;

public class DragAndDropTest extends BaseTest {

    @Test
    public void dragAndDropTest(){
        DragAndDropPage dragAndDropPage= homePage.clickDragAndDropLink();
        dragAndDropPage.dragAndDrop();
        sleep(5000);
    }
}
