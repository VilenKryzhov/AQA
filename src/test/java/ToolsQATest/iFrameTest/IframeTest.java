package ToolsQATest.iFrameTest;

import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;

public class IframeTest extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[3]");
    By byTwo = By.xpath("(//li[@id='item-2'])[2]");
    @Test
    public void test(){
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne,byTwo);
        Selenide.switchTo().frame("frame1");
        String frameText1 = $(By.xpath("//h1")).text();
        Selenide.switchTo().defaultContent();
        Selenide.switchTo().frame("frame2");
        String frameText2 = $(By.xpath("//h1")).text();
        Assert.assertEquals(frameText1,frameText2);
    }
}
