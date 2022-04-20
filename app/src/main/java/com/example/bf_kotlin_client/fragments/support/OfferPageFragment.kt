package com.example.bf_kotlin_client.fragments.support

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bf_kotlin_client.databinding.FragmentOfferResponsesBinding
import com.example.bf_kotlin_client.databinding.OfferPageBinding
import com.example.bf_kotlin_client.viewmodels.OfferPageViewModel
import com.example.bf_kotlin_client.viewmodels.OfferResponsesViewModel

class OfferPageFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = OfferPageBinding.inflate(layoutInflater)

        binding.viewModel = OfferPageViewModel()

        return binding.root
    }
}