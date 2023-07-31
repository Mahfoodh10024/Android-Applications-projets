package com.example.wird3

import android.content.Context
import android.os.Bundle
import android.os.Vibrator
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
class itemss : Fragment() {

    fun vibrate(duration: Long) {
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(duration)
    }

    //    val appName =  R.string.app_name.toString()
//    fun share(){
//        This.Share.setOnClickListener {
//            ShareCompat.IntentBuilder.from(This)
//                .setText("Share this $appName")
//                .setType("text/plain")
//                .setChooserTitle("Share it")
//                .startChooser()
//        }
//    }
}