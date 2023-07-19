package ToolsQATest.Widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class TabsTest extends BaseTestToolsQA {
    @Test
    public void test(){
        $(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
        $(By.xpath("(//li[@id='item-5'])[2]")).scrollIntoView(true).click();

        String attributeTabWhat = $(By.xpath("//a[@id='demo-tab-what']")).shouldBe(Condition.enabled).getAttribute("aria-selected");
        Assert.assertEquals(attributeTabWhat, "true");

        $(By.xpath("//a[@id='demo-tab-origin']")).shouldBe(Condition.enabled).click();
        Selenide.sleep(1500);
        String attributeTabOrigin = $(By.xpath("//a[@id='demo-tab-origin']")).getAttribute("aria-selected");
        Assert.assertEquals(attributeTabOrigin, "true");

        $(By.xpath("//a[@id='demo-tab-use']")).shouldBe(Condition.enabled).click();
        Selenide.sleep(1500);
        String attributeTabUse = $(By.xpath("//a[@id='demo-tab-use']")).getAttribute("aria-selected");
        Assert.assertEquals(attributeTabUse, "true");
        Selenide.sleep(1500);

        String attributeTabMore = $(By.xpath("//a[@id='demo-tab-more']")).shouldBe(Condition.visible    ).getAttribute("aria-selected");
        Assert.assertEquals(attributeTabMore, "false");
        Selenide.sleep(1500);


    }
}
