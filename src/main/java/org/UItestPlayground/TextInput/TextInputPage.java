package org.UItestPlayground.TextInput;

import org.base.PageTools;
import org.openqa.selenium.By;

public class TextInputPage extends PageTools {
    By buttonText = By.xpath("//button[@class='btn btn-primary']");
    By input = By.xpath("//input[@class='form-control']");
    public void clickToTextInputPage(By by){
        click(by);
    }

    public String getButtonText1(){
         String text1 = getElementText(buttonText);
         return text1;
    }
    public void appendTextToInput(String text){
    append(input, text);
    }
    public void clickButton(){
        click(buttonText);
    }
    public String getButtonText2(){
        String text2 = getElementText(buttonText);
        return text2;
    }

}
