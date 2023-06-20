package org.RozetkaTestWebSite;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class TestLink {
    public void clickMenu() {
        $(By.xpath("//button[@class='header__button ng-tns-c37-1']")).shouldBe(Condition.enabled).click();
        Selenide.sleep(2000);
    }
    public void clickToLink(){
        $(By.xpath("(//a[@class='socials__link socials__link--twitter'])[2]")).scrollIntoView(true).shouldBe(Condition.enabled).click();
    }
    public void examinationTestLink(){
        Assert.assertTrue($(By.xpath("(//div[@class='css-1dbjc4n r-1habvwh']//child::a)[1]")).is(Condition.visible));
        System.out.println("true");
    }
}
