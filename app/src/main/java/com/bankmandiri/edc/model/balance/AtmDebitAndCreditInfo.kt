package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AtmDebitAndCreditInfo(

	@field:SerializedName("amtOfOnUsATMDebits")
	val amtOfOnUsATMDebits: String? = null,

	@field:SerializedName("noOfFrgnATMCredits")
	val noOfFrgnATMCredits: String? = null,

	@field:SerializedName("amtOfONusATMCredits")
	val amtOfONusATMCredits: String? = null,

	@field:SerializedName("noOfOnUsATMDebits")
	val noOfOnUsATMDebits: String? = null,

	@field:SerializedName("noOfFrgnATMDebits")
	val noOfFrgnATMDebits: String? = null,

	@field:SerializedName("noOfOnUsATMCredits")
	val noOfOnUsATMCredits: String? = null,

	@field:SerializedName("amtOfFrgnATMCredits")
	val amtOfFrgnATMCredits: String? = null,

	@field:SerializedName("amtOfFrgnATMDebits")
	val amtOfFrgnATMDebits: String? = null
)