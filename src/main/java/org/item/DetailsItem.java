package org.item;

import org.openqa.selenium.By;

public class DetailsItem extends Item{
    private final By detailsItemName = By.xpath("//div[@class='inventory_details_name large_size']");
    private final By detailsItemInfo = By.xpath("//div[@class='inventory_details_desc large_size']");
    private final By detailsItemPrice = By.xpath("//div[@class='inventory_details_price']");

    public Item getDetailsItem(){
        Item item = new Item();
        item.setItemName(getElementText(detailsItemName));
        item.setItemInfo(getElementText(detailsItemInfo));
        item.setItemPrice(getElementText(detailsItemPrice));
        return item;
    }
}
