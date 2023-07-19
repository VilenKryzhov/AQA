package ToolsQATest.Widgets;

import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;


public class ProgressBar extends BaseTestToolsQA {
    @Test
    public void test() {
        Selenide.sleep(1000);

        $(By.xpath("//button[@id='startStopButton']")).click();

        while (true) {
            if ($(By.xpath("//div[@class='progress-bar bg-info']")).text().equals("60%")) {
                $(By.xpath("//button[@id='startStopButton']")).click();
                break;
            }
        }
        Assert.assertEquals($(By.xpath("//div[@class='progress-bar bg-info']")).text(), "60%");


    }
}
