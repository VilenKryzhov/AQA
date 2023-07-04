package TestUitestingplayground.OverlappedElementTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.testng.annotations.Test;

public class OverlappedElementText extends BaseTestUiPlayground {
    @Test
    public void test(){
        GeneratorMethodUIPlayground.overlappedElement().clickToOverlapperElementPage();
        GeneratorMethodUIPlayground.overlappedElement().putIdInInput("1");
        GeneratorMethodUIPlayground.overlappedElement().putTextInInput("New text");
    }
}
