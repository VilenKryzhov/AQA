package TestUitestingplayground.ProgressBarTest;

import com.codeborne.selenide.Condition;
import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class ProgressBarTest extends BaseTestUiPlayground {
    public final By progressBarXpath = By.xpath("//a[text()='%s']");
    public final By startButtonXpath = By.xpath("//button[@id='startButton']");
    public final By stopButtonXpath = By.xpath("//button[@id='stopButton']");
    @Test
    public void test(){
        GeneratorMethodUIPlayground.progressBar().clickToProgressBarPage(progressBarXpath, "Progress Bar");
        GeneratorMethodUIPlayground.progressBar().clickToStart(startButtonXpath);
        GeneratorMethodUIPlayground.progressBar().сlickToStop(stopButtonXpath);
    }
}
