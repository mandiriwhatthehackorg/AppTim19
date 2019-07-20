package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class InterestInfo(

	@field:SerializedName("accruedODInterest")
	val accruedODInterest: String? = null,

	@field:SerializedName("ytdInterestPaid")
	val ytdInterestPaid: String? = null,

	@field:SerializedName("previousYTDInterestPaid")
	val previousYTDInterestPaid: String? = null,

	@field:SerializedName("accruedInterest")
	val accruedInterest: String? = null,

	@field:SerializedName("alternateAccruedInterest")
	val alternateAccruedInterest: String? = null,

	@field:SerializedName("amtOfLastIntPd")
	val amtOfLastIntPd: String? = null
)