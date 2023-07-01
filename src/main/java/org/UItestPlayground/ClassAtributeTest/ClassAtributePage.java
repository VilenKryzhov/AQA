package org.UItestPlayground.ClassAtributeTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Selenide.$;

public class ClassAtributePage extends PageTools {
    private final By primaryButton = By.xpath("(//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')])[1]") ;

    public void clickPrimaryButtonTest(By by, String text){
        click(by, text);
        click(primaryButton);
        Selenide.actions().sendKeys(Keys.ENTER);
        Selenide.sleep(2000);
        $(By.xpath("(//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')])[1]")).shouldBe(Condition.enabled);
        Selenide.refresh();

    }

}
