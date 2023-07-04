package TestUitestingplayground.DynamicTableTest;

import groovyjarjarantlr4.v4.runtime.tree.Tree;
import org.UItestPlayground.BaseTestUiPlayground;
import org.UItestPlayground.GeneratorMethodUIPlayground.GeneratorMethodUIPlayground;


import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.*;


public class DynamicTableTest extends BaseTestUiPlayground {

    @Test
    public void test() {

        GeneratorMethodUIPlayground.dynamicTable().clickToDynamicTablePage();
        List<String> elementsTableText = GeneratorMethodUIPlayground.dynamicTable().getElementsTableText();
        String elementYellowTableText = GeneratorMethodUIPlayground.dynamicTable().getElementYellowTableText();
        for (String s : elementsTableText) {
            if (s.contains(elementYellowTableText)) {
                String item;
                item = s;
                Assert.assertTrue(item.contains(elementYellowTableText));
            }
        }

    }
}
