package org.ToolsQAPage;


public class GeneratorMethodsToolsQA {
    private static ClickToExercise uploadDownload;
    private static BrowserWindow browserWindow;
    private static ClickToExercise clickToExercise;
    private static Allert allert;
    private static ModalDialogs modalDialogs;

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
    public static Allert allert(){
        if( allert ==null){
            allert = new Allert();
        } return allert;
    }
    public static ModalDialogs modalDialogs(){
        if (modalDialogs == null){
            modalDialogs = new ModalDialogs();
        } return modalDialogs;
    }
}
