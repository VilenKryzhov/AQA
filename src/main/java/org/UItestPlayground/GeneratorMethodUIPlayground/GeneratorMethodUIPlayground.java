package org.UItestPlayground.GeneratorMethodUIPlayground;

import org.UItestPlayground.ClassAtributeTest.ClassAtributePage;
import org.UItestPlayground.ClientSiteDelay.ClientSiteDelay;
import org.UItestPlayground.DynamicID.DynamicID;
import org.UItestPlayground.LoadDelay.LoadDelay;
import org.UItestPlayground.ScrollbarPage.ScrollbarPage;
import org.UItestPlayground.TextInput.TextInputPage;

public class GeneratorMethodUIPlayground {
    private static DynamicID dynamicID;
    private static ClassAtributePage classAtributeTest;
    private static LoadDelay loadDelay;
    private static ClientSiteDelay clientSiteDelay;
    private static TextInputPage textInputPage;
    private static ScrollbarPage scrollbarPage;


    public static DynamicID dynamicID() {
        if (dynamicID == null) {
            dynamicID = new DynamicID();
        }
        return dynamicID;
    }

    public static ClassAtributePage classAtributeTest() {
        if (classAtributeTest == null) {
            classAtributeTest = new ClassAtributePage();
        }
        return classAtributeTest;
    }

    public static LoadDelay loadDelayTest() {
        if (loadDelay == null) {
            loadDelay = new LoadDelay();
        }
        return loadDelay;
    }

    public static ClientSiteDelay clientSiteDelay() {
        if (clientSiteDelay == null) {
            clientSiteDelay = new ClientSiteDelay();
        }
        return clientSiteDelay;
    }
    public static TextInputPage textInputPage() {
        if (textInputPage == null) {
            textInputPage = new TextInputPage();
        }
        return textInputPage;
    }
    public static ScrollbarPage scrollbarPage() {
        if (scrollbarPage == null) {
            scrollbarPage = new ScrollbarPage();
        }
        return scrollbarPage;
    }
}
