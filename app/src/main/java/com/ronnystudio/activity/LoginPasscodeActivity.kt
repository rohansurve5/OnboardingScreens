/*
*  LoginPasscodeActivity.kt
*  Onboarding-freebie
*
*  Created by ronnystudio.
*  Copyright © 2018 ronnystudio. All rights reserved.
*/

package com.ronnystudio.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ronnystudio.R


class LoginPasscodeActivity: AppCompatActivity() {

	companion object {
		
		fun newIntent(context: Context): Intent {
		
			// Fill the created intent with the data you want to be passed to this Activity when it's opened.
			return Intent(context, LoginPasscodeActivity::class.java)
		}
	}
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
	
		super.onCreate(savedInstanceState)
		this.setContentView(R.layout.login_passcode_activity)
		this.init()
	}
	
	private fun init() {
	
	}
}
