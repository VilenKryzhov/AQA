package RozetkaTest;

import com.codeborne.selenide.Selenide;
import org.RozetkaTestWebSite.BaseTest1;
import org.RozetkaTestWebSite.MethodGenerator;
import org.testng.annotations.Test;

public class TestLinkRozetka extends BaseTest1 {
    @Test
    public void testLink(){
        MethodGenerator.testLink().clickMenu();
        MethodGenerator.testLink().clickToLink();
        Selenide.switchTo().window(1);
        MethodGenerator.testLink().examinationTestLink();
        Selenide.closeWindow();
        Selenide.switchTo().window(0);
    }
}
