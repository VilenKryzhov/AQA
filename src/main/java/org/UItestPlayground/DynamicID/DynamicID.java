package org.UItestPlayground.DynamicID;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;
import org.testng.Assert;



public class DynamicID extends PageTools {

    public void equalsButtonID(By by, String text) {
        click(by, text);
        SelenideElement element1 = getElement(By.xpath("//button[@class='btn btn-primary']"));
        String id1 = element1.getId();
        System.out.println(id1);
        Selenide.sleep(1000);
        Selenide.refresh();
        SelenideElement element2 = getElement(By.xpath("//button[@class='btn btn-primary']"));
        String id2 = element2.getId();
        Assert.assertNotEquals(id1, id2);

    }


}
