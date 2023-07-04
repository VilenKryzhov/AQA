package TestUitestingplayground.MouseOverClick;

import com.codeborne.selenide.Selenide;
import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseOverClickTest extends BaseTestUiPlayground {
    @Test
    public void test(){
        GeneratorMethodUIPlayground.mouseClickOver().clickToMousePage();
        GeneratorMethodUIPlayground.mouseClickOver().doubleClick();
        String elementInfo = GeneratorMethodUIPlayground.mouseClickOver().getElementInfo();
        Assert.assertEquals("2", elementInfo);
        Selenide.sleep(2000);
    }
}
