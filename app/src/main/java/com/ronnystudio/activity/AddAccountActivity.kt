/*
*  AddAccountActivity.kt
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


class AddAccountActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, AddAccountActivity::class.java)
		}
	}
	
	private lateinit var continueButton: Button
	private lateinit var setupAcurrentBallTextView: TextView
	private lateinit var automaticallyImportTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.add_account_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Continue component
		continueButton = this.findViewById(R.id.continue_button)
		continueButton.setOnClickListener({ view ->
			this.onContinuePressed()
		})
		continueButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.add_account_activity_continue_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Setup a current ball component
		setupAcurrentBallTextView = this.findViewById(R.id.setup_acurrent_ball_text_view)
		
		// Configure Automatically import component
		automaticallyImportTextView = this.findViewById(R.id.automatically_import_text_view)
	}
	
	fun onContinuePressed() {
	
	}
}
