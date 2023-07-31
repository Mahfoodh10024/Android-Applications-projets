package com.example.wird3


import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.wird3.databinding.ActivityMainBinding
import com.example.wird3.databinding.TsbeehatFragmentBinding
import java.io.File
import kotlin.system.exitProcess


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replace(Loading())

        change()
    }

    private fun change() {
        binding.menunav.setOnItemSelectedListener { it ->
            when(it.itemId){
                R.id.Home ->{
                    replace(MainPage())
                    true
                }
                R.id.timer->{
                    replace(MainPage())
                    true
                }
                R.id.Tsbeehate->{
                    replace(Tsbeehat())
                    true
                }
                R.id.Azkar ->{
                    replace(Azkar())
                    true
                }
                else -> false
            }
        }
    }

    @SuppressLint("SuspiciousIndentation")
    fun replace(fragment: Fragment){
        val transition = supportFragmentManager.beginTransaction()
            transition.replace(R.id.fragcontainer , fragment)
            transition.commit()
    }

    @Deprecated("Deprcated in Java")
    override fun onBackPressed() {
        val dialog = AlertDialog.Builder(this)
            .setTitle("Exit")
            .setMessage("Do you want to close the app?")
            .setPositiveButton("No" , null)
            .setNegativeButton("Yes" , object : DialogInterface.OnClickListener{
                override fun onClick(dialog: DialogInterface?, which: Int) {
                    exitProcess(-1)
                }
            })
            .create()
            .show()
    }
}