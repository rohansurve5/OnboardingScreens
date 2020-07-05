/*
*  OneLastThingActivity.kt
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
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class OneLastThingActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, OneLastThingActivity::class.java)
		}
	}
	
	private lateinit var graphicsBackArrowButton: ImageButton
	private lateinit var loremIpsumDolorSiTextView: TextView
	private lateinit var rectangleConstraintLayout: View
	private lateinit var declineCopyButton: Button
	private lateinit var agreeButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.one_last_thing_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Graphics/back-arrow component
		graphicsBackArrowButton = this.findViewById(R.id.graphics_back_arrow_button)
		graphicsBackArrowButton.setOnClickListener({ view ->
			this.onGraphicsBackArrowPressed()
		})
		
		// Configure Lorem ipsum dolor si component
		loremIpsumDolorSiTextView = this.findViewById(R.id.lorem_ipsum_dolor_si_text_view)
		
		// Configure Rectangle component
		rectangleConstraintLayout = this.findViewById(R.id.rectangle_constraint_layout)
		rectangleConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0.48f, -0.13f), PointF(0.48f, 1f)).cornerRadius(R.dimen.one_last_thing_activity_rectangle_constraint_layout_radius).addStop(0f, Color.argb(118, 252, 252, 255)).addStop(1f, Color.argb(255, 252, 252, 255)).build()
		
		// Configure Decline Copy component
		declineCopyButton = this.findViewById(R.id.decline_copy_button)
		declineCopyButton.setOnClickListener({ view ->
			this.onDeclineCopyPressed()
		})
		declineCopyButton.background = LinearGradientDrawable.Builder(this, PointF(0.92f, 0.15f), PointF(0.09f, 0.85f)).cornerRadius(R.dimen.one_last_thing_activity_decline_copy_button_radius).addStop(0f, Color.argb(255, 235, 101, 141)).addStop(1f, Color.argb(255, 248, 121, 143)).build()
		
		// Configure Agree component
		agreeButton = this.findViewById(R.id.agree_button)
		agreeButton.setOnClickListener({ view ->
			this.onAgreePressed()
		})
		agreeButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.one_last_thing_activity_agree_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
	}
	
	fun onGraphicsBackArrowPressed() {
	
	}
	
	fun onDeclineCopyPressed() {
	
	}
	
	fun onAgreePressed() {
	
	}
}
