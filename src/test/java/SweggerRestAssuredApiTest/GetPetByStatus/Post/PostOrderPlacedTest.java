package SweggerRestAssuredApiTest.GetPetByStatus.Post;

import RestAssuredTestPojo.Specifications;
import org.SweggerApi.CreateRequestToOrderPlaced;
import org.SweggerApi.CreatetResponseToOrderPlaced;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class PostOrderPlacedTest {
    public static String URL = "https://petstore.swagger.io";

    @Test
    public void test() {
        CreateRequestToOrderPlaced request = new CreateRequestToOrderPlaced();
        request.setId(11);
        request.setPetId(222);
        request.setQuantity(3333);
        request.setShipDate("2023-10-07T14:04:19.599+0000");
        request.setStatus("placed");
        request.setComplete(true);
//        Specifications.getSpecifications(Specifications.requestSpecification(URL), Specifications.responseSpecification(200));
        System.out.println(request);
        CreatetResponseToOrderPlaced response = given()
                .body(request)
                .when()
                .post("https://petstore.swagger.io/v2/store/order")
                .then().log().body()
                .extract().as(CreatetResponseToOrderPlaced.class);
        System.out.println(response);
    }
}
