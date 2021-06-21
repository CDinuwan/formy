package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserInputPage {

    private By userInputField=By.xpath("//input[@id='name']");
    private By button=By.xpath("//button[@id='button']");

    public void setUserInputField(String userInput){
        $(userInputField).shouldBe(Condition.visible).setValue(userInput);
    }
    public void clickButton(){
        $(button).shouldBe(Condition.enabled).click();
    }
}
