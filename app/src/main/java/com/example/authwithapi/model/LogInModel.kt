package com.example.authwithapi.model

data class LogInModel(val idToken: String?, val email: String?, val refreshToken: String?, val expiresIn: String?, val localId: String?, val registered:Boolean = false)
