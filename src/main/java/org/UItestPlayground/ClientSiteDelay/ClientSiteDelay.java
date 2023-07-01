package org.UItestPlayground.ClientSiteDelay;

import com.codeborne.selenide.*;

import org.base.PageTools;
import org.openqa.selenium.By;
import org.testng.Assert;




public class ClientSiteDelay extends PageTools {
    By btn = By.xpath("//button[@class='btn btn-primary']");

    By textItem = By.xpath("//p[@class='bg-success']");
    public void waitMethodAnalises(By by, String text){
        click(by, text);
        shouldBe(Condition.visible, btn).click();
        Configuration.timeout = 20000;
//        should(Condition.disappear, textItem, 15);
        SelenideElement elementItem = getElement(textItem);
        String textActual = elementItem.text();
        System.out.println(textActual);
        Assert.assertEquals("Data calculated on the client side.", textActual);
        Configuration.timeout = 15000;


    }
}
