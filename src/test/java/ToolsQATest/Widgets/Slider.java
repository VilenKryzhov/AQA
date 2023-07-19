package ToolsQATest.Widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;


import static com.codeborne.selenide.Selenide.$;

public class Slider extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[4]");
    By byTwo = By.xpath("(//li[@id='item-3'])[3]");

    @Test
    public void test() {
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);

        SelenideElement slider = $(By.xpath("//input[@class='range-slider range-slider--primary']")).shouldBe(Condition.visible);

        Selenide.actions().dragAndDropBy(slider, 50, 0).perform();

        String value = slider.getValue();

        System.out.println("Recent value first:  ->" + value);

        String value1 = $(By.xpath("//input[@id='sliderValue']")).shouldBe(Condition.visible).getValue();

        System.out.println("Recent value second:  ->" + value1);

        Assert.assertEquals(value, value1, "Recent not Equals!");

    }
}
