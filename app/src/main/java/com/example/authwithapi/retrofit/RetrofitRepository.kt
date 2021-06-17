package com.example.authwithapi.retrofit
import com.example.authwithapi.App
import com.example.authwithapi.model.LogInModel
import com.example.authwithapi.model.RegisterModel
import com.example.authwithapi.model.Account
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query
interface RetrofitRepository {
    @POST("/v1/accounts:signUp")
    suspend fun register(
        @Body user: Account, @Query("key")
        apiKey: String = App.authKey
    ): Response<RegisterModel>
    @POST("/v1/accounts:signInWithPassword")
    suspend fun logIn(
        @Body user: Account, @Query("key")
        apiKey: String = App.authKey
    ): Response<LogInModel>
}