package org.UItestPlayground;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestUiPlayground {
    @BeforeClass(alwaysRun = true, description = "create config for our test")// незалежно від того чи впав тест чи ні,  буде виконуватись анотація
    public void selenideConfig() {
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
        //Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.screenshots = true;
        Configuration.pageLoadStrategy = "normal";
        Configuration.pageLoadTimeout = 20000;
        Configuration.timeout = 15000;
        Configuration.reportsFolder = "screenshots";
    }

    @BeforeMethod(alwaysRun = true, description = "open basic URL")
    public void setUp() {
        Selenide.open("http://uitestingplayground.com/");
    }


    @AfterMethod(alwaysRun = true, description = "WebDriver clean up")
    public void cleanWebDriver() {
        Selenide.clearBrowserCookies();
            Selenide.refresh();
        Selenide.open("about:blank");

    }

    @AfterSuite(alwaysRun = true, description = "Closing browser")
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}


