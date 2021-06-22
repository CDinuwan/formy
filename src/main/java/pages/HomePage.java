package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    private By userInputLink=By.linkText("Key and Mouse Press");
    private By autoCompleteFormLink=By.linkText("Autocomplete");
    private By pageScrollLink=By.linkText("Page Scroll");

    public UserInputPage clickUserInputLink(){
        $(userInputLink).shouldBe(Condition.visible).click();
        return new UserInputPage();
    }

    public AutoCompleteWebFormPage clickAutoCompleteFormLink(){
        $(autoCompleteFormLink).shouldBe(Condition.visible).click();
        return new AutoCompleteWebFormPage();
    }

    public PageScroll clickPageScrollLink(){
        $(pageScrollLink).shouldBe(Condition.enabled).click();
        return new PageScroll();
    }
}
