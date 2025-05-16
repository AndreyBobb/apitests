package com.companyname.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class GetPetsRs(
    @JsonProperty("id")
var id: Long?,
    @JsonProperty("category")
var category: Category?,
    @JsonProperty("name")
var name: String?,
    @JsonProperty("photoUrls")
var photoUrls: List<String>?,
    @JsonProperty("tags")
var tags: List<Tag>?,
    @JsonProperty("status")
var status: String?
) {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    companion object {
        data class Category(
            @JsonProperty("id") var id: Int?,
            @JsonProperty("name") var name: String?
        )

        @JsonInclude(JsonInclude.Include.NON_NULL)
        data class Tag(
            @JsonProperty("id") var id: Int?,
            @JsonProperty("name") var name: String?
        )
    }
}