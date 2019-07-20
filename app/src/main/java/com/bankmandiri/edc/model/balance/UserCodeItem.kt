package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class UserCodeItem(

	@field:SerializedName("code")
	val code: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)