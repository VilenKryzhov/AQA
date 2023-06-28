package org.saucePages.loginPage;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogInTest extends PageTools {
    private final By enter = By.xpath("//input[@class='submit-button btn_action']");

    public void typeLoginInput(String login){
        $(By.xpath("(//input[@class='input_error form_input'])[1]")).shouldBe(Condition.visible).append(login);
    }
    public void typePasswordInput(String pass){
        $(By.xpath("(//input[@class='input_error form_input'])[2]")).shouldBe(Condition.visible).append(pass);
    }
    public void clickEnterButton(){
        click(enter);
    }





}
