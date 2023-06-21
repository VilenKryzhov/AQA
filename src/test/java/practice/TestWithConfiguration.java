package practice;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class TestWithConfiguration extends BaseTest {
//    @Test
    public void testConfiguration() {
        $(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).shouldBe(Condition.visible).append("Nike Cortez");
//        $(By.xpath("//input[@class='btn btn-prim gh-spr']")).shouldBe(Condition.enabled).click();
        Selenide.actions().sendKeys(Keys.ENTER).perform();
        $$(By.xpath("//div[@class='s-item__image-wrapper image-treatment']")).shouldHave(CollectionCondition.size(61));
        $$(By.xpath("//span[@role='heading']")).shouldHave(CollectionCondition.sizeLessThan(70));
//        List<String> listString = new ArrayList<>();
//        List<String> texts = $$(By.xpath("//span[@role='heading']")).texts();
//        listString.addAll(texts);
//        Stream<String> stringStream = listString.stream().filter(s -> s.length() > 30);
//        stringStream.forEach(System.out::println);
//        $(By.xpath("//li[@id='item3e004663b8']//div[@class='s-item__info clearfix']//span[@role='heading']")).shouldHave(Condition.textCaseSensitive("Nike Cortez ")).click();
//        Assert.assertTrue($(By.xpath("//li[@id='item3e004663b8']//div[@class='s-item__info clearfix']//span[@role='heading']")).is(Condition.text("Nike Cortez")));
        String actualResult = $(By.xpath("//li[@id='item3e004663b8']//div[@class='s-item__info clearfix']//span[@role='heading']")).text();
        String expectedResult = "Nike Cortez Men's Shoes White-Black DM4044-100";
        $(By.xpath("//li[@id='item3e004663b8']//div[@class='s-item__info clearfix']//span[@role='heading']")).shouldHave(Condition.text(expectedResult));
      




    }}


