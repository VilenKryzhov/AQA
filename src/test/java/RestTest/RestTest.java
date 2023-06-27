package RestTest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestTest {
    @Test
    public void restAssuredTest(){
//        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//        System.out.println(response.getStatusCode());
//        System.out.println(response.asString());

//        given()
//                .contentType(ContentType.JSON)
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .statusCode(200)
//                .body("data.last_name[3]", equalTo("Fields"));

//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .extract().response();
//
//        Assert.assertEquals(200, response.statusCode());
//        Assert.assertEquals("lindsay.ferguson@reqres.in", response.jsonPath().getString("data.email[1]"));

//        JSONObject request = new JSONObject();
//        request.put("name", "morpheus");
//        request.put("job", "test");
//
//        given()
//                .header("Content-Type" ,"application/json")
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .body(request)
//                .when()
//                .put("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(200).log().all();
            given()
                    .when()
                    .delete("https://reqres.in/api/users/2")
                    .then()
                    .statusCode(204).log().all();


    }
}
