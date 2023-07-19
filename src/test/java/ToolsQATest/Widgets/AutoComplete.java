package ToolsQATest.Widgets;

import com.codeborne.selenide.Condition;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AutoComplete extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[4]");
    By byTwo = By.xpath("(//li[@id='item-1'])[3]");

    @Test
    public void test() {
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);

        $(By.xpath("//input[@id='autoCompleteSingleInput']")).append("r");

        ArrayList<String> collection = (ArrayList<String>) $$(By.cssSelector("div.auto-complete__option")).texts();
        System.out.println(collection);

        for (String suggestion : collection) {
            if (suggestion.equalsIgnoreCase("red")) {
                System.out.println("Auto complete is work");
                $(By.xpath("//div[text()='Red']")).shouldBe(Condition.enabled).click();
            } else if (suggestion.equalsIgnoreCase("green")) {
                System.out.println("Auto complete is work");
            } else if (suggestion.equalsIgnoreCase("purple")) {
                System.out.println("Auto complete is work");
            }
        }
    }
}
