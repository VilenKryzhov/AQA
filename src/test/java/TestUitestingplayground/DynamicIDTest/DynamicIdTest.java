package TestUitestingplayground.DynamicIDTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DynamicIdTest extends BaseTestUiPlayground {
    By clickToSomeItem = By.xpath("//a[text()='%s']");
    @Test
    public void test(){
        GeneratorMethodUIPlayground.dynamicID().equalsButtonID(clickToSomeItem, "Dynamic ID");
    }
}
