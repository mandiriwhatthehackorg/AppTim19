package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AccountAmountDetails(

	@field:SerializedName("totalOCPAmount")
	val totalOCPAmount: String? = null,

	@field:SerializedName("totalODOCAmount")
	val totalODOCAmount: String? = null,

	@field:SerializedName("totalSuspenseAmount")
	val totalSuspenseAmount: String? = null,

	@field:SerializedName("totalIBTAmount")
	val totalIBTAmount: String? = null,

	@field:SerializedName("totalOCAmount")
	val totalOCAmount: String? = null,

	@field:SerializedName("totalMCAmount")
	val totalMCAmount: String? = null,

	@field:SerializedName("holdAmount")
	val holdAmount: String? = null,

	@field:SerializedName("totalEXTRAAmount")
	val totalEXTRAAmount: String? = null,

	@field:SerializedName("totalLLCAmount")
	val totalLLCAmount: String? = null,

	@field:SerializedName("floatDrawingAmount")
	val floatDrawingAmount: String? = null
)