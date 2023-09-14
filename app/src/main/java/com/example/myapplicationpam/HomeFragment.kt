package com.example.myapplicationpam

import android.os.Bundle
import android.support.v4.os.IResultReceiver._Parcel
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplicationpam.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get () = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

        _binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_homeFragment_to_detailFragment)
        }

        return binding.root

    }



}
