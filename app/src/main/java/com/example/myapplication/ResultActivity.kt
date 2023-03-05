package com.example.myapplication

import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityResultBinding
import kotlin.math.pow

class ResultActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityResultBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val height = intent.getFloatExtra("height", 0f)
        val weight = intent.getFloatExtra("weight", 0f)


        val bmi = weight / (height / 100.0f).pow(2.0f)


        when {
            bmi >= 35 -> binding.resultTextView.text = Editable.Factory.getInstance().newEditable("고도비만")
            bmi >= 30 -> binding.resultTextView.text = Editable.Factory.getInstance().newEditable("2단계 비만")
            bmi >= 25 -> binding.resultTextView.text = Editable.Factory.getInstance().newEditable("1단계 비만")
            bmi >= 23 -> binding.resultTextView.text = Editable.Factory.getInstance().newEditable("과체중")
            bmi >= 18.5 -> binding.resultTextView.text = Editable.Factory.getInstance().newEditable("정상")
            else -> binding.resultTextView.text = Editable.Factory.getInstance().newEditable("저체중")
        }

        when {
            bmi >= 23 -> binding.imageView.setImageResource(
                R.drawable.baseline_sentiment_very_dissatisfied_24)

            bmi >= 18.5 -> binding.imageView.setImageResource(
                R.drawable.baseline_sentiment_satisfied_alt_24)

            else -> binding.imageView.setImageResource(
                R.drawable.baseline_sentiment_dissatisfied_24)
        }


    }
}