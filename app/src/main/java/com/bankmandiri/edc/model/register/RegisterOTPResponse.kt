package com.bankmandiri.edc.model.register

import com.google.gson.annotations.SerializedName

data class RegisterOTPResponse(

	@field:SerializedName("data")
	val data: RegisterOTPData? = null,

	@field:SerializedName("success")
	val success: Boolean? = null
)