package com.bankmandiri.edc.model.register

import com.google.gson.annotations.SerializedName

data class RegisterOTPData(

	@field:SerializedName("viewName")
	val viewName: String? = null,

	@field:SerializedName("token")
	val token: String? = null
)