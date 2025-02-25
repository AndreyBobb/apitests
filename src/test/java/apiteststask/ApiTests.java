package apiteststask;

import apiteststask.moduls.RegistrationModel;

import org.junit.jupiter.api.Test;

import static apiteststask.specs.DeleteSpecs.requestForDeletingSecondUser;
import static apiteststask.specs.DeleteSpecs.responseOfDeleting;
import static apiteststask.specs.GetListSpecs.requestGetList;
import static apiteststask.specs.GetListSpecs.responseSpecForGetList;
import static apiteststask.specs.RegisterSpecs.*;
import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    void userRegistrationInTheSystem() {
        RegistrationModel bodyModel = new RegistrationModel();

        bodyModel.setEmail("eve.holt@reqres.in");
        bodyModel.setPassword("pistol");

        given()
                .spec(requestRegister)
                .body(bodyModel)
                .when()
                .log().uri()
                .log().body()
                .post()
                .then()
                .spec(responseSpecRegister)
                .log().body();
    }

    @Test
    void userRegistrationInTheSystemWithoutPassword() {
        RegistrationModel bodyModel = new RegistrationModel();
        bodyModel.setEmail("peter@klaven}");

        given()
                .spec(requestRegister)
                .body(bodyModel)
                .when()
                .log().all()
                .post()
                .then()
                .spec(responseSpecForBadRequestRegister);
    }


    @Test
    void getUsersListAndCheckEmail() {

        given()
                .spec(requestGetList)
                .when()
                .log().all()
                .get()
                .then()
                .log().all()
                .spec(responseSpecForGetList);
    }


    @Test
    void deleteSecondUser() {

        given()
                .spec(requestForDeletingSecondUser)
                .when()
                .log().all()
                .delete()
                .then()
                .log().all()
                .spec(responseOfDeleting);
    }

}
