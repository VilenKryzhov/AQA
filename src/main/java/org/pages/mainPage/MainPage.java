package org.pages.mainPage;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;
import org.item.Item;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends PageTools {
    private final By mainPageItemName = By.xpath("//div[@class='inventory_item_name']");
    private final By mainPageItemInfo = By.xpath("//div[@class='inventory_item_desc']");
    private final By mainPageItemPrice = By.xpath("//div[@class='inventory_item_price']");
    private final By mainPageItemButton = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
    private final By mainPageItemBasket = By.xpath("//a[@class='shopping_cart_link']");


    public List<SelenideElement> elementList(){
        return getElements(mainPageItemName);
    }
    public List<String> getElementsListName(){
        return getElementsText(mainPageItemName);
    }
    public List<SelenideElement> buttonList(){
        return getElements(mainPageItemButton);
    }


    public void clickMainPageItemButton(){
        while (buttonList().listIterator().hasNext()){
            click(mainPageItemButton);
            Selenide.sleep(500);
        }
    }
    public void clickToBasket(){
        click(mainPageItemBasket);
    }



    public List<Item> getItems(){
        List<Item> itemList = new ArrayList<>();
        List<String> nameItemList = getElementsText(mainPageItemName);
        List<String> infoItemList = getElementsText(mainPageItemInfo);
        List<String> priceItemList = getElementsText(mainPageItemPrice);
        for (int i = 0; i < nameItemList.size(); i++) {
             Item item = new Item();
             item.setItemName(nameItemList.get(i));
             item.setItemInfo(infoItemList.get(i));
             item.setItemPrice(priceItemList.get(i));
             itemList.add(item);


        }
        return itemList;
    }

}
