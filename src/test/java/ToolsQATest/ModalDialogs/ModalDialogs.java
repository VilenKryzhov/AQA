package ToolsQATest.ModalDialogs;

import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class ModalDialogs extends BaseTestToolsQA {
    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[3]");
    By byTwo = By.xpath("(//li[@id='item-4'])[2]");
    By smallModal = By.xpath("//button[@id='showSmallModal']");
    By largeModal = By.xpath("//button[@id='showLargeModal']");
    By smallModalBodyText = By.xpath("//div[@class='modal-body']");
    By largeModalBodyText = By.xpath("//div[@class='modal-body']");
    By smallModalButtonClose = By.xpath("//button[@id='closeSmallModal']");
    By largeModalButtonClose = By.xpath("//button[@id='closeLargeModal']");

    @Test
    public void test() {
        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);
        GeneratorMethodsToolsQA.modalDialogs().clickOpenToSmallModal(smallModal);
        String smallModalElementText = GeneratorMethodsToolsQA.modalDialogs().getElementText(smallModalBodyText);
        Assert.assertEquals("This is a small modal. It has very less content", smallModalElementText);
        System.out.println("Small modal text is equals");
        GeneratorMethodsToolsQA.modalDialogs().clickCloseToModal(smallModalButtonClose);
        GeneratorMethodsToolsQA.modalDialogs().clickOpenToSmallModal(largeModal);
        String largeModalElementText = GeneratorMethodsToolsQA.modalDialogs().getElementText(largeModalBodyText);
        GeneratorMethodsToolsQA.modalDialogs().clickCloseToModal(largeModalButtonClose);
        Assert.assertTrue(largeModalElementText.startsWith("Lorem"));
        Assert.assertTrue(largeModalElementText.endsWith("Ipsum."));
        System.out.println("Large modal text is equals");
        String attribute = $(By.xpath("//button[@id='closeLargeModal']")).getAttribute("id");
        System.out.println(attribute);


    }
}
