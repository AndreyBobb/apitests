package com.companyname.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class PetRq(
    @JsonProperty("id")
    val id: Int? = null,
    @JsonProperty("username")
    val username: String? = null,
    @JsonProperty("firstname")
    val firstName: String? = null,
    @JsonProperty("lastName")
    val lastName: String? = null,
    @JsonProperty("email")
    val email: String? = null,
    @JsonProperty("password")
    val password: String? = null,
    @JsonProperty("phone")
    val phone: String? = null,
    @JsonProperty("userstatus")
    val userStatus: Int? = null,
)
