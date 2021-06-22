package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SwitchWindowPage {

    private By newTabButton=By.id("new-tab-button");

    public void clickNewTabButton(){
        $(newTabButton).shouldBe(Condition.visible).click();

        String originalHandle=
    }
}
