package org.RozetkaTestWebSite;

public class MethodGenerator {
    private static RegisterTest registerTest;
    private static OpenMenuTest openMenuTest;
    private static CatalogTest catalogTest;
    private static TestLink testLink;




    public static RegisterTest registerTest(){
        if (registerTest == null){
             registerTest = new RegisterTest();
        }
        return registerTest;
    }
    public static OpenMenuTest openMenuTest(){
        if (openMenuTest == null){
             openMenuTest = new OpenMenuTest();
        }
        return openMenuTest;
    }
    public static CatalogTest catalogTest(){
        if (catalogTest == null){
             catalogTest = new CatalogTest();
        }
        return catalogTest;
    }
    public static TestLink testLink(){
        if (testLink == null){
             testLink = new TestLink();
        }
        return testLink;
    }

}
