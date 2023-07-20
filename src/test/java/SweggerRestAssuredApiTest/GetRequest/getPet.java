package SweggerRestAssuredApiTest.GetRequest;

import SweggerRestAssuredApiTest.SweggerSpecifications;
import org.SweggerApi.User;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getPet {
    public static String URL = "https://petstore.swagger.io";

    @Test
    public void test() {
        SweggerSpecifications.getSpecification(SweggerSpecifications.requestSpecification(URL), SweggerSpecifications.responseSpecification(200));
        String userName = "Abara";

        User response = given()
                .when()
                .get("/v2/user/" + userName)
                .then().log().body()
                .extract().as(User.class);
        System.out.println(response);



    }
}


