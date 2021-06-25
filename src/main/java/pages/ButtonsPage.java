package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ButtonsPage {

    private By primaryBtn=By.linkText("Primary");

    public void clickPrimaryBtn(){
        $(primaryBtn).shouldBe(Condition.visible).click();
    }
}
