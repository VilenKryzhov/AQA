package TestUitestingplayground.textInputTest;

import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextInputTest extends BaseTestUiPlayground {
        By textInput = By.xpath("//a[text()='Text Input']");
    @Test
    public void tets(){
        GeneratorMethodUIPlayground.textInputPage().clickToTextInputPage(textInput);
        String buttonText1 = GeneratorMethodUIPlayground.textInputPage().getButtonText1();
        GeneratorMethodUIPlayground.textInputPage().appendTextToInput("New name button");
        GeneratorMethodUIPlayground.textInputPage().clickButton();
        String buttonText2 = GeneratorMethodUIPlayground.textInputPage().getButtonText2();
        Assert.assertNotEquals(buttonText1,buttonText2);


    }
}
