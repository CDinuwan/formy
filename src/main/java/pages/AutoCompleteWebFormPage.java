package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AutoCompleteWebFormPage {

    private By addressField=By.xpath("//input[@id='autocomplete']");
    private By autoCompleteText=By.className("pac-item");

    public void setAddressField(String address){
        $(addressField).shouldBe(Condition.visible).setValue(address);
        $(autoCompleteText).shouldBe(Condition.visible).click();
    }
}
