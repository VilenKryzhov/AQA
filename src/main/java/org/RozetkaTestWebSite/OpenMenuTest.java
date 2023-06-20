package org.RozetkaTestWebSite;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OpenMenuTest {
    public void OpenMenuClick(){
        $(By.xpath("//button[@class='header__button ng-tns-c37-1']")).shouldBe(Condition.enabled).click();
    }
    public void MyProfile(){
        $(By.xpath("//a[@class='side-menu__auth-wrap side-menu__auth-wrap--link ng-tns-c37-1 ng-star-inserted']")).shouldBe(Condition.enabled).click();
    }
    public void MyPersonalInfo(){
        $(By.xpath("(//details[@class='personal-section'])[1]")).shouldBe(Condition.enabled).click();
        $(By.xpath("(//button[@class='button button--medium button--green personal-data__edit'])[1]")).shouldBe(Condition.enabled).click();
    }
     public void OrderRecipients(){
        $(By.xpath("(//details[@class='personal-section'])[2]")).shouldBe(Condition.enabled).click();
        $(By.xpath("(//button[@class='button button--medium button--green personal-data__edit'])[2]")).shouldBe(Condition.enabled).click();
        $(By.xpath("//button[@class='button button--medium button--link button--with-icon recipient__add-button ng-star-inserted']")).shouldBe(Condition.enabled).click();

     }
     public void Contacts(){
        $(By.xpath("(//details[@class='personal-section'])[3]")).shouldBe(Condition.enabled).click();
        $(By.xpath("(//button[@class='button button--medium button--green personal-data__edit'])[3]")).shouldBe(Condition.enabled).click();
     }
}
