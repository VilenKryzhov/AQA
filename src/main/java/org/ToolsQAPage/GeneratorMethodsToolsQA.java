package org.ToolsQAPage;

public class GeneratorMethodsToolsQA {
    private static clickToExercise uploadDownload;
    private static BrowserWindow browserWindow;

    public static clickToExercise uploadDownload() {
        if (uploadDownload == null) {
            uploadDownload = new clickToExercise();
        }
        return uploadDownload;
    }
    public static BrowserWindow browserWindow(){
        if (browserWindow == null){
            browserWindow = new BrowserWindow();
        } return browserWindow;
    }
}
