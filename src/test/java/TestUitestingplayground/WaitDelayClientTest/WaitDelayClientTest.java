package TestUitestingplayground.WaitDelayClientTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WaitDelayClientTest extends BaseTestUiPlayground {
    By item = By.xpath("//a[text()='%s']");
    @Test
    public void test(){
        GeneratorMethodUIPlayground.clientSiteDelay().waitMethodAnalises(item, "Client Side Delay");
    }
}
