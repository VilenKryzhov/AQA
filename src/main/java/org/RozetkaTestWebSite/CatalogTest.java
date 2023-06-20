package org.RozetkaTestWebSite;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CatalogTest {
    public void catalogClick(){
        $(By.xpath("//button[@id='fat-menu']")).shouldBe(Condition.enabled).click();
    }
    public void testBuyFunction(){
        $(By.xpath("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']")).shouldBe(Condition.enabled).click();
        Selenide.sleep(2000);
        $(By.xpath("(//a[@class='tile-cats__heading ng-star-inserted'])[3]")).shouldBe(Condition.exist).click();
        Selenide.sleep(2000);
        $(By.xpath("(//button[@class='buy-button goods-tile__buy-button ng-star-inserted'])[1]")).shouldBe(Condition.visible).click();
        Selenide.sleep(2000);
        $(By.xpath("(//button[@class='buy-button goods-tile__buy-button ng-star-inserted'])[4]")).shouldBe(Condition.exist).click();
        Selenide.sleep(2000);
        $(By.xpath("//button[@class='header__button ng-star-inserted header__button--active']")).shouldBe(Condition.visible).click();
        Selenide.sleep(3000);


    }
}
