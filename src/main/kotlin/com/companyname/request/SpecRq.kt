package com.companyname.request

import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification

object SpecRq {

    val reqSpec: RequestSpecification = with(RequestSpecBuilder()) {
            setBaseUri("https://petstore.swagger.io")
            addHeader("accept", "application/json")
            addHeader("Content-Type", "application/json")
            build()

    }
    val reqSpecOfGettingByStatus: RequestSpecification = with(RequestSpecBuilder()) {
            setBaseUri("https://petstore.swagger.io")
            addHeader("accept", "application/json")
            build()

    }
}