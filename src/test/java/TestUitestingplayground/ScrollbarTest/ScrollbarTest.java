package TestUitestingplayground.ScrollbarTest;
import com.codeborne.selenide.Condition;
import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.$;


public class ScrollbarTest extends BaseTestUiPlayground {
    By btn = By.xpath("//button[@class='btn btn-primary']");

    @Test
    public void test() {
        GeneratorMethodUIPlayground.scrollbarPage().clickToScrollbarPage();
        GeneratorMethodUIPlayground.scrollbarPage().scrollIntoView();
        $(By.xpath("//button[@class='btn btn-primary']")).shouldBe(Condition.visible);
    }
}
