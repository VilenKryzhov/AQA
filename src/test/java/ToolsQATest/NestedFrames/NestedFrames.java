package ToolsQATest.NestedFrames;

import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;

public class NestedFrames extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[3]");
    By byTwo = By.xpath("(//li[@id='item-3'])[2]");
    String fatherText = "Parent frame";
    String childText = "Child Iframe";

    @Test
    public void test() {
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);
        Selenide.switchTo().frame("frame1");
        String father = $(By.tagName("body")).text();
        System.out.println(father);
        Selenide.switchTo().frame(0);
        String child = $(By.tagName("body")).text();
        System.out.println(child);
        Assert.assertEquals(child, childText);
        Assert.assertEquals(father, fatherText);
        Selenide.switchTo().defaultContent();




    }
}
