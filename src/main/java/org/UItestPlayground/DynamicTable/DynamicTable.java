package org.UItestPlayground.DynamicTable;

import org.base.PageTools;
import org.openqa.selenium.By;

import java.util.List;

public class DynamicTable extends PageTools {
    By page = By.xpath("//a[text()='Dynamic Table']") ;
    By tableInfo = By.xpath("//span[text()='Chrome']//following-sibling::span");
    By yellowTableInfo = By.xpath("//p[@class='bg-warning']");

    public void clickToDynamicTablePage(){
        click(page);
    }
    public List<String> getElementsTableText(){
        return getElementsText(tableInfo);
    }
    public String getElementYellowTableText(){
       return getElementText(yellowTableInfo);

    }
}
