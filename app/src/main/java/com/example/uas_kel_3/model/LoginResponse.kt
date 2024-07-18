package com.example.uas_kel_3.model

data class LoginResponse(
    val status: Boolean,
    val message: String,
    val data: Data?
) {
    data class Data(
        val id: Int,
        val username: String
    )
}