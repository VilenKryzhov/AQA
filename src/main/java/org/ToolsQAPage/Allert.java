package org.ToolsQAPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Allert extends PageTools {
    public void clickOnAlertButton (By alertButton){
        shouldBe(Condition.enabled, alertButton).click();
    }
    public void checkAllertOpen(){
        Selenide.actions().sendKeys(Keys.ENTER);
    }
    public String getButtonText(By by){
        return getElementText(by);
    }
}
