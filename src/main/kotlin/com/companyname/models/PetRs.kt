package com.companyname.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class PetRs(
    @JsonProperty("code")
    val code: Int? = null,
    @JsonProperty("type")
    val type: String? = null,
    @JsonProperty("message")
    val message: String? = null,
    @JsonProperty("id")
    val id: Int? = null,
    @JsonProperty("petId")
    val petId: Int? = null,
    @JsonProperty("quantity")
    val quantity: Int? = null,
    @JsonProperty("status")
    val status: String? = null,
    @JsonProperty("complete")
    val complete: Boolean? = null,
)
