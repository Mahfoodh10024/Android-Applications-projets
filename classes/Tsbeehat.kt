package com.example.wird3

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Vibrator
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ScrollingView
import androidx.core.view.isVisible
import androidx.core.widget.NestedScrollView
import com.example.wird3.databinding.TsbeehatFragmentBinding

class Tsbeehat : Fragment() {


    lateinit var binding: TsbeehatFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = TsbeehatFragmentBinding.inflate(inflater, container, false)

        exit()
        AddText()
        item13()
        item12()
        item11()
        item10()
        item9()
        item8()
        item7()
        item6()
        item5()
        item4()
        item3()
        item2()
        item1()
        item()


        return binding.root
    }

    fun vibrate(duration: Long) {
        val vibrator = context?.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrator.vibrate(duration)
    }

    fun exit(){
        binding.topbarT1.setOnMenuItemClickListener { item->
            when(item.itemId){
                R.id.exit ->{
                    replace(MainPage())
                    true
                }
                else->false
            }
        }
    }

    @SuppressLint("SuspiciousIndentation")
    fun replace(fragment: Fragment){
        val transition = requireActivity().supportFragmentManager.beginTransaction()
        transition.replace(R.id.fragcontainer , fragment)
        transition.commit()
    }

    private fun item() {
        var counter = 0
        binding.count.text = counter.toString()
        binding.btn.setOnClickListener {
            counter++
            binding.count.text = counter.toString()
            vibrate(50)
        }
    }
    private fun item1() {
        var counter1 = 0
        binding.count1.text = counter1.toString()
        binding.btn1.setOnClickListener {
            counter1++
            binding.count1.text = counter1.toString()
            vibrate(50)
        }
    }
    private fun item2() {
        var counter2 = 0
        binding.count2.text = counter2.toString()
        binding.btn2.setOnClickListener {
            counter2++
            binding.count2.text = counter2.toString()
            vibrate(50)
        }
    }
    private fun item3() {
        var counter3 = 0
        binding.count3.text = counter3.toString()
        binding.btn3.setOnClickListener {
            counter3++
            binding.count3.text = counter3.toString()
            vibrate(50)
        }
    }
    private fun item4() {
        var counter4 = 0
        binding.count4.text = counter4.toString()
        binding.btn4.setOnClickListener {
            counter4++
            binding.count4.text = counter4.toString()
            vibrate(50)
        }
    }
    private fun item5() {
        var counter5 = 0
        binding.count5.text = counter5.toString()
        binding.btn5.setOnClickListener {
            counter5++
            binding.count5.text = counter5.toString()
            vibrate(50)
        }
    }

    private fun item6() {
        var counter6 = 0
        binding.count6.text = counter6.toString()
        binding.btn6.setOnClickListener {
            counter6++
            binding.count6.text = counter6.toString()
            vibrate(50)
        }
    }

    private fun item7() {
        var counter7 = 0
        binding.count7.text = counter7.toString()
        binding.btn7.setOnClickListener {
            counter7++
            binding.count7.text = counter7.toString()
            vibrate(50)
        }
    }

    private fun item8() {
        var counter8 = 0
        binding.count8.text = counter8.toString()
        binding.btn8.setOnClickListener {
            counter8++
            binding.count8.text = counter8.toString()
            vibrate(50)
        }
    }

    private fun item9() {
        var counter9 = 0
        binding.count9.text = counter9.toString()
        binding.btn9.setOnClickListener {
            counter9++
            binding.count9.text = counter9.toString()
            vibrate(50)
        }
    }

    private fun item10() {
        var counter10 = 0
        binding.count10.text = counter10.toString()
        binding.btn10.setOnClickListener {
            counter10++
            binding.count10.text = counter10.toString()
            vibrate(50)
        }
    }

    private fun item11() {
        var counter11 = 0
        binding.count11.text = counter11.toString()
        binding.btn11.setOnClickListener {
            counter11++
            binding.count11.text = counter11.toString()
            vibrate(50)
        }
    }

    private fun item12() {
        var counter12 = 0
        binding.count12.text = counter12.toString()
        binding.btn12.setOnClickListener {
            counter12++
            binding.count12.text = counter12.toString()
            vibrate(50)
        }
    }

    private fun item13() {
        var counter13 = 0
        binding.count13.text = counter13.toString()
        binding.btn13.setOnClickListener {
            counter13++
            binding.count13.text = counter13.toString()
            vibrate(50)
        }
    }


    private fun AddText() {

        var t   = "سُبْحَانَ اللَّهِ"
        var t1  = "الْحَمْدُ للّهَِ"
        var t2  = "لَا إلَه إلّا اللهُ"
        var t3  = "لا حَوْلَ وَلا قُوَّةَ إِلا بِاللَّهِ"
        var t4  = "الْلَّهُ أَكْبرَ"
        var t5  = "لَا إلَه إلّا اللهُ وَحْدَهُ لَا شَرِيكَ لَهُ، لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلُّ شَيْءِ قَدِيرِ"
        var t6  = "أَسْتَغْفِرُ اللَّهَ الْعَظِيمِ وَأَتُوبُ إِلَيْهِ"
        var t7  = "اللَّهُمَّ صَلِّ وَسَلِّمْ عَلَى سَيِّدِنَا مُحَمَّدٍ"
        var t8  = "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ "
        var t9  = "سُبْحَانَ اللَّهِ وَبِحَمْدِهِ سُبْحَانَ اللَّهِ الْعَظِيمِ"
        var t10 = "سُبْحَانَ الْلَّهِ، وَالْحَمْدُ لِلَّهِ، وَلَا إِلَهَ إِلَّا الْلَّهُ، ولا حَوْلَ وَلا قُوَّةَ إِلا بِاللَّهِ ، وَالْلَّهُ أَكْبَرُ"
        var t11 = "حَسْبِي اللَّهُ وَنِعْمَ الوكبل"
        var t12 = "سُبْحَانَ اللهِ العَظِيمِ وَبِحَمْدِهِ"
        var t13 = "لَا إلَهَ إلَّا أَنْتَ سُبْحَانَكَ إِنِّي كُنْتُ مِنْ الظَّالِمِينَ"

        binding.text13.text = t13
        binding.text12.text = t12
        binding.text11.text = t11
        binding.text10.text = t10
        binding.text9.text = t9
        binding.text8.text = t8
        binding.text7.text = t7
        binding.text6.text = t6
        binding.text5.text = t5
        binding.text4.text = t4
        binding.text3.text = t3
        binding.text2.text = t2
        binding.text1.text = t1
        binding.text.text = t

    }
}