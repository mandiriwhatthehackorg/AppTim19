package com.bankmandiri.edc.model.register

import com.google.gson.annotations.SerializedName

data class RegisterInitateResponse(

	@field:SerializedName("data")
	val data: RegisterInitiateData? = null,

	@field:SerializedName("success")
	val success: Boolean? = null,

	@field:SerializedName("message")
	val message: String? = null
)