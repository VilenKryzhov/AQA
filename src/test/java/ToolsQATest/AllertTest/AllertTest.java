package ToolsQATest.AllertTest;

import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AllertTest extends BaseTestToolsQA {

    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[3]");
    By byTwo = By.xpath("(//li[@id='item-1'])[2]");
    By allertButton = By.xpath("//button[@id='alertButton']");
    By timerAllertButton = By.xpath("//button[@id='timerAlertButton']");
    By confirmButton = By.xpath("//button[@id='confirmButton']");
    By textConfirmResult = By.xpath("//span[@id='confirmResult']");
    By promptButton = By.xpath("//button[@id='promtButton']");
    By textPromptResult = By.xpath("//span[@id='promptResult']");

    String textTimerAllert = "This alert appeared after 5 seconds";
    String textConfirmButtonCheckAccept = "You selected Ok";
    String textConfirmButtonCheckCancel = "You selected Cancel";
    String textPromptButtonCheckCancel = "You entered New Name";
    @Test
    public void test() {
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);
        GeneratorMethodsToolsQA.allert().clickOnAlertButton(allertButton);
        Selenide.switchTo().alert();
        GeneratorMethodsToolsQA.allert().checkAllertOpen();
        GeneratorMethodsToolsQA.allert().clickOnAlertButton(timerAllertButton);
        String text = Selenide.switchTo().alert().getText();
        Assert.assertEquals(text, textTimerAllert);
        Selenide.sleep(1000);
        Selenide.switchTo().alert().accept();
        Selenide.sleep(1000);
        GeneratorMethodsToolsQA.allert().clickOnAlertButton(confirmButton);
        Selenide.switchTo().alert().accept();
        String confirmElementTextAccept = GeneratorMethodsToolsQA.allert().getElementText(textConfirmResult);
        Assert.assertEquals(confirmElementTextAccept, textConfirmButtonCheckAccept);
        Selenide.sleep(2000);
        GeneratorMethodsToolsQA.allert().clickOnAlertButton(confirmButton);
        Selenide.switchTo().alert().dismiss();
        String confirmElementTextCancel = GeneratorMethodsToolsQA.allert().getElementText(textConfirmResult);
        Assert.assertEquals(confirmElementTextCancel, textConfirmButtonCheckCancel);
        GeneratorMethodsToolsQA.allert().clickOnAlertButton(promptButton);
        Selenide.sleep(1000);
        Selenide.switchTo().alert().sendKeys("New Name");
        Selenide.sleep(1000);
        Selenide.switchTo().alert().accept();
        Selenide.sleep(1000);
        String buttonPromptText = GeneratorMethodsToolsQA.allert().getButtonText(textPromptResult);
        Assert.assertEquals(buttonPromptText, textPromptButtonCheckCancel);
        Selenide.sleep(1000);


    }
}
