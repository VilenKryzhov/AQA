package RozetkaWebsiteTest;

import org.RozetkaTestWebSite.BaseTest1;
import org.RozetkaTestWebSite.MethodGenerator;

public class TestCatalogRozetka extends BaseTest1 {
//    @Test
    public void catalogTest(){
        MethodGenerator.catalogTest().catalogClick();
        MethodGenerator.catalogTest().testBuyFunction();
    }
}
