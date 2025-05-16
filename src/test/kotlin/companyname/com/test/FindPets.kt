package companyname.com.test

import com.companyname.models.PetRq
import com.companyname.models.PetRs
import com.companyname.request.SpecRq.reqSpec
import io.restassured.RestAssured.given
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.When
import org.junit.jupiter.api.Test

class FindPets {

    val petRq: PetRq? = null


    @Test
    fun getPetByStatus() {
        val response: PetRs =
            given()
                .baseUri("https://petstore.swagger.io")
                .params("status", "sold")
                .get("v2/pet/findByStatus")
                .then()
                .statusCode(200)
                .extract().`as`(PetRs::class.java)
    }


}