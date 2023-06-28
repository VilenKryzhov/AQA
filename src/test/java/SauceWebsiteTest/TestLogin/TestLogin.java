package SauceWebsiteTest.TestLogin;

import org.base.BaseTest;
import org.junit.runner.Description;
import org.saucePages.GeneretorMethods;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {
    @Test(description = "[AQA-2]: Login Test")
    public void test(){
        GeneretorMethods.logInTest().typeLoginInput("standard_user");
        GeneretorMethods.logInTest().typePasswordInput("secret_sauce");
        GeneretorMethods.logInTest().clickEnterButton();
    }
}
