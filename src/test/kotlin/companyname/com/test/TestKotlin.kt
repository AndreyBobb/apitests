package companyname.com.test

import com.companyname.constant.PetId
import com.companyname.constant.PetsStatus
import com.companyname.models.OrderPetsRq
import com.companyname.models.PetRq
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import pet.MakeUsers
import kotlin.test.assertEquals

class TestKotlin {
    @Test
    fun createListWithGivenInputArray() {
        val petRequest = listOf(
            PetRq(
                id = 1,
                username = "name",
                firstName = "first",
                lastName = "last",
                email = "mail@mail.com",
                password = "pas",
                phone = "364646",
                userStatus = 1
            )
        )

        val petResponse = MakeUsers.createUsersWithList(petRequest)

        assertAll({
            assertEquals(petResponse.code, 200)
            assertEquals(petResponse.type, "unknown")
            assertEquals(petResponse.message, "ok")
        }
        )
    }

    @Test
    fun createUser() {
        val petRequest = PetRq(
            id = 753,
            username = "name",
            firstName = "first",
            lastName = "last",
            email = "mail@mail.com",
            password = "pas",
            phone = "364646",
            userStatus = 1
        )
        val petResponse = MakeUsers.createUsers(petRequest)

        assertAll({
            assertEquals(petResponse.code, 200)
            assertEquals(petResponse.type, "unknown")
            assertEquals(petResponse.message, petRequest.id.toString())
        }
        )
    }

    @ParameterizedTest
    @EnumSource(PetsStatus::class)
    fun findPetsByStatus(petStatus: PetsStatus) {
        val petResponse = MakeUsers.getPetsByStatus(petStatus)
        val firstPet = petResponse.first()

        assertAll({
            assertEquals(petResponse[0].id, firstPet.id)
            assertEquals(petResponse[0].name, firstPet.name)
        })
    }

//    @Test
//    fun getById() {
//        val petId = PetId()
//        val petResponse = MakeUsers.getPetsById(petId.ID)
//
//        assertAll({
//            assertEquals(petResponse.id, petId.ID.toLong())
//            assertEquals(petResponse.name, "doggie")
//            assertEquals(petResponse.status, "available")
//        })
//    }
//
//    @Test
//    fun placeAnOrderForAPet() {
//        val petsId = PetId()
//        val petRequest = OrderPetsRq(
//            id = 0,
//            petId = 0,
//            quantity = 0,
//            status = "placed",
//            complete = true,
//        )
//        val petResponse = MakeUsers.placeAnOrder(petRequest)
//
//        assertAll({
//            assertEquals(petResponse.id, petsId.ID)
//            assertEquals(petResponse.quantity, 0)
//            assertEquals(petResponse.complete, true)
//        })
//    }
}


