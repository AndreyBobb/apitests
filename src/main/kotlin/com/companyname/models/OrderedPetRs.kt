package com.companyname.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class OrderedPetRs (
    @JsonProperty("id")
    val id: Int? = null,
    @JsonProperty("petId")
    val petId: Int,
    @JsonProperty("quantity")
    val quantity: Int,
    @JsonProperty("shipDate")
    val complete: Boolean? = null,
)
