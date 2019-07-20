package com.bankmandiri.edc.model.register

import com.google.gson.annotations.SerializedName

data class RegisterInitiateData(

	@field:SerializedName("viewName")
	val viewName: String? = null,

	@field:SerializedName("data")
	val data: RegisterInitiateData? = null,

	@field:SerializedName("token")
	val token: String? = null
)