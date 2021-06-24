package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class DragAndDropPage {

    public void dragAndDrop(){
        SelenideElement image=$("#image");
        SelenideElement box=$("#box");
        actions().dragAndDrop(image,box).build().perform();
    }
}
