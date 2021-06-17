package com.example.authwithapi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.authwithapi.databinding.MainFragmentBinding
import com.example.authwithapi.model.Account
import com.example.authwithapi.viewmodel.MainViewModel

class MainFragment : Fragment() {
    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: MainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)

        init()
        return binding.root
    }

    private fun init() {
        binding.SignUpButton.setOnClickListener {
            viewModel.initSignUp()
            observes()
        }
        binding.LogInButton.setOnClickListener {
            viewModel.initSignIn()
            observes()
        }

    }
    private fun observes() {
        viewModel.userInfo = Account(binding.emailEditText.text.toString(), binding.passwordEditText.text.toString())
    }
}