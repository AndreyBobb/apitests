package apiteststask.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;
import static org.hamcrest.Matchers.*;

public class GetListSpecs {

    public static RequestSpecification requestGetList = with()
            .baseUri("https://reqres.in")
            .basePath("/api/users?page=2");


    public static ResponseSpecification responseSpecForGetList = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectBody("data.email", everyItem(endsWith("@reqres.in")))
            .build();
}


