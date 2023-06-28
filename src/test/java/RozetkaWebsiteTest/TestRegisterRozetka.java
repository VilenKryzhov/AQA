package RozetkaWebsiteTest;

import org.base.BaseTest;
import org.RozetkaTestWebSite.MethodGenerator;

public class TestRegisterRozetka extends BaseTest {
//    @Test
    public void testBrowser(){
        MethodGenerator.registerTest().clickToRegister();
        MethodGenerator.registerTest().loginTest("krijov.vilen@gmail.com");
        MethodGenerator.registerTest().passwordTest("Rose0969019229");
    }
}
