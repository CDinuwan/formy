package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SwitchWindowPage {

    private By newTabButton=By.id("new-tab-button");
    private By alertButton=By.id("alert-button");

    public void clickNewTabButton(){
        $(newTabButton).shouldBe(Condition.visible).click();
        switchTo().window(1);
        switchTo().defaultContent();
    }
    public void clickAlertButton(){
        $(alertButton).shouldBe(Condition.visible).click();

        Alert alert= switchTo().alert();
        alert.accept();
    }
}
