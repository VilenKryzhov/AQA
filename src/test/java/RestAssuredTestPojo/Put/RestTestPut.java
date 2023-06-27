package RestAssuredTestPojo.Put;

import RestAssuredTestPojo.Specifications;
import org.API.CreatePostUserRequest;
import org.API.CreatePostUserResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestTestPut {
    public static String URL = "https://reqres.in/";
    @Test
    public void test(){
        Specifications.getSpecifications(Specifications.requestSpecification(URL), Specifications.responseSpecification(201));
        CreatePostUserRequest request = new CreatePostUserRequest();
        request.setName("morpheus");
        request.setJob("leader");
        CreatePostUserResponse response = given()
                .body(request)
                .when()
                .post("api/users")
                .then().log().body()
                .extract().as(CreatePostUserResponse.class);

        Assert.assertEquals(request.getName(), response.getName());
        Assert.assertEquals(request.getJob(), response.getJob());
//        ________________________________________________PUT__________________________________________________
//        Specifications.getSpecifications(Specifications.requestSpecification(URL), Specifications.responseSpecification(200));
//        CreatePostUserRequest request = new CreatePostUserRequest();
//        request.setName("morpheus");
//        request.setJob("zion resident");
//
//        CreatePostUserResponse response = given()
//                .body(request)
//                .when()
//                .put("api/users/2")
//                .then().log().body()
//                .extract().as(CreatePostUserResponse.class);
//
//        Assert.assertEquals(request.getName(), response.getName());
//        Assert.assertEquals(request.getJob(), response.getJob());
    }
}
