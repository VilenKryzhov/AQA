package ToolsQATest.Widgets;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Accordion extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[4]");
    By byTwo = By.xpath("(//li[@id='item-0'])[4]");
    @Test
    public void test() throws InterruptedException {
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);
        Selenide.sleep(1000);
        String attribute = $(By.xpath("(//div[@class='card'])[1]//div[2]")).shouldBe(Condition.visible).getAttribute("class");
        System.out.println(attribute);
        $(By.xpath("(//div[@class='card-header'])[1]")).shouldBe(Condition.enabled).click();
        Selenide.sleep(2000);
        String attribute1 = $(By.xpath("(//div[@class='card'])[1]//div[2]")).shouldBe(Condition.hidden).getAttribute("class");
        System.out.println(attribute1);
        Assert.assertNotEquals(attribute1, attribute);





    }
}
