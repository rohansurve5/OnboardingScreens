/*
*  Onboarding6Activity.kt
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
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class Onboarding6Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, Onboarding6Activity::class.java)
		}
	}
	
	private lateinit var getStartedButton: Button
	private lateinit var planAheadYourExpeTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.onboarding6_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Get started component
		getStartedButton = this.findViewById(R.id.get_started_button)
		getStartedButton.setOnClickListener({ view ->
			this.onGetStartedPressed()
		})
		getStartedButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.onboarding6_activity_get_started_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Plan ahead your expe component
		planAheadYourExpeTextView = this.findViewById(R.id.plan_ahead_your_expe_text_view)
	}
	
	fun onGetStartedPressed() {
	
	}
}
