package pet

import com.companyname.constant.PetId
import com.companyname.constant.PetsStatus
import com.companyname.models.*
import com.companyname.request.SpecRq
import com.companyname.response.SpecRs
import io.restassured.RestAssured.given
import io.restassured.common.mapper.TypeRef
import io.restassured.http.ContentType

object MakeUsers {


    fun createUsersWithList(petRequest: List<PetRq>): PetRs {

            return given()
                .spec(SpecRq.reqSpec)
                .body(petRequest)
                .log().all()
                .post("v2/user/createWithList")
                .then()
                .spec(SpecRs.responseSpec)
                .extract().`as`(PetRs::class.java)
        }


    fun createUsers(petRequest: PetRq): PetRs {
            return given()
                .spec(SpecRq.reqSpec)
                .body(petRequest)
                .post("v2/user")
                .then()
                .spec(SpecRs.responseSpec)
                .extract().`as`(PetRs::class.java)

        }

    fun getPetsByStatus(petsValues: PetsStatus): List<GetPetsRs> {
        return given()
            .spec(SpecRq.reqSpecOfGettingByStatus)
            .get("v2/pet/findByStatus?status=${petsValues.status}")
            .then()
            .spec(SpecRs.responseSpec)
            .extract().`as`(object : TypeRef<List<GetPetsRs>>() {})
    }

    fun getPetsById(petId: Int): GetPetsRs {
        return given()
            .spec(SpecRq.reqSpecOfGettingByStatus)
            .get("v2/pet/$petId")
            .then()
            .log().all()
            .spec(SpecRs.responseSpec)
            .extract().`as`(GetPetsRs::class.java)
    }

    fun placeAnOrder(petRq: OrderPetsRq): OrderedPetRs {
        return given()
            .contentType(ContentType.JSON)
            .body(petRq)
            .spec(SpecRq.reqSpec)
            .log().all()
            .post("v2/store/order")
            .then()
            .log().all()
            .spec(SpecRs.responseSpec)
            .extract().`as`(OrderedPetRs::class.java)
    }
}


