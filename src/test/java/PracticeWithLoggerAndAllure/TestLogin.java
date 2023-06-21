package PracticeWithLoggerAndAllure;

import org.base.BaseTest;
import org.pages.GeneretorMethods;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @Test
    public void test(){
        GeneretorMethods.logInTest().typeLoginInput("standard_user");
        GeneretorMethods.logInTest().typePasswordInput("secret_sauce");
        GeneretorMethods.logInTest().clickEnterButton();
    }
}
