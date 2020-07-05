/*
*  CreatePasscodeActivity.kt
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
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class CreatePasscodeActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, CreatePasscodeActivity::class.java)
		}
	}
	
	private lateinit var fondHugeRadiusFconstraintLayout: View
	private lateinit var fondGreengradMedConstraintLayout: View
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.create_passcode_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Fond / Huge-radius-f component
		fondHugeRadiusFconstraintLayout = this.findViewById(R.id.fond_huge_radius_fconstraint_layout)
		fondHugeRadiusFconstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(1f, 0f), PointF(0.07f, 0.96f)).cornerRadius(R.dimen.create_passcode_activity_fond_huge_radius_fconstraint_layout_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Fond / greenGrad-Med component
		fondGreengradMedConstraintLayout = this.findViewById(R.id.fond_greengrad_med_constraint_layout)
		fondGreengradMedConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(1f, 0f), PointF(0.07f, 0.96f)).cornerRadius(R.dimen.create_passcode_activity_fond_greengrad_med_constraint_layout_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
	}
}
