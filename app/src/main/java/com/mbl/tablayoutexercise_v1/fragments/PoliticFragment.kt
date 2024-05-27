package com.mbl.tablayoutexercise_v1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mbl.tablayoutexercise_v1.R
import com.mbl.tablayoutexercise_v1.databinding.FragmentPoliticBinding

class PoliticFragment : Fragment() {
    private lateinit var binding: FragmentPoliticBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentPoliticBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = "Politic Fragment (with Binding)"
    }

}