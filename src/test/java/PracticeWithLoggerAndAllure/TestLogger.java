package PracticeWithLoggerAndAllure;

import org.base.BaseTest;
import org.openqa.selenium.By;
import org.pages.GeneretorMethods;
import org.item.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class TestLogger extends BaseTest {
    @Test
    public void test(){
        GeneretorMethods.logInTest().typeLoginInput("standard_user");
        GeneretorMethods.logInTest().typePasswordInput("secret_sauce");
        GeneretorMethods.logInTest().clickEnterButton();
        System.out.println("asd");
        List<Item> items = GeneretorMethods.mainPage().getItems();
        System.out.println(items);
        List<String> itemsNameMainPageList = GeneretorMethods.mainPage().getElementsListName();


        GeneretorMethods.mainPage().elementList().get(3).click();
        Item detailsItem = GeneretorMethods.detailsItem().getDetailsItem();
        System.out.println(detailsItem);
        Assert.assertTrue(items.contains(detailsItem));
        $(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']")).click();
        GeneretorMethods.mainPage().clickMainPageItemButton();
        GeneretorMethods.mainPage().clickToBasket();
        List<String> itemNameBasketList = GeneretorMethods.basketPage().getItemNameInBasketPage();
        Assert.assertEquals(itemNameBasketList,itemsNameMainPageList);


    }
}
