package org.YouTubePages.MainPage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.base.PageTools;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class MainPageYouTube extends PageTools {

    private final By elementsItemNameChannel = By.xpath("//div[@class='style-scope ytd-channel-name']");
    private final By filterButton = By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[11]");
    private final By filterButtonItemThisDay = By.xpath("(//a[@id='endpoint' and @class='yt-simple-endpoint style-scope ytd-search-filter-renderer'])[1]");
    private final By elementDetailItemName = By.xpath("//a[@id='video-title']");


    public List<SelenideElement> listElementItem(){
        return getElements(elementsItemNameChannel);
    }
    public List<SelenideElement> detailListElementItem(){
        return getElements(elementDetailItemName);
    }




    public void appendTextToSearchButton(String text){
        $(By.xpath("//input[@id='search']")).shouldBe(Condition.visible).append(text);
        clickEnterButton();
    }

    public void clickFilterButtonAndChooseFilter(){
        click(filterButton);
        click(filterButtonItemThisDay);

    }





}
