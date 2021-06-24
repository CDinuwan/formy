package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class ModelPage {
    WebDriver driver;

    private By closeBtn=By.id("close-button");
    private By jsAlertBtn=By.id("modal-button");

    public void clickJsAlertBtn(){
        $(jsAlertBtn).shouldBe(Condition.enabled).click();
    }
    public void clickCloseBtn(){
        sleep(2000);
        SelenideElement element=$(closeBtn);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].click();",element);
    }
}
