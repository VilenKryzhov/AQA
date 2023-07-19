package org.ToolsQAPage;

import org.base.PageTools;
import org.openqa.selenium.By;

public class ModalDialogs extends PageTools {
    public void clickOpenToSmallModal(By by){
        click(by);
    }
    public String getSmallModalText(By by){
        return getElementText(by);
    }

    public void clickCloseToModal(By by){
        click(by);
    }
}
