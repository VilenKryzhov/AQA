package org.ToolsQAPage;


import com.codeborne.selenide.Selenide;
import org.base.PageTools;
import org.openqa.selenium.By;

public class clickToExercise extends PageTools {


    public void clickOnExercise(By byOne, By byTwo) {
        click(byOne);
        Selenide.sleep(1000);
        click(byTwo);
        Selenide.sleep(1000);
    }
}
