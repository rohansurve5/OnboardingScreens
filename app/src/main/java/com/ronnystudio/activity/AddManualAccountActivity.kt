/*
*  AddManualAccountActivity.kt
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
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class AddManualAccountActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, AddManualAccountActivity::class.java)
		}
	}
	
	private lateinit var fondGreengradStrConstraintLayout: View
	private lateinit var graphicsBackArrowButton: ImageButton
	private lateinit var addButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.add_manual_account_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Fond / greenGrad-str component
		fondGreengradStrConstraintLayout = this.findViewById(R.id.fond_greengrad_str_constraint_layout)
		fondGreengradStrConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0.86f, 0.18f), PointF(0.23f, 0.91f)).addStop(0f, Color.argb(255, 255, 177, 177)).addStop(1f, Color.argb(255, 235, 106, 159)).build()
		
		// Configure Graphics/Back-arrow- component
		graphicsBackArrowButton = this.findViewById(R.id.graphics_back_arrow_button)
		graphicsBackArrowButton.setOnClickListener({ view ->
			this.onGraphicsBackArrowPressed()
		})
		
		// Configure Add component
		addButton = this.findViewById(R.id.add_button)
		addButton.setOnClickListener({ view ->
			this.onAddPressed()
		})
		addButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.add_manual_account_activity_add_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
	}
	
	fun onGraphicsBackArrowPressed() {
	
	}
	
	fun onAddPressed() {
	
	}
}
