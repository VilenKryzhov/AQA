package org.RozetkaTestWebSite;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterTest {
    public void clickToRegister(){
        $(By.xpath("(//button[@class='header__button ng-star-inserted'])[1]")).shouldBe(Condition.enabled).click();
    }
    public void loginTest(String log){
        $(By.xpath("//input[@type='email']")).shouldBe(Condition.visible).append(log);
    }
    public void passwordTest(String pass){
        $(By.xpath("//input[@id='auth_pass']")).shouldBe(Condition.visible).append(pass);
        $(By.xpath("//button[@class='button button--large button--green auth-modal__submit ng-star-inserted']")).shouldBe(Condition.enabled).click();
    }
}
