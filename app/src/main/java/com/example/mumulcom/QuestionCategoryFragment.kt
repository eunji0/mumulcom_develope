package com.example.mumulcom

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mumulcom.databinding.FragmentAlarmBinding
import com.example.mumulcom.databinding.FragmentQuestioncategoryBinding

class QuestionCategoryFragment: Fragment() {
    lateinit var binding: FragmentQuestioncategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestioncategoryBinding.inflate(inflater, container, false)

        binding.questioncategoryNextBtn.setOnClickListener {
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm, QuestionWriteFragment())
                .commitAllowingStateLoss()
        }

        return binding.root
    }

}

