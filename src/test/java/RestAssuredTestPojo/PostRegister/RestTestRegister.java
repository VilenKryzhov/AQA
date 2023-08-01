package RestAssuredTestPojo.PostRegister;

import RestAssuredTestPojo.Specifications;
import org.API.RegisterRequest;
import org.API.RegisterResponse;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

public class RestTestRegister  {
    public static String URL = "https://reqres.in/";
    @Test
    public void test(){
        Specifications.getSpecifications(Specifications.requestSpecification(URL),Specifications.responseSpecification(400));
        RegisterRequest request = new RegisterRequest("sydney@fife");
        RegisterResponse response = given()
                .body(request)
                .when()
                .post("/api/register")
                .then().log().all()
                .extract().as(RegisterResponse.class);
    }
}
