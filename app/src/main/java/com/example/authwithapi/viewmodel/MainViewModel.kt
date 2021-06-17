package com.example.authwithapi.viewmodel

import android.util.Log.d
import androidx.lifecycle.ViewModel
import com.example.authwithapi.model.Account
import com.example.authwithapi.retrofit.RetrofitService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    lateinit var userInfo: Account
    private suspend fun signIn() {
        val result = RetrofitService.getData().logIn(userInfo)
        d("userInformation", result.body().toString())
    }
    private suspend fun signUp() {
        val result = RetrofitService.getData().register(userInfo)
        d("UserInformation", result.body().toString())
    }

    fun initSignUp() {
        CoroutineScope(Dispatchers.IO).launch {
            signUp()
        }
    }
    fun initSignIn(){
        CoroutineScope(Dispatchers.IO).launch {
            signIn()
        }
    }
}