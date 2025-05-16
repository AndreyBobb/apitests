package com.companyname.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class OrderPetsRq (
    @JsonProperty("id")
    val id: Int? = null,
    @JsonProperty("petId")
    val petId: Int? = null,
    @JsonProperty("quantity")
    val quantity: Int? = null,
    @JsonProperty("shipDate")
    val shipDate: String? = null,
    @JsonProperty("status")
    val status: String? = null,
    @JsonProperty("complete")
    val complete: Boolean? = null,
)