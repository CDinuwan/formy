package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    public HomePage homePage=new HomePage();

    @BeforeClass
    public void setUp(){
        open("https://formy-project.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
        closeWebDriver();
    }
}
