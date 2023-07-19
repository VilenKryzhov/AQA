package ToolsQATest.Widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Conditional;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class DataPicker  {
//    By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[4]");
//    By byTwo = By.xpath("(//li[@id='item-2'])[3]");
    String dateValue = "10/20/2023";

    @Test
    public void test(){
//        GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne, byTwo);
        System.setProperty("webdriver.chrome.driver", "C:/Users/DASHA/.cache/selenium/chromedriver/win32/114.0.5735.90/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/date-picker");
        WebElement element1 = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']"));
        element1.click();
        WebElement element = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select select = new Select(element);
        select.selectByVisibleText("2003");
//        $(By.xpath("//input[@id='datePickerMonthYearInput']")).shouldBe(Condition.enabled).click();
//        Selenide.sleep(1000);
//        $(By.xpath("//select[@class='react-datepicker__month-select']")).shouldBe(Condition.enabled).click();
//        Selenide.sleep(1000);
//        $(By.xpath("//option[text()='October']")).shouldBe(Condition.enabled).click();
//        Selenide.sleep(1000);
//        $(By.xpath("//select[@class='react-datepicker__year-select']")).shouldBe(Condition.enabled).click();
//        Selenide.sleep(1000);
//        $(By.cssSelector("div.react-datepicker__day--020")).shouldBe(Condition.enabled).click();
//        String value = $(By.xpath("//input[@id='datePickerMonthYearInput']")).shouldBe(Condition.visible).getValue();
//        Selenide.sleep(2000);
//        System.out.println(value);
//        Assert.assertEquals(dateValue, value);
//        $(By.xpath("//input[@id='dateAndTimePickerInput']")).append("September 6, 2023 12:03 PM");
//        String value1 = $(By.xpath("//input[@id='dateAndTimePickerInput']")).getValue();
//        System.out.println(value1);




    }
}
