package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class Exception(

	@field:SerializedName("status")
	val status: String? = null
)