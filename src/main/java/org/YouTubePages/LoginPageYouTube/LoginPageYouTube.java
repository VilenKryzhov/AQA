package org.YouTubePages.LoginPageYouTube;

import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageYouTube extends PageTools {
    private final By registerButton = By.xpath("(//div[@class='yt-spec-touch-feedback-shape yt-spec-touch-feedback-shape--touch-response'])[4]");

    public void clickToRegisterButton(){
        click(registerButton);
    }
    public void setEmailInRegisterInput(String email){
        $(By.xpath("//input[@type='email']")).append(email);
        clickEnterButton();
    }
    public void setPasswordInRegisterInput(String pass){
        $(By.xpath("//input[@type='password']")).append(pass);
        clickEnterButton();
    }
}
