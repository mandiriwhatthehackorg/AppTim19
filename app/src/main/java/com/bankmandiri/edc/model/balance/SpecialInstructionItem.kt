package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class SpecialInstructionItem(

	@field:SerializedName("siCode")
	val siCode: String? = null,

	@field:SerializedName("siValue")
	val siValue: String? = null
)