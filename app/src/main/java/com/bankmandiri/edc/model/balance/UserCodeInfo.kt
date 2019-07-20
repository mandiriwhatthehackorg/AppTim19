package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class UserCodeInfo(

	@field:SerializedName("userCode")
	val userCode: List<UserCodeItem?>? = null
)