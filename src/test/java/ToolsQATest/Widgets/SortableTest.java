package ToolsQATest.Widgets;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.ToolsQAPage.BaseTestToolsQA;
import org.ToolsQAPage.GeneratorMethodsToolsQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SortableTest extends BaseTestToolsQA {
   private final By byOne = By.xpath("(//div[@class='card mt-4 top-card'])[5]");
   private final By byTwo = By.xpath("(//li[@id='item-0'])[5]");
   @Test
    public void test(){
       GeneratorMethodsToolsQA.clickToExercise().clickOnExerciseFunc(byOne,byTwo);

      List<String> text1 = $$(By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action']")).shouldBe(CollectionCondition.size(6)).texts();

      WebElement wrappedElement1 = $(By.xpath("(//div[@class='list-group-item list-group-item-action'])[1]")).shouldBe(Condition.visible).getWrappedElement();
      WebElement wrappedElement2 = $(By.xpath("(//div[@class='list-group-item list-group-item-action'])[2]")).shouldBe(Condition.visible).getWrappedElement();
      WebElement wrappedElement4 = $(By.xpath("(//div[@class='list-group-item list-group-item-action'])[5]")).shouldBe(Condition.visible).getWrappedElement();
      WebElement wrappedElement5 = $(By.xpath("(//div[@class='list-group-item list-group-item-action'])[4]")).shouldBe(Condition.visible).getWrappedElement();


       Selenide.actions().dragAndDrop(wrappedElement1, wrappedElement4).perform();
       Selenide.actions().dragAndDrop(wrappedElement2, wrappedElement5).perform();
       Selenide.sleep(2000);

      List<String> text2 = $$(By.xpath("//div[@class='vertical-list-container mt-4']//div[@class='list-group-item list-group-item-action']")).shouldBe(CollectionCondition.size(6)).texts();
      Assert.assertNotEquals(text1,text2);
   }

}
