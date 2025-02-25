package apiteststask.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.with;

public class DeleteSpecs {

    public static RequestSpecification requestForDeletingSecondUser = with()
            .baseUri("https://reqres.in")
            .basePath("/api/users/2");


    public static ResponseSpecification responseOfDeleting = new ResponseSpecBuilder()
            .expectStatusCode(204)
            .build();
}
