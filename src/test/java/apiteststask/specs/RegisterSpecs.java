package apiteststask.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class RegisterSpecs {

    public static RequestSpecification requestRegister = with()
            .contentType(ContentType.JSON)
            .baseUri("https://reqres.in")
            .basePath("/api/register");

    public static ResponseSpecification responseSpecRegister = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .build();

    public static ResponseSpecification responseSpecForBadRequestRegister = new ResponseSpecBuilder()
            .expectStatusCode(400)
            .build();
}
