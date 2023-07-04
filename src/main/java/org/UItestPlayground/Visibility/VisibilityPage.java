package org.UItestPlayground.Visibility;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

public class VisibilityPage extends PageTools {
    By visibilityPage = By.xpath("//a[text()='Visibility']");
    By blueBtn = By.xpath("//button[@class='btn btn-primary']");
    By redBtn = By.xpath("//button[@class='btn btn-danger']");
    By yellowBtn = By.xpath("//button[@class='btn btn-warning']");
    By greenBtn = By.xpath("//button[@class='btn btn-success']");
    public void clickToVisibilityPage(){
        click(visibilityPage);
    }
    public void clickBlueBtn(){
        click(blueBtn);
    }
    public void checkButtonOnCondition(){
        shouldBe(Condition.enabled, blueBtn);
        shouldBe(Condition.hidden, redBtn);
        shouldBe(Condition.hidden, yellowBtn);
        shouldBe(Condition.visible, greenBtn);
    }

}
