package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private By userInputLink=By.linkText("Key and Mouse Press");
    private By autoCompleteFormLink=By.linkText("Autocomplete");

    public UserInputPage clickUserInputLink(){
        $(userInputLink).shouldBe(Condition.visible).click();
        return new UserInputPage();
    }

    public AutoCompleteWebFormPage clickAutoCompleteFormLink(){
        $(autoCompleteFormLink).shouldBe(Condition.visible).click();
        return new AutoCompleteWebFormPage();
    }
}
