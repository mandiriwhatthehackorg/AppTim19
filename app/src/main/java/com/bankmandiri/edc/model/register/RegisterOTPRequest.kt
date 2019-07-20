package com.bankmandiri.edc.model.register

import com.google.gson.annotations.SerializedName

data class RegisterOTPRequest(

	@field:SerializedName("otp")
	var otp: String? = null
)