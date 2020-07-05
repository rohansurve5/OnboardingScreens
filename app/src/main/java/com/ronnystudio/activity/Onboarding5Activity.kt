/*
*  Onboarding5Activity.kt
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


class Onboarding5Activity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, Onboarding5Activity::class.java)
		}
	}
	
	private lateinit var signUpButton: Button
	private lateinit var signUpCopyButton: Button
	private lateinit var loginButton: Button
	private lateinit var alreadyHaveAnAccoButton: Button
	private lateinit var getTheLifeYouWanTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.onboarding5_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Sign up component
		signUpButton = this.findViewById(R.id.sign_up_button)
		signUpButton.setOnClickListener({ view ->
			this.onSignUpPressed()
		})
		signUpButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.onboarding5_activity_sign_up_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Sign up Copy component
		signUpCopyButton = this.findViewById(R.id.sign_up_copy_button)
		signUpCopyButton.setOnClickListener({ view ->
			this.onSignUpCopyPressed()
		})
		
		// Configure Login component
		loginButton = this.findViewById(R.id.login_button)
		loginButton.setOnClickListener({ view ->
			this.onLoginPressed()
		})
		
		// Configure Already have an acco component
		alreadyHaveAnAccoButton = this.findViewById(R.id.already_have_an_acco_button)
		alreadyHaveAnAccoButton.setOnClickListener({ view ->
			this.onAlreadyHaveAnAccoPressed()
		})
		
		// Configure Get the life you wan component
		getTheLifeYouWanTextView = this.findViewById(R.id.get_the_life_you_wan_text_view)
	}
	
	fun onSignUpPressed() {
	
	}
	
	fun onSignUpCopyPressed() {
	
	}
	
	fun onLoginPressed() {
	
	}
	
	fun onAlreadyHaveAnAccoPressed() {
	
	}
}
