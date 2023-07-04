package org.UItestPlayground.MouseClickOver;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

public class MouseClickOver extends PageTools {
    By mousePageXpath = By.xpath("//a[text()='Mouse Over']");
    By clickXpath = By.xpath("//a[@class='text-primary']");
    By getElementText = By.xpath("//span[@id='clickCount']");


    public void clickToMousePage(){
        click(mousePageXpath);
    }
    public String getElementInfo(){
       return getElementText(getElementText);
    }
    public void doubleClick(){
        shouldBe(Condition.enabled, clickXpath).doubleClick();
    }
}
