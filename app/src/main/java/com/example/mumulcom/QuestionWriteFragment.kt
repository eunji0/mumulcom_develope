package com.example.mumulcom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mumulcom.databinding.FragmentQuestioncategoryBinding
import com.example.mumulcom.databinding.FragmentQuestionwriteBinding

class QuestionWriteFragment:Fragment() {
    lateinit var binding: FragmentQuestionwriteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentQuestionwriteBinding.inflate(inflater, container, false)

        binding.questionwriteOutIv.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, HomeFragment())
                .commitAllowingStateLoss()
        }

        return binding.root
    }
}