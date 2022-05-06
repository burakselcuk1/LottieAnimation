package com.example.lottietwo

import android.animation.Animator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anim = findViewById<LottieAnimationView>(R.id.burak)

        Handler(Looper.getMainLooper()).postDelayed({
        anim.playAnimation()
        },2000)

        anim.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(p0: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationCancel(p0: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(p0: Animator?) {
                TODO("Not yet implemented")
            }

        })
    }
}