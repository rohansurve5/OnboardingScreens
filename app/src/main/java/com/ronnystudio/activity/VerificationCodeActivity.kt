/*
*  VerificationCodeActivity.kt
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


class VerificationCodeActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, VerificationCodeActivity::class.java)
		}
	}
	
	private lateinit var resendButton: Button
	private lateinit var ifYouDonTreceiveTextView: TextView
	private lateinit var pleaseEnterThe4DtextView: TextView
	private lateinit var graphicsBackArrowButton: ImageButton
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.verification_code_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Resend component
		resendButton = this.findViewById(R.id.resend_button)
		resendButton.setOnClickListener({ view ->
			this.onResendPressed()
		})
		resendButton.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.verification_code_activity_resend_button_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure If you don’t receive component
		ifYouDonTreceiveTextView = this.findViewById(R.id.if_you_don_treceive_text_view)
		
		// Configure Please enter the 4-d component
		pleaseEnterThe4DtextView = this.findViewById(R.id.please_enter_the4_dtext_view)
		
		// Configure Graphics/back-arrow component
		graphicsBackArrowButton = this.findViewById(R.id.graphics_back_arrow_button)
		graphicsBackArrowButton.setOnClickListener({ view ->
			this.onGraphicsBackArrowPressed()
		})
	}
	
	fun onResendPressed() {
	
	}
	
	fun onGraphicsBackArrowPressed() {
	
	}
}
