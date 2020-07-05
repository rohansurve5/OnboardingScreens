/*
*  SuccessfullAddedActivity.kt
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


class SuccessfullAddedActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, SuccessfullAddedActivity::class.java)
		}
	}
	
	private lateinit var doneButton: Button
	private lateinit var loremIpsumDollorStextView: TextView
	private lateinit var yourAccountHasBeeTextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.successfull_added_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Done component
		doneButton = this.findViewById(R.id.done_button)
		doneButton.setOnClickListener({ view ->
			this.onDonePressed()
		})
		doneButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.successfull_added_activity_done_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Lorem ipsum dollor s component
		loremIpsumDollorStextView = this.findViewById(R.id.lorem_ipsum_dollor_stext_view)
		
		// Configure Your account has bee component
		yourAccountHasBeeTextView = this.findViewById(R.id.your_account_has_bee_text_view)
	}
	
	fun onDonePressed() {
	
	}
}
