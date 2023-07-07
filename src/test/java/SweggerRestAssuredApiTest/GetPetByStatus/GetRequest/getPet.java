package SweggerRestAssuredApiTest.GetPetByStatus.GetRequest;

import SweggerRestAssuredApiTest.GetPetByStatus.SweggerSpecifications;
import io.restassured.response.Response;
import org.SweggerApi.GetResult;
import org.SweggerApi.User;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getPet {
    public static String URL = "https://petstore.swagger.io";

    @Test
    public void test() {
        ////////////////////////////////////////GET BY STATUS////////////////////////////////////////////
//        SweggerSpecifications.getSpecification(SweggerSpecifications.requestSpecification(URL), SweggerSpecifications.responseSpecification(200));
//        String status = "available";
//        Response response = given()
//                .when()
//                .get("/v2/pet/findByStatus?status=available")
//                .then()
//                .extract().response();
//        List<String> listAvaliable = response.getBody().jsonPath().get("status");
//        Assert.assertEquals(status, response.jsonPath().getString("status[3]"));
//        for (String s : listAvaliable) {
//            Assert.assertEquals(s, status);
//        }
//    }
        /////////////////////////////////////GET BY NAME//////////////////////////////////////////
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


