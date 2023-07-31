package com.example.wird3

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.isVisible
import com.example.wird3.databinding.ActivityMainBinding
import com.example.wird3.databinding.FragmentLoadingBinding
import com.example.wird3.databinding.MainpageFragmentBinding

class Loading : Fragment() {

    lateinit var binding: FragmentLoadingBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLoadingBinding.inflate(inflater , container , false)


        bottomNav()


        Handler().postDelayed({
                 replace(MainPage())
        },1800)

    return binding.root
    }

    fun bottomNav(){
        val bottomBar =  requireActivity().findViewById<CoordinatorLayout>(R.id.coordinatorLayout)
        bottomBar.isVisible = false
    }

    @SuppressLint("SuspiciousIndentation")
    fun replace(fragment: Fragment){
        val transition = requireActivity().supportFragmentManager.beginTransaction()
        transition.replace(R.id.fragcontainer , fragment)
        transition.commit()
    }
}