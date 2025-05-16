package com.companyname.constant

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonValue

@JsonFormat(shape = JsonFormat.Shape.STRING)
enum class PetsStatus (@JsonValue val status:String, id: Long, name: String) {
    AVAILABLE(status = "available", 9223372036854775000, "doggie"),
    PENDING("pending", 662, "Hank"),
    SOLD("sold", 9223372036854775000, "catty");

    companion object {
        fun fromStatus(value: String): PetsStatus {
            return entries.firstOrNull { it.status.equals(value, ignoreCase = true) }
                ?: throw IllegalArgumentException("Unknown status: $value")

        }
    }
}
