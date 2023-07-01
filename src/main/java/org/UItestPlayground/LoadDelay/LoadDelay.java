package org.UItestPlayground.LoadDelay;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

public class LoadDelay extends PageTools {
    By clickButton = By.xpath("//button[@class='btn btn-primary']");
    public void loadDelayClickAndReviewTimeWait(By by, String text){
        click(by, text);
        waitUntilElementVisibility(clickButton, 4000);
        shouldBe(Condition.enabled, clickButton);


    }
}
