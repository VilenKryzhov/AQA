package org.UItestPlayground.ProgressBar;

import com.codeborne.selenide.Condition;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class ProgressBar extends PageTools {
    String num = "75%";
    public final By idSum = By.xpath("//div[@id='progressBar']");

    public final By progressBar = By.xpath("//*[@aria-valuenow=75]");


    public void clickToProgressBarPage(By by, String text) {
        click(by, text);
    }

    public void clickToStart(By startButton) {
        click(startButton);
    }
    public void сlickToStop(By by){
        shouldBe(Condition.visible, progressBar);
        click(by);

    }


}




