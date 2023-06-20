package org.base;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class PageTools extends CustomLogger{

    private static String getPreviousMethodNameAsText(){
        String methodName = Thread.currentThread().getStackTrace()[3].getMethodName();
        String replacedName = methodName.replaceAll(String.format("%s|%s|%s",
                        "(?<=[A-Z])(?=[A-Z][a-z])",
                        "(?<=[^A-Z])(?=[A-Z])",
                        "(?<=[A-Za-z])(?=[^A-Za-z])"
                ),
                " ");
        return replacedName.substring(0,1).toUpperCase() + replacedName.substring(1).toLowerCase();
    }

    public By byLocator (By by , Object... args){
        return LocatorParser.parseLocator(by,args);
    }
    protected SelenideElement shouldBe(Condition condition, By by , Object... args){
        return $(byLocator(by,args)).shouldBe(condition);
    }
    protected ElementsCollection shouldBe(CollectionCondition condition, By by , Object... args){
        return $$(byLocator(by,args)).shouldBe(condition);
    }
    protected void type(String text, By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        shouldBe(Condition.visible, by , args).append(text);
    }
    protected void click(By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        shouldBe(Condition.enabled, by, args).click();
    }
    protected void waitUntilElementVisibility(By by,  Integer time, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', should be visible in -> " + time + " seconds " + byLocator(by,args));
        $(byLocator(by,args)).waitUntil(Condition.visible, time);
    }
    protected void waitUntilElementInvisibility(By by,  Integer time, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', should be invisible in -> " + time + " seconds " + byLocator(by,args));
        $(byLocator(by,args)).waitUntil(Condition.hidden, time);
    }
    public String getElementText(By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(Condition.visible, by, args).text();
    }
    public List<String> getElementsText(By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', elements -> " + byLocator(by,args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1), by, args).texts();
    }
    public List<SelenideElement> getElements(By by, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', elements -> " + byLocator(by,args));
        return shouldBe(CollectionCondition.sizeGreaterThan(-1), by, args);
    }
    public SelenideElement getElement(By by, Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element -> " + byLocator(by,args));
        return shouldBe(Condition.visible, by, args);
    }
    protected void clickEnterButton (){
        Selenide.actions().sendKeys(Keys.ENTER).perform();
    }
    public boolean isElementExist (By by , Object... args){
        logInfo(getPreviousMethodNameAsText() + " ', element exists -> " + byLocator(by,args));
        return $(byLocator(by,args)).is(Condition.visible);
    }
}