package org.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestYoutube {
    @BeforeClass(alwaysRun = true, description = "create config for our test")// незалежно від того чи впав тест чи ні,  буде виконуватись анотація
    public void selenideConfig() {
        Configuration.holdBrowserOpen = true; // залишає вікно відкритим, а не закриває після тестування
        Configuration.startMaximized = true;  // розширення на весь екран
        //Configuration.browserSize = "1920x1080"; // конкретне розширення браузеру
        Configuration.headless = false; //тестування будуть проходити без візуалізації UI
        Configuration.screenshots = true; // на помилцы робиться скріншот і закидуєтсья автом. в папку білд
        Configuration.pageLoadStrategy = "normal"; // з яким темпом буде робитись тестування, eagle - швидко, але затрантно для навантаження
        Configuration.pageLoadTimeout = 20000; // cкільки часу буде прогружатись сторінка
        Configuration.timeout = 10000; //cкільки часу буде чекати селенід щоб знайти елемент на сторінці
        Configuration.reportsFolder = "screenshots"; //  буде створювати скріншоти помилок в конкретній папці
    }

    @BeforeMethod(alwaysRun = true, description = "open basic URL")
    public void setUp() {
        Selenide.open("https://www.youtube.com/");
    }


    @AfterMethod(alwaysRun = true, description = "WebDriver clean up")
    public void cleanWebDriver() {
        Selenide.clearBrowserCookies();// очищуэ кукі що не зберігати непотрібну інфу
//            Selenide.refresh(); // оновляє сторінку
//        Selenide.open("about:blank"); // відкриває нову сторінку
    }

    @AfterSuite(alwaysRun = true, description = "Closing browser")
    public void tearDown() {
        Selenide.closeWebDriver(); //закриває вебдрайвер
    }
}
