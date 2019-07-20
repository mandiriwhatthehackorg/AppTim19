package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class DebitInfoItem(

	@field:SerializedName("debitValue")
	val debitValue: String? = null,

	@field:SerializedName("debitName")
	val debitName: String? = null
)