//package practice;
//
//import com.codeborne.selenide.Configuration;
//import org.base.BaseTest;
//import org.base.PageTools;
//import org.openqa.selenium.By;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//
//public class SecondTest extends BaseTest {
////    public PageTools tools = new PageTools();
//    @BeforeClass
//    public void setUpBeforeDownload() {
//        Configuration.reportsFolder = "downloands";// якщо це у нас a href
////        Configuration.fileDownload = FileDownloadMode.FOLDER; // якщо це div  і тд
//    }
//
//    public static String uploadFileFunc(String newFile) {
//        return new File("src/main/resources/files/" + newFile).getAbsolutePath();
//    }
//    public By asd = By.xpath("//*[@id=\"APjFqb\"]");
//    @Test
//    public void test2() throws FileNotFoundException {
//          tools.type("GTA", asd);
//          tools.clickEnterButton();
//        $(By.xpath("//input[@type = 'text']")).append("Socks");
//        $(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
//        ElementsCollection $$ = $$(xpath("//div[@id='desktop-grid-2']//child::img"));

//        $(By.xpath("//a[@id='nav-hamburger-menu']")).click();
//        $(By.xpath("//a[@class='hmenu-item' and @data-menu-id='3']")).click();
//        $(By.xpath("//a[text()='Kindle']")).click();

////        ElementsCollection $$ = $$(By.xpath("//div[@class = 'navFooterLinkCol navAccessibility'][2]//a[@class='nav_a']"));
//
//
////        $(By.xpath("//input[@class='input_error form_input' and @placeholder = 'Username']")).append("standard_user");
////        $(By.xpath("//input[@class='input_error form_input' and @placeholder = 'Password']")).append("secret_sauce");
////        $(By.xpath("//input[@type='submit']")).submit();
//
////        List<String> texts = $$(By.xpath("//div[@class='inventory_item_desc']")).texts();
////        for (String text : texts) {
////            if (text.length()>40){
////                System.out.println(text);
////            }
////        }
//
//
//////        $(By.xpath("//input[@class='input_error form_input' and @placeholder = 'Password']")).clear();
////        Selenide.actions().sendKeys(Keys.ENTER).perform();
////        Selenide.sleep(2000);
////        $(By.xpath("//div[@class='footer_copy']")).scrollIntoView(true);
////        $(By.xpath("//div[@class='artboard-demo w-full h-96 bg-base-200/20 border border-base-content/10 drop-shadow-md ripple my-6 cursor-pointer']")).doubleClick();
//
//
////        Selenide.actions().keyDown($(By.xpath("//div[@class='inventory_item_desc']")),Keys.SHIFT).perform();
////        Selenide.sleep(2000);
////        Selenide.actions().keyUp($(By.xpath("//div[@class='inventory_item_price' and text()='29.99']")),Keys.SHIFT).perform();
//
//
////        $(By.xpath("//a[text()='Annual enterprise survey: 2021 financial year (provisional) – CSV']")).scrollIntoView(true);
////        try {
////            File download = $(By.xpath("//a[text()='Annual enterprise survey: 2021 financial year (provisional) – CSV']")).download();  // закачка файла
////            String path = download.getPath();
////            FileUtils.deleteDirectory(new File("downloads"));
////
////
////            File file = new File(path);
////            Scanner scanner = new Scanner(file);
////            while (scanner.hasNextLine()) {
////                String line = scanner.nextLine();
////                System.out.println(line);
////            }
//
//
////        $(By.xpath("//input[@type = 'file']")).uploadFile(new File(uploadFileFunc("annual-enterprise-survey-2021-financial-year-provisional-csv.csv")));
//
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
//    }}
