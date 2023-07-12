package ToolsQATest.DownloadUploadTest.BrowserWindowTest;


import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class BrowserWindowTest extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[3]");
    By byTwo = By.xpath("(//li[@id='item-0'])[3]");
    By tabElementText = By.xpath("//h1[@id='sampleHeading']");
    By tabButton = By.xpath("//button[@id='tabButton']");
    By windowButton = By.xpath("//button[@id='windowButton']");
    By messegeWindowButton = By.xpath("//button[@id='messageWindowButton']");
    String tabText = "This is a sample page";

    @Test
    public void test(){
        GeneratorMethodsToolsQA.uploadDownload().clickOnExercise(byOne,byTwo);
        GeneratorMethodsToolsQA.browserWindow().clickToNewWindow(tabButton);
        Selenide.switchTo().window(1);
        String elementTextFromTabWindow = GeneratorMethodsToolsQA.browserWindow().getElementTextFromTabWindow(tabElementText);
        Assert.assertEquals(tabText,elementTextFromTabWindow);
        Selenide.sleep(2000);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
        Selenide.sleep(1000);
        GeneratorMethodsToolsQA.browserWindow().clickToNewWindow(windowButton);
        Selenide.switchTo().window(1);
        String elementTextFromTabWindow1 = GeneratorMethodsToolsQA.browserWindow().getElementTextFromTabWindow(tabElementText);
        Assert.assertEquals(tabText,elementTextFromTabWindow1);
        Selenide.sleep(2000);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
        GeneratorMethodsToolsQA.browserWindow().clickToNewWindowMessege(messegeWindowButton);
        Selenide.switchTo().window(1);
        Selenide.closeWindow();
        Selenide.switchTo().window(0);



    }

}
