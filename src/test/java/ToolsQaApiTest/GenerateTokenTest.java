package ToolsQaApiTest;

import RestAssuredTestPojo.Specifications;
import io.restassured.response.Response;
import org.ToolQaApiTest.GenerateTokenPost.GeneretaTokenResponsePojo;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GenerateTokenTest {
    String url = "https://demoqa.com/swagger/#/";
    @Test
    public void test(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", "TonyMontana");
        jsonObject.put("password", "Z160799z!");

        Response responsePojo = given()
                .body(jsonObject)
                .when()
                .spec(Specifications.requestSpecification(url))
                .post("Account/AccountV1GenerateTokenPost")
                .then().log().all()
                .spec(Specifications.responseSpecification(200))
                .extract().response();

        System.out.println(responsePojo);

    }
}
