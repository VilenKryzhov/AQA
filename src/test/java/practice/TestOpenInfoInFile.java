package practice;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestOpenInfoInFile {
//    @Test
    public void testOpenInfoFile() throws FileNotFoundException {
        File file = new File(System.getProperty("user.dir")+("/src/") + ("main/") + ("resources/") + ("files/") + ("annual-enterprise-survey-2021-financial-year-provisional-csv.csv"));
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
