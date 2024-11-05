package com.example.challange_sprint01_claimnomore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class DentistaFragment : Fragment() {

    private var _biding:DentistaFragment? = null
    private val biding get() =_biding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_dentista, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _biding = null
    }

}