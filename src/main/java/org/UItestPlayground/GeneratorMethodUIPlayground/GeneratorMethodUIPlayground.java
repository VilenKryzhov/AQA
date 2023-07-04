package org.UItestPlayground.GeneratorMethodUIPlayground;

import org.UItestPlayground.ClassAtributeTest.ClassAtributePage;
import org.UItestPlayground.ClientSiteDelay.ClientSiteDelay;
import org.UItestPlayground.DynamicID.DynamicID;
import org.UItestPlayground.DynamicTable.DynamicTable;
import org.UItestPlayground.LoadDelay.LoadDelay;
import org.UItestPlayground.MouseClickOver.MouseClickOver;
import org.UItestPlayground.OverlappedElement.OverlappedElement;
import org.UItestPlayground.ProgressBar.ProgressBar;
import org.UItestPlayground.ScrollbarPage.ScrollbarPage;
import org.UItestPlayground.TextInput.TextInputPage;
import org.UItestPlayground.Visibility.VisibilityPage;

public class GeneratorMethodUIPlayground {
    private static DynamicID dynamicID;
    private static ClassAtributePage classAtributeTest;
    private static LoadDelay loadDelay;
    private static ClientSiteDelay clientSiteDelay;
    private static TextInputPage textInputPage;
    private static ScrollbarPage scrollbarPage;
    private static DynamicTable dynamicTable;
    private static ProgressBar progressBar;
    private static VisibilityPage visibilityPage;
    private static MouseClickOver mouseClickOver;
    private static OverlappedElement overlappedElement;


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
    public static DynamicTable dynamicTable() {
        if (dynamicTable == null) {
            dynamicTable = new DynamicTable();
        }
        return dynamicTable;
    }
    public static ProgressBar progressBar() {
        if (progressBar == null) {
            progressBar = new ProgressBar();
        }
        return progressBar;
    }
    public static VisibilityPage visibilityPage() {
        if (visibilityPage == null) {
            visibilityPage = new VisibilityPage();
        }
        return visibilityPage;
    }
    public static MouseClickOver mouseClickOver() {
        if (mouseClickOver == null) {
            mouseClickOver = new MouseClickOver();
        }
        return mouseClickOver;
    }
    public static OverlappedElement overlappedElement() {
        if (overlappedElement == null) {
            overlappedElement = new OverlappedElement();
        }
        return overlappedElement;
    }
}
