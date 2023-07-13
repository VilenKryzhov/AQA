package org.ToolsQAPage;

import org.checkerframework.checker.units.qual.C;

public class GeneratorMethodsToolsQA {
    private static ClickToExercise uploadDownload;
    private static BrowserWindow browserWindow;
    private static ClickToExercise clickToExercise;

    public static ClickToExercise uploadDownload() {
        if (uploadDownload == null) {
            uploadDownload = new ClickToExercise();
        }
        return uploadDownload;
    }
    public static BrowserWindow browserWindow(){
        if (browserWindow == null){
            browserWindow = new BrowserWindow();
        } return browserWindow;
    }
    public static ClickToExercise clickToExercise(){
        if (clickToExercise == null){
            clickToExercise = new ClickToExercise();
        } return clickToExercise;
    }
}
