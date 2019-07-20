package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("balance")
	val balance: Balance? = null,

	@field:SerializedName("Exception")
	val exception: Exception? = null
)