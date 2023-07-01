package org.UItestPlayground.ScrollbarPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ScrollbarPage extends PageTools {
    public void clickToScrollbarPage(){
        $(By.xpath("//a[text()='Scrollbars']")).click();
    }
    public void scrollIntoView(){
        $(By.xpath("//button[@class='btn btn-primary']")).scrollIntoView(true);
    }

}
