/*
*  NoAccountActivity.kt
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
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class NoAccountActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, NoAccountActivity::class.java)
		}
	}
	
	private lateinit var ovalCopy3ConstraintLayout: View
	private lateinit var createAccountConstraintLayout: ConstraintLayout
	private lateinit var youDonThaveSetAtextView: TextView
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.no_account_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Oval Copy 3 component
		ovalCopy3ConstraintLayout = this.findViewById(R.id.oval_copy3_constraint_layout)
		ovalCopy3ConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0.5f, -0.07f), PointF(0.47f, 0.96f)).cornerRadius(R.dimen.no_account_activity_oval_copy3_constraint_layout_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure Create account component
		createAccountConstraintLayout = this.findViewById(R.id.create_account_constraint_layout)
		createAccountConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0f, 1f), PointF(0.89f, 0f)).cornerRadius(R.dimen.no_account_activity_create_account_constraint_layout_radius).addStop(0f, Color.argb(255, 126, 241, 146)).addStop(1f, Color.argb(255, 45, 200, 151)).build()
		
		// Configure You don’t have set a component
		youDonThaveSetAtextView = this.findViewById(R.id.you_don_thave_set_atext_view)
	}
}
