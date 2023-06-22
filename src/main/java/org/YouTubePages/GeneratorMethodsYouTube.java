package org.YouTubePages;

import org.YouTubePages.LoginPageYouTube.LoginPageYouTube;
import org.YouTubePages.MainPage.MainPageYouTube;

public class GeneratorMethodsYouTube  {
    private static MainPageYouTube mainPageYouTube;
    private static LoginPageYouTube loginPageYouTube;

    public static MainPageYouTube mainPageYouTube(){
        if (mainPageYouTube == null){
            mainPageYouTube = new MainPageYouTube();
        }return mainPageYouTube;
    }
    public static LoginPageYouTube loginPageYouTube(){
        if (loginPageYouTube == null){
            loginPageYouTube = new LoginPageYouTube();
        }return loginPageYouTube;
    }
}
