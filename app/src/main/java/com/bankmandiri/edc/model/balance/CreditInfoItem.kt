package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class CreditInfoItem(

	@field:SerializedName("creditValue")
	val creditValue: String? = null,

	@field:SerializedName("creditName")
	val creditName: String? = null
)