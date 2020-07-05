/*
*  Onboarding3Activity.kt
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


class Onboarding3Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, Onboarding3Activity::class.java)
		}
	}
	
	private lateinit var signUpButton: Button
	private lateinit var loginButton: Button
	private lateinit var takeControlOfYourTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.onboarding3_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Sign up component
		signUpButton = this.findViewById(R.id.sign_up_button)
		signUpButton.setOnClickListener({ view ->
			this.onSignUpPressed()
		})
		
		// Configure Login component
		loginButton = this.findViewById(R.id.login_button)
		loginButton.setOnClickListener({ view ->
			this.onLoginPressed()
		})
		
		// Configure Take control of your component
		takeControlOfYourTextView = this.findViewById(R.id.take_control_of_your_text_view)
	}
	
	fun onSignUpPressed() {
	
	}
	
	fun onLoginPressed() {
	
	}
}
