package org.pages.basketPage;

import org.base.PageTools;
import org.openqa.selenium.By;

import java.util.List;

public class BasketPage extends PageTools {
    private final By  basketPageItemName = By.xpath("//div[@class='inventory_item_name']");
    public List<String > getItemNameInBasketPage(){
       return getElementsText(basketPageItemName);
    }
}
