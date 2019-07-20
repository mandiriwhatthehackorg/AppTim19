package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class CreditInfo(

	@field:SerializedName("creditInfo")
	val creditInfo: List<CreditInfoItem?>? = null
)