/*
*  Onboarding2Activity.kt
*  Onboarding-freebie
*
*  Created by ronnystudio.
*  Copyright © 2018 ronnystudio. All rights reserved.
*/

package com.ronnystudio.activity

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.PointF
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class Onboarding2Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, Onboarding2Activity::class.java)
		}
	}
	
	private lateinit var constraintLayoutConstraintLayout: ConstraintLayout
	private lateinit var gradientConstraintLayout: View
	private lateinit var nextButton: ImageButton
	private lateinit var skipButton: Button
	private lateinit var takeControlOfYourTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.onboarding2_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure  component
		constraintLayoutConstraintLayout = this.findViewById(R.id.constraint_layout_constraint_layout)
		constraintLayoutConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(1.06f, -0.07f), PointF(0.19f, 0.88f)).addStop(0f, Color.argb(255, 255, 179, 130)).addStop(1f, Color.argb(255, 240, 117, 144)).build()
		
		// Configure gradient component
		gradientConstraintLayout = this.findViewById(R.id.gradient_constraint_layout)
		gradientConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0.5f, 0.04f), PointF(0.5f, 0.97f)).addStop(0f, Color.argb(0, 245, 139, 139)).addStop(0.6f, Color.argb(255, 244, 136, 139)).addStop(1f, Color.argb(255, 244, 134, 141)).build()
		
		// Configure Next component
		nextButton = this.findViewById(R.id.next_button)
		nextButton.setOnClickListener({ view ->
			this.onNextPressed()
		})
		
		// Configure Skip component
		skipButton = this.findViewById(R.id.skip_button)
		skipButton.setOnClickListener({ view ->
			this.onSkipPressed()
		})
		
		// Configure Take control of your component
		takeControlOfYourTextView = this.findViewById(R.id.take_control_of_your_text_view)
	}
	
	fun onNextPressed() {
	
	}
	
	fun onSkipPressed() {
	
	}
}
