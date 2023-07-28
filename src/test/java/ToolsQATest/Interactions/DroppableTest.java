package ToolsQATest.Interactions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

public class DroppableTest extends BaseTestToolsQA {
    @BeforeMethod(alwaysRun = true, description = "open basic URL")
    public void setUp() {
        Selenide.open("https://demoqa.com/droppable");
    }

    @Test
    public void test() {
        WebElement wrappedElement1 = $(By.xpath("//div[@id='draggable']")).shouldBe(Condition.visible).getWrappedElement();
        WebElement wrappedElement2 = $(By.xpath("(//div[@class='drop-box ui-droppable'])[1]")).shouldBe(Condition.visible).getWrappedElement();
        Selenide.actions().dragAndDrop(wrappedElement1, wrappedElement2).perform();
        Assert.assertEquals("Dropped!", $(By.xpath("(//div[@class='drop-box ui-droppable ui-state-highlight'])[1]")).text());

        $(By.xpath("//a[text()='Prevent Propogation']")).shouldBe(Condition.enabled).click();

        WebElement wrappedElement3 = $(By.xpath("//div[@id='dragBox']")).shouldBe(Condition.enabled).getWrappedElement();
        WebElement wrappedElement5 = $(By.xpath("//div[@id='greedyDropBoxInner']")).shouldBe(Condition.enabled).getWrappedElement();
        WebElement wrappedElement6 = $(By.xpath("//div[@id='greedyDropBox']")).shouldBe(Condition.visible).getWrappedElement();
        WebElement wrappedElement4 = $(By.xpath("//div[@id='notGreedyInnerDropBox']")).shouldBe(Condition.enabled).getWrappedElement();


        actions().dragAndDrop(wrappedElement3, wrappedElement4).perform();
        Assert.assertEquals("Dropped!", wrappedElement4.getText());
        Selenide.sleep(2000);

        actions().dragAndDrop(wrappedElement3, wrappedElement5).perform();
        Assert.assertEquals("Dropped!", wrappedElement5.getText());
        Selenide.sleep(2000);
        String attribute = wrappedElement6.getAttribute("class");
        Assert.assertEquals(attribute, wrappedElement6.getAttribute("class"));

        actions().dragAndDropBy(wrappedElement3, 0, -100).perform();
        Selenide.sleep(2000);
        Assert.assertNotEquals(attribute, wrappedElement6.getAttribute("class"));

        $(By.xpath("//a[text()='Revert Draggable']")).shouldBe(Condition.enabled).click();
        WebElement revertable = $(By.xpath("//div[@id='revertable']")).shouldBe(Condition.enabled).getWrappedElement();
        WebElement droppable = $(By.xpath("(//div[@id='droppable'])[3]")).shouldBe(Condition.visible).getWrappedElement();
        String droppableAttribute = droppable.getAttribute("class");
        Selenide.sleep(1000);
        actions().dragAndDrop(revertable, droppable).perform();
        Selenide.sleep(2000);
        String revertableAttribute2 = revertable.getAttribute("style");
        Assert.assertEquals(revertableAttribute2, "position: relative; left: 0px; top: 0px;");
        Assert.assertNotEquals(droppableAttribute, droppable.getAttribute("class"));
        Selenide.sleep(2000);

        WebElement notRevertable = $(By.xpath("//div[@id='notRevertable']")).shouldBe(Condition.visible).getWrappedElement();
        String notRevertableAttribute1 = notRevertable.getAttribute("style");
        actions().dragAndDrop(notRevertable, droppable).perform();
        Selenide.sleep(2000);
        String notRevertableAttribute2 =  notRevertable.getAttribute("style");
        Assert.assertNotEquals(notRevertableAttribute1, notRevertableAttribute2);

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
