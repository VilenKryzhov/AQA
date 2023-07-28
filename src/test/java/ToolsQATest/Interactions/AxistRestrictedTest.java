package ToolsQATest.Interactions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;


public class AxistRestrictedTest {
    @BeforeMethod(alwaysRun = true, description = "open basic URL")
    public void setUp() {
        Selenide.open("https://demoqa.com/dragabble");
    }

    @Test
    public void test() {
        $(By.xpath("//a[@id='draggableExample-tab-axisRestriction']")).shouldBe(Condition.enabled).click();
        WebElement onlyX = $(By.xpath("//div[@id='restrictedX']")).shouldBe(Condition.visible).getWrappedElement();
        String onlyXAttribute = onlyX.getAttribute("style");
        System.out.println("Before dragAndDrop style --->" + onlyXAttribute);
        Selenide.sleep(1000);
        actions().dragAndDropBy(onlyX, 100, 100).perform();
        Selenide.sleep(1000);
        System.out.println("After dragAndDrop style --->" + onlyX.getAttribute("style"));
        Assert.assertEquals("position: relative; left: 100px; top: 0px;", onlyX.getAttribute("style"));

    }


    @AfterMethod(alwaysRun = true, description = "WebDriver clean up")
    public void cleanWebDriver() {
        Selenide.clearBrowserCookies();
//        Selenide.refresh();
        Selenide.open("about:blank");
    }

    @AfterSuite(alwaysRun = true, description = "Closing browser")
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
