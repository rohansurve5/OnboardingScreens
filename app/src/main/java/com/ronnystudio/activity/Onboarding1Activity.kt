/*
*  Onboarding1Activity.kt
*  Onboarding-freebie
*
*  Created by ronnystudio.
*  Copyright © 2018 ronnystudio. All rights reserved.
*/

package com.ronnystudio.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R


class Onboarding1Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, Onboarding1Activity::class.java)
		}
	}
	
	private lateinit var nextButton: Button
	private lateinit var takeControlOfYourTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.onboarding1_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Next component
		nextButton = this.findViewById(R.id.next_button)
		nextButton.setOnClickListener({ view ->
			this.onNextPressed()
		})
		
		// Configure Take control of your component
		takeControlOfYourTextView = this.findViewById(R.id.take_control_of_your_text_view)
	}
	
	fun onNextPressed() {
	
	}
}
