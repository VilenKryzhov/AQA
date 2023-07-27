package ToolsQATest.Widgets;
import com.codeborne.selenide.*;
import org.ToolsQAPage.BaseTestToolsQA;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class SelectMenuTest extends BaseTestToolsQA {
    @Test
    public void test() {

        List<String> selecetList2 = new ArrayList<>();
        selecetList2.add(0, "Group 1, option 2");
        selecetList2.add(1, "Group 2, option 1");
        selecetList2.add(2, "Group 2, option 2");
        selecetList2.add(3, "A root option");
        selecetList2.add(4, "Another root option");

        List<String> colorList = new ArrayList<>();
        colorList.add(0, "Red");
        colorList.add(1, "Blue");
        colorList.add(2, "Green");
        colorList.add(3, "Yellow");
        colorList.add(4, "Purple");
        colorList.add(5, "Black");
        colorList.add(6, "White");
        colorList.add(7, "Voilet");
        colorList.add(8, "Indigo");
        colorList.add(9, "Magenta");
        colorList.add(10, "Aqua");

        $(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
        $(By.xpath("(//li[@id='item-8'])[2]")).scrollIntoView(true).click();

        $(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).shouldBe(Condition.enabled).click();
        Selenide.sleep(2000);
        $$(By.xpath("//div[@class=' css-yt9ioa-option']")).shouldBe(CollectionCondition.exactTexts(selecetList2));
        $(By.xpath("//div[@class=' css-1n7v3ny-option']")).shouldBe(Condition.visible).click();
        Assert.assertEquals($(By.xpath("//div[@class=' css-1uccc91-singleValue']")).text(), "Group 1, option 1");

        for (int i = 0; i < 11; i++) {
            $(By.xpath("//select[@id='oldSelectMenu']")).selectOption(i);
            Selenide.sleep(500);
            System.out.println("Old style select menu color --> " + $(By.xpath("//select[@id='oldSelectMenu']")).text());
            Assert.assertEquals(colorList.get(i), $(By.xpath("//select[@id='oldSelectMenu']")).text());
        }

        $(By.xpath("(//div[@class=' css-1hwfws3'])[3]")).click();
        Selenide.sleep(1000);
        $$(By.xpath("//div[@class=' css-yt9ioa-option']")).shouldHave(CollectionCondition.size(3));
        System.out.println("Multiselect drop down color --> " + $$(By.xpath("//div[@class=' css-yt9ioa-option']")).texts());
        Assert.assertEquals($(By.xpath("//div[@class=' css-1n7v3ny-option']")).text(), "Green");


        List<String> lastSelectText = $$(By.xpath("//select[@id='cars']//option")).shouldHave(CollectionCondition.size(4)).texts();
        System.out.println("Last select text" + lastSelectText);


    }
}
