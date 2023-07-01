package TestUitestingplayground.loadDelayTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loadDelayTest extends BaseTestUiPlayground {
    By item = By.xpath("//a[text()='%s']");
    @Test
    public void test(){
        GeneratorMethodUIPlayground.loadDelayTest().loadDelayClickAndReviewTimeWait(item, "Load Delay");
    }
}
