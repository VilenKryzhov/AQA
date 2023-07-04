package TestUitestingplayground.VisibletTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.testng.annotations.Test;

public class VisibilityTest extends BaseTestUiPlayground {
    @Test
    public void test(){
        GeneratorMethodUIPlayground.visibilityPage().clickToVisibilityPage();
        GeneratorMethodUIPlayground.visibilityPage().clickBlueBtn();
        GeneratorMethodUIPlayground.visibilityPage().checkButtonOnCondition();
    }
}
