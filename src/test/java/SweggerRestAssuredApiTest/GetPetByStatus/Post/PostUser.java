//package SweggerRestAssuredApiTest.GetPetByStatus;
//
//import org.SweggerApi.User;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.Optional;
//
//import static io.restassured.RestAssured.given;
//
//public class PostUser {
//    String URL = "https://petstore.swagger.io";
//
//    @Test
//    public void test() {
//        SweggerSpecifications.getSpecification(SweggerSpecifications.requestSpecification(URL), SweggerSpecifications.responseSpecification(200));
//
//
//        User user1 = new User();
//        user1.setId(0);
//        user1.setUsername("Abara");
//        user1.setFirstName("Vilen");
//        user1.setLastName("Kryzhov");
//        user1.setEmail("asd@asd");
//        user1.setPassword("1234");
//        user1.setPhone("123123123");
//        user1.setUserStatus(0);
//
//        ResponseCreateUser response = given()
//                .body(user1)
//                .when()
//                .post("/v2/user")
//                .then()
//                .log().body()
//                .extract().as(ResponseCreateUser.class);
//
//
//    }
//}
