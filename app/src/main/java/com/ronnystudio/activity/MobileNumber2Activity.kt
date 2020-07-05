/*
*  MobileNumber2Activity.kt
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
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R


class MobileNumber2Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, MobileNumber2Activity::class.java)
		}
	}
	
	private lateinit var graphicsBackArrowButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.mobile_number2_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Graphics/back-arrow component
		graphicsBackArrowButton = this.findViewById(R.id.graphics_back_arrow_button)
		graphicsBackArrowButton.setOnClickListener({ view ->
			this.onGraphicsBackArrowPressed()
		})
	}
	
	fun onGraphicsBackArrowPressed() {
	
	}
}
