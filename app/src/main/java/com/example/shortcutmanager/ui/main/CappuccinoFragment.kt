package com.example.shortcutmanager.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shortcutmanager.R

class CappuccinoFragment : Fragment() {

    companion object {
        fun newInstance() = CappuccinoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_cappuccino, container, false)
    }
}