package TestUitestingplayground.ClassAtributeTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClassAttributeTest extends BaseTestUiPlayground {
    By item = By.xpath("//a[text()='%s']");
    @Test
    public void test(){
        GeneratorMethodUIPlayground.classAtributeTest().clickPrimaryButtonTest(item, "Class Attribute");

    }
}
