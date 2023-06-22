package YouTubeTest;

import com.codeborne.selenide.SelenideElement;
import org.YouTubePages.GeneratorMethodsYouTube;
import org.base.BaseTestYoutube;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class TestYouTube extends BaseTestYoutube {
    @Test
    public void test(){
        GeneratorMethodsYouTube.mainPageYouTube().appendTextToSearchButton("Срач");
        List<SelenideElement> elementsText = GeneratorMethodsYouTube.mainPageYouTube().listElementItem();
        GeneratorMethodsYouTube.mainPageYouTube().clickFilterButtonAndChooseFilter();
        List<SelenideElement> strings = GeneratorMethodsYouTube.mainPageYouTube().detailListElementItem();
        String stringsElements = elementsText.toString();
        String stringsDetailsElements = strings.toString();
        Assert.assertFalse(stringsDetailsElements.contains(stringsElements));
    }
}
