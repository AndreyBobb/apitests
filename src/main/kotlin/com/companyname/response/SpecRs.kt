package com.companyname.response

import io.restassured.builder.ResponseSpecBuilder
import io.restassured.specification.ResponseSpecification

object SpecRs {

    val responseSpec: ResponseSpecification = ResponseSpecBuilder()
        .expectStatusCode(200)
        .build()
}
