package ToolsQATest.Widgets;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;


public class ToolTipsTest extends BaseTestToolsQA {
    @Test
    public void test(){

        $(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
        $(By.xpath("(//li[@id='item-6'])[2]")).scrollIntoView(true).click();

        WebElement element1 = Selenide.webdriver().object().findElement(By.xpath("//button[@id='toolTipButton']"));
        Selenide.actions().moveToElement(element1).perform();
        Selenide.sleep(1000);
        String attributeGreenBtn = $(By.xpath("//button[@id='toolTipButton']")).getAttribute("aria-describedby");
        System.out.println(attributeGreenBtn);
        Assert.assertEquals("buttonToolTip", attributeGreenBtn);
        Selenide.sleep(1000);

        WebElement element2 = Selenide.webdriver().object().findElement(By.xpath("//input[@id='toolTipTextField']"));
        Selenide.actions().moveToElement(element2).perform();
        Selenide.sleep(1000);
        String attributeInput = $(By.xpath("//input[@id='toolTipTextField']")).getAttribute("aria-describedby");
        Assert.assertEquals("textFieldToolTip", attributeInput);

        WebElement element3 = Selenide.webdriver().object().findElement(By.xpath("//a[text()='Contrary']"));
        Selenide.actions().moveToElement(element3).perform();
        Selenide.sleep(1000);
        String attributeTextContrary = $(By.xpath("//a[text()='Contrary']")).getAttribute("aria-describedby");
        Assert.assertEquals("contraryTexToolTip", attributeTextContrary);

        WebElement element4 = Selenide.webdriver().object().findElement(By.xpath("//a[text()='1.10.32']"));
        Selenide.actions().moveToElement(element4).perform();
        Selenide.sleep(1000);
        String attributeNumber = $(By.xpath("//a[text()='1.10.32']")).getAttribute("aria-describedby");
        Assert.assertEquals("sectionToolTip", attributeNumber);


    }
}
