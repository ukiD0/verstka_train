package com.example.myapplication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentLogINBinding


class LogINFragment : Fragment() {
    private lateinit var binding: FragmentLogINBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLogINBinding.inflate(inflater,container,false)

        binding.btnNextScreen.setOnClickListener {
            findNavController().navigate(R.id.action_logINFragment_to_homeFragment)
        }



        return binding.root
    }

}