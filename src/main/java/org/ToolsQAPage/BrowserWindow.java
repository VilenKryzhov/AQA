package org.ToolsQAPage;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

public class BrowserWindow extends PageTools {
    public void clickToNewWindow(By tab){
        shouldBe(Condition.enabled, tab).click();
    }
    public void clickToNewWindowMessege(By tab){
        shouldBe(Condition.text("New Window Message"), tab).click();
    }
    public String getElementTextFromTabWindow(By windowText){
        return getElementText(windowText);
    }
}
