package ToolsQATest.Interactions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class ContainerRestrictedTest {
    @BeforeClass(alwaysRun = true, description = "create config for our test")
    public void selenideConfig() {
        Configuration.startMaximized = true;

    }
    @BeforeMethod(alwaysRun = true, description = "open basic URL")
    public void setUp() {
        Selenide.open("https://demoqa.com/dragabble");
    }

    @Test
    public void test() {
        $(By.xpath("//a[@id='draggableExample-tab-containerRestriction']")).shouldBe(Condition.enabled).click();
        WebElement containerWithBox = $(By.xpath("//div[text()=\"I'm contained within the box\"]")).shouldBe(Condition.visible).getWrappedElement();
        String containerWithBoxAttribute = containerWithBox.getAttribute("style");
        System.out.println("Before dragAndDrop style --->" + containerWithBoxAttribute);
        Selenide.sleep(1000);
        actions().dragAndDropBy(containerWithBox, 673, 106).perform();
        Selenide.sleep(1000);
        System.out.println("After dragAndDrop style --->" + containerWithBox.getAttribute("style"));
        Assert.assertEquals("position: relative; left: 673px; top: 106px;", containerWithBox.getAttribute("style"));
        Selenide.sleep(2000);
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
