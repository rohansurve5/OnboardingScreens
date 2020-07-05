/*
*  GoPremiumChoosingPlanActivity.kt
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
import androidx.constraintlayout.widget.ConstraintLayout
import com.ronnystudio.R
import io.supernova.uitoolkit.drawable.LinearGradientDrawable


class GoPremiumChoosingPlanActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, GoPremiumChoosingPlanActivity::class.java)
		}
	}
	
	private lateinit var marriedConstraintLayout: ConstraintLayout
	private lateinit var pathButton: ImageButton
	private lateinit var utEnimAdMinimVenTextView: TextView
	private lateinit var marriedTextView: TextView
	private lateinit var marriedWithChildreConstraintLayout: ConstraintLayout
	private lateinit var pathTwoButton: ImageButton
	private lateinit var utEnimAdMinimVenTwoTextView: TextView
	private lateinit var marriedWithChildreTextView: TextView
	private lateinit var goPremiumButton: Button
	private lateinit var bachelorConstraintLayout: ConstraintLayout
	private lateinit var pathThreeButton: ImageButton
	private lateinit var utEnimAdMinimVenThreeTextView: TextView
	private lateinit var bachelorTextView: TextView
	private lateinit var cancelButton: Button
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.go_premium_choosing_plan_activity)
		this.init()
	}
	
	private fun init() {
	
		// Configure Married component
		marriedConstraintLayout = this.findViewById(R.id.married_constraint_layout)
		marriedConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(0.95f, 0.07f), PointF(0.07f, 0.97f)).cornerRadius(R.dimen.go_premium_choosing_plan_activity_married_constraint_layout_radius).addStop(0f, Color.argb(255, 255, 211, 135)).addStop(1f, Color.argb(255, 255, 162, 107)).build()
		
		// Configure Path component
		pathButton = this.findViewById(R.id.path_button)
		pathButton.setOnClickListener({ view ->
			this.onPathPressed()
		})
		
		// Configure Ut enim ad minim ven component
		utEnimAdMinimVenTextView = this.findViewById(R.id.ut_enim_ad_minim_ven_text_view)
		
		// Configure married component
		marriedTextView = this.findViewById(R.id.married_text_view)
		
		// Configure Married with childre component
		marriedWithChildreConstraintLayout = this.findViewById(R.id.married_with_childre_constraint_layout)
		marriedWithChildreConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(1f, 0f), PointF(0.02f, 0.96f)).cornerRadius(R.dimen.go_premium_choosing_plan_activity_married_with_childre_constraint_layout_radius).addStop(0f, Color.argb(255, 233, 176, 255)).addStop(1f, Color.argb(255, 138, 99, 229)).build()
		
		// Configure Path component
		pathTwoButton = this.findViewById(R.id.path_two_button)
		pathTwoButton.setOnClickListener({ view ->
			this.onPathTwoPressed()
		})
		
		// Configure Ut enim ad minim ven component
		utEnimAdMinimVenTwoTextView = this.findViewById(R.id.ut_enim_ad_minim_ven_two_text_view)
		
		// Configure married with childre component
		marriedWithChildreTextView = this.findViewById(R.id.married_with_childre_text_view)
		
		// Configure Go premium component
		goPremiumButton = this.findViewById(R.id.go_premium_button)
		goPremiumButton.setOnClickListener({ view ->
			this.onGoPremiumPressed()
		})
		goPremiumButton.background = LinearGradientDrawable.Builder(this, PointF(0.01f, 0.45f), PointF(1f, 0.45f)).cornerRadius(R.dimen.go_premium_choosing_plan_activity_go_premium_button_radius).addStop(0f, Color.argb(255, 109, 227, 129)).addStop(1f, Color.argb(255, 49, 209, 158)).build()
		
		// Configure Bachelor component
		bachelorConstraintLayout = this.findViewById(R.id.bachelor_constraint_layout)
		bachelorConstraintLayout.background = LinearGradientDrawable.Builder(this, PointF(1.06f, -0.07f), PointF(0.19f, 0.88f)).cornerRadius(R.dimen.go_premium_choosing_plan_activity_bachelor_constraint_layout_radius).addStop(0f, Color.argb(255, 255, 179, 130)).addStop(1f, Color.argb(255, 240, 117, 144)).build()
		
		// Configure Path component
		pathThreeButton = this.findViewById(R.id.path_three_button)
		pathThreeButton.setOnClickListener({ view ->
			this.onPathThreePressed()
		})
		
		// Configure Ut enim ad minim ven component
		utEnimAdMinimVenThreeTextView = this.findViewById(R.id.ut_enim_ad_minim_ven_three_text_view)
		
		// Configure bachelor component
		bachelorTextView = this.findViewById(R.id.bachelor_text_view)
		
		// Configure Cancel component
		cancelButton = this.findViewById(R.id.cancel_button)
		cancelButton.setOnClickListener({ view ->
			this.onCancelPressed()
		})
	}
	
	fun onPathPressed() {
	
	}
	
	fun onPathTwoPressed() {
	
	}
	
	fun onGoPremiumPressed() {
	
	}
	
	fun onPathThreePressed() {
	
	}
	
	fun onCancelPressed() {
	
	}
}
