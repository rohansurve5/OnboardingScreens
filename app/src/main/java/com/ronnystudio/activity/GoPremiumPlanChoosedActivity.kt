/*
*  GoPremiumPlanChoosedActivity.kt
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


class GoPremiumPlanChoosedActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, GoPremiumPlanChoosedActivity::class.java)
		}
	}
	
	private lateinit var constraintLayoutConstraintLayout: ConstraintLayout
	private lateinit var questionsReadTheButton: Button
	private lateinit var btnCtaGreenButton: Button
	private lateinit var aeneanUltriciesMiTextView: TextView
	private lateinit var aeneanUltriciesMiTwoTextView: TextView
	private lateinit var aeneanUltriciesMiThreeTextView: TextView
	private lateinit var namNullaQuamGravTextView: TextView
	private lateinit var annualTextView: TextView
	private lateinit var monthlyTextView: TextView
	private lateinit var startYour30DayFrTextView: TextView
	private lateinit var graphicsBackArrowButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.go_premium_plan_choosed_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure  component
		constraintLayoutConstraintLayout = this.findViewById(R.id.constraint_layout_constraint_layout)
		constraintLayoutConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(1.06f, -0.07f), PointF(0.19f, 0.88f)).addStop(0f, Color.argb(255, 255, 179, 130)).addStop(1f, Color.argb(255, 240, 117, 144)).build()
		
		// Configure Questions? Read the component
		questionsReadTheButton = this.findViewById(R.id.questions_read_the_button)
		questionsReadTheButton.setOnClickListener({ view ->
			this.onQuestionsReadThePressed()
		})
		
		// Configure Btn / cta-green component
		btnCtaGreenButton = this.findViewById(R.id.btn_cta_green_button)
		btnCtaGreenButton.setOnClickListener({ view ->
			this.onBtnCtaGreenPressed()
		})
		btnCtaGreenButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.go_premium_plan_choosed_activity_btn_cta_green_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Aenean ultricies mi component
		aeneanUltriciesMiTextView = this.findViewById(R.id.aenean_ultricies_mi_text_view)
		
		// Configure Aenean ultricies mi component
		aeneanUltriciesMiTwoTextView = this.findViewById(R.id.aenean_ultricies_mi_two_text_view)
		
		// Configure Aenean ultricies mi component
		aeneanUltriciesMiThreeTextView = this.findViewById(R.id.aenean_ultricies_mi_three_text_view)
		
		// Configure Nam nulla quam, grav component
		namNullaQuamGravTextView = this.findViewById(R.id.nam_nulla_quam_grav_text_view)
		
		// Configure annual component
		annualTextView = this.findViewById(R.id.annual_text_view)
		
		// Configure monthly component
		monthlyTextView = this.findViewById(R.id.monthly_text_view)
		
		// Configure Start your 30 day fr component
		startYour30DayFrTextView = this.findViewById(R.id.start_your30_day_fr_text_view)
		
		// Configure Graphics/Back-arrow- component
		graphicsBackArrowButton = this.findViewById(R.id.graphics_back_arrow_button)
		graphicsBackArrowButton.setOnClickListener({ view ->
			this.onGraphicsBackArrowPressed()
		})
	}
	
	fun onQuestionsReadThePressed() {
	
	}
	
	fun onBtnCtaGreenPressed() {
	
	}
	
	fun onGraphicsBackArrowPressed() {
	
	}
}
