package RozetkaTest;

import org.RozetkaTestWebSite.BaseTest1;
import org.RozetkaTestWebSite.MethodGenerator;
import org.testng.annotations.Test;

public class TestWorkRozetka extends BaseTest1 {
    @Test
    public void testWorkRozetka(){
        MethodGenerator.openMenuTest().OpenMenuClick();
        MethodGenerator.openMenuTest().MyProfile();
        MethodGenerator.openMenuTest().MyPersonalInfo();
        MethodGenerator.openMenuTest().OrderRecipients();
        MethodGenerator.openMenuTest().Contacts();
    }
}
