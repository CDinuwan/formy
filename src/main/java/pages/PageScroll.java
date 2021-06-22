package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class PageScroll {

    private By fullNameField= By.id("name");
    private By dateField=By.id("date");

    public void setFullNameField(String fullName){
        SelenideElement nameField= $(fullNameField);
        actions().moveToElement(nameField);
        $(fullNameField).shouldBe(Condition.enabled).setValue(fullName);
    }

    public void setDateField(String date){
        $(dateField).shouldBe(Condition.visible).setValue(date);
    }
}
