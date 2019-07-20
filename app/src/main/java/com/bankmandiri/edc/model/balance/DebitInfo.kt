package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class DebitInfo(

	@field:SerializedName("debitInfo")
	val debitInfo: List<DebitInfoItem?>? = null
)