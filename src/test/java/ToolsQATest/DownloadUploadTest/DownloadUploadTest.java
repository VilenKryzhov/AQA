package ToolsQATest.DownloadUploadTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class DownloadUploadTest extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[1]");
    By byTwo = By.xpath("(//li[@id='item-7'])[1]");

    @BeforeClass
    public void setUpBeforeDownload() {
        Configuration.fileDownload = FileDownloadMode.FOLDER;
    }

    @Test
   public void test() throws IOException {
        GeneratorMethodsToolsQA.uploadDownload().clickOnExercise(byOne,byTwo);
        Selenide.sleep(1000);
        File file = $(By.xpath("//a[text()=\"Download\"]")).shouldBe(Condition.visible).download();
        Assert.assertTrue(file.exists());
        String absolutePath = file.getAbsolutePath();
        Assert.assertFalse(absolutePath.isEmpty());
        Selenide.sleep(3000);
        $(By.xpath("//input[@id='uploadFile']")).shouldBe(Condition.enabled).uploadFile(new File("C:\\javaID\\javaModule\\QA\\build\\downloads\\62801976-6018-4e8a-ab72-219e2b3023c9"));
        FileUtils.deleteDirectory(new File("C:\\javaID\\javaModule\\QA\\build\\downloads"));
    }



}