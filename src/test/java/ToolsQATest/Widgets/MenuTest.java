package ToolsQATest.Widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class MenuTest extends BaseTestToolsQA {
    @Test
    public void test(){
        $(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
        $(By.xpath("(//li[@id='item-7'])[2]")).scrollIntoView(true).click();
        WebElement wrappedElement1 = $(By.xpath("//a[text()='Main Item 2']")).getWrappedElement();
        Selenide.actions().moveToElement(wrappedElement1).perform();
        Selenide.sleep(2000);
        WebElement wrappedElement2 = $(By.xpath("//a[text()='SUB SUB LIST »']")).shouldBe(Condition.visible).getWrappedElement();
        Selenide.actions().moveToElement(wrappedElement2).perform();
        Selenide.sleep(2000);
        WebElement wrappedElement3 = $(By.xpath("//a[text()='Sub Sub Item 2']")).shouldBe(Condition.visible).getWrappedElement();
        Selenide.actions().moveToElement(wrappedElement3).perform();
        Selenide.sleep(2000);
        System.out.println(" Menu is work well done");



    }
}
