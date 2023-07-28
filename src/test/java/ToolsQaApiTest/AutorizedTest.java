package ToolsQaApiTest;

import RestAssuredTestPojo.Specifications;
import io.restassured.response.Response;
import org.ToolQaApiTest.AutorizedPost.AutorizedPostRequest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AutorizedTest {
    String url = "https://demoqa.com/swagger/#/";
    @Test
    public void test(){
//        Specifications.getSpecifications(Specifications.requestSpecification(url), Specifications.responseSpecification(200));
        AutorizedPostRequest autorizedPostRequest = new AutorizedPostRequest("TonyMontana", "Z160799z!");
        Response response = given()
                .body(autorizedPostRequest)
                .when()
                .spec(Specifications.requestSpecification(url))
                .post("Account/AccountV1AuthorizedPost")
                .then()
                .spec(Specifications.responseSpecification(200))
                .extract().response();
        System.out.println(response);


    }

}
