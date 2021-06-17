package com.example.authwithapi.model

data class Account(val email: String?, val password: String?, val returnSecureToken:Boolean = true)
