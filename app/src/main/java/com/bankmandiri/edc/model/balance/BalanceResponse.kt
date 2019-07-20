package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class BalanceResponse(

	@field:SerializedName("Response")
	val response: Response? = null
)