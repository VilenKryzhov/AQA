package SweggerRestAssuredApiTest.GetRequest;
import org.SweggerApi.UserNew;
import org.testng.annotations.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class getUserNew {

    @Test
    public void test(){
//        SweggerSpecifications.getSpecification(SweggerSpecifications.requestSpecification(URL), SweggerSpecifications.responseSpecification(200));

        UserNew[] response = given()
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
                .then().log().body()
                .extract().as(UserNew[].class);
        System.out.println(Arrays.toString(response));
    }
}
