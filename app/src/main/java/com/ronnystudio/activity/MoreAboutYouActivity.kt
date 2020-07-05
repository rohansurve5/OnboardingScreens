/*
*  MoreAboutYouActivity.kt
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
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class MoreAboutYouActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, MoreAboutYouActivity::class.java)
		}
	}
	
	private lateinit var continueButton: Button
	private lateinit var maybeLaterButton: Button
	private lateinit var graphicsBackArrowButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.more_about_you_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Continue component
		continueButton = this.findViewById(R.id.continue_button)
		continueButton.setOnClickListener({ view ->
			this.onContinuePressed()
		})
		continueButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.more_about_you_activity_continue_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Maybe-later component
		maybeLaterButton = this.findViewById(R.id.maybe_later_button)
		maybeLaterButton.setOnClickListener({ view ->
			this.onMaybeLaterPressed()
		})
		
		// Configure Graphics/back-arrow component
		graphicsBackArrowButton = this.findViewById(R.id.graphics_back_arrow_button)
		graphicsBackArrowButton.setOnClickListener({ view ->
			this.onGraphicsBackArrowPressed()
		})
	}
	
	fun onContinuePressed() {
	
	}
	
	fun onMaybeLaterPressed() {
	
	}
	
	fun onGraphicsBackArrowPressed() {
	
	}
}
