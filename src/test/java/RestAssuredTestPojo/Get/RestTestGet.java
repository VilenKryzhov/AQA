package RestAssuredTestPojo.Get;

import RestAssuredTestPojo.Specifications;
import org.ListUsers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

import static io.restassured.RestAssured.given;
import static java.util.Collections.*;
import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class RestTestGet {
    public static String URL = "https://reqres.in/";

    @Test
    public void test() {
//        _______________________________GET_______________________________________________
//        Specifications.getSpecifications(Specifications.requestSpecification(URL), Specifications.responseSpecification(200));
//        List<ListUsers> data = given()
//                .when()
//                .get("/api/users?page=2")
//                .then()
//                .extract().body().jsonPath().getList("data", ListUsers.class);
//        List<String> lastNameList = new ArrayList<>();
//        List<String> email = new ArrayList<>();
//        List<String> lastNameListWithSmallChar = new ArrayList<>();
//
//        for (ListUsers datum : data) {
//            lastNameList.add(datum.getLast_name());
//            email.add(datum.getEmail());
//            System.out.println(datum);
//
//        }
//        for (String name : lastNameList) {
//            lastNameListWithSmallChar.add(name.toLowerCase());
//        }
//        for (int i = 0; i < email.size(); i++) {
//            Assert.assertTrue(email.get(i).contains(lastNameListWithSmallChar.get(i)));
//
//        }



//        ints.sort((o1, o2) -> o2-o1);
    }
}
