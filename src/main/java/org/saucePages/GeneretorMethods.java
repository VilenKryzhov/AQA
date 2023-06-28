package org.saucePages;

import org.saucePages.basketPage.BasketPage;
import org.sauceItems.DetailsItem;
import org.saucePages.loginPage.LogInTest;
import org.saucePages.mainPage.MainPage;

public class GeneretorMethods {
    private static LogInTest logInTest;
    private static DetailsItem detailsItem;
    private static MainPage mainPage;
    private static BasketPage basketPage;
    public static LogInTest logInTest(){
        if(logInTest == null){
            logInTest = new LogInTest();
        }
        return logInTest;
    }
    public static MainPage mainPage(){
        if(mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }
    public static DetailsItem detailsItem(){
        if(detailsItem == null){
            detailsItem = new DetailsItem();
        }
        return detailsItem;
    }
    public static BasketPage basketPage(){
        if(basketPage == null){
            basketPage = new BasketPage();
        }
        return basketPage;
    }
}
