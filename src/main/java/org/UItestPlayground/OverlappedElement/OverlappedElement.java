package org.UItestPlayground.OverlappedElement;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OverlappedElement extends PageTools {
    By page = By.xpath("//a[text()='Overlapped Element']");
    By idInput = By.xpath("//input[@id='id']");
    By nameInput = By.xpath("//input[@id='name']");
    public void clickToOverlapperElementPage(){
        click(page);
    }
    public void putIdInInput(String num){
        shouldBe(Condition.visible, idInput).append(num);
    }
    public void putTextInInput(String text){
        $(By.xpath("//input[@id='name']")).scrollIntoView(true);
        Selenide.sleep(2000);
        shouldBe(Condition.visible, nameInput).append(text);
    }
}
