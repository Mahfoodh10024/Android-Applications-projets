package com.example.wird3

import Permissions
import android.Manifest
import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.Vibrator
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.view.isVisible
import com.example.wird3.databinding.MainpageFragmentBinding
import java.io.File
import kotlin.coroutines.*
import kotlin.system.exitProcess

class MainPage : Fragment() {

    private var Counter = 0
    private var Counter1 = 0
    var rv = 0
    private var sum = rv
    lateinit var binding: MainpageFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
                 binding = MainpageFragmentBinding.inflate(inflater , container , false)


        mainclicks()
        reset()
        bottomNav()


        return binding.root
    }



    fun bottomNav(){
        val bottomBar =  requireActivity().findViewById<CoordinatorLayout>(R.id.coordinatorLayout)
        bottomBar.isVisible = true
    }

    fun vibrate(duration: Long) {
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(duration)
    }
    private fun mainclicks() {
        val per = Permissions(this)
        binding.counterm.setOnClickListener {
            Counter++
            sum++
            binding.displayer.text = Counter.toString()
            sumvalue()
            vibrate(50)
            write()

            per.ReadExternalStrorage()
            per.WriteExternalStrorage()
            per.Location()
        }
    }
    fun sumvalue() {
        binding.sumcounter.text = sum.toString()
    }
    fun reset() {
        binding.reset.setOnClickListener {
            Counter = Counter1
            binding.displayer.text = Counter.toString()
            vibrate(300)
        }
    }
    @SuppressLint("SuspiciousIndentation")
    fun write(){
        val path = requireActivity().applicationInfo.dataDir
        val fileName = "counterSum.txt"
        val file = File("$path/$fileName")
            file.writeText(sum.toString())
    }
    fun read(){
        val path = requireActivity().applicationInfo.dataDir
        val fileName = "counterSum.txt"
        val file = File("$path/$fileName")

        rv = file.readText().toInt()
        binding.sumcounter.text = (rv.toString())
    }
}
