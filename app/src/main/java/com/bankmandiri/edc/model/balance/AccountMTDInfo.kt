package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AccountMTDInfo(

	@field:SerializedName("mtdBeginningAccrual")
	val mtdBeginningAccrual: String? = null,

	@field:SerializedName("mtdAggregateBalance")
	val mtdAggregateBalance: String? = null,

	@field:SerializedName("mtdReturnedDebitAmount")
	val mtdReturnedDebitAmount: String? = null,

	@field:SerializedName("mtdReturnedDebitCount")
	val mtdReturnedDebitCount: String? = null,

	@field:SerializedName("mtdODInterestCharged")
	val mtdODInterestCharged: String? = null,

	@field:SerializedName("mtdReturnedCreditCount")
	val mtdReturnedCreditCount: String? = null,

	@field:SerializedName("mtdServiceCharge")
	val mtdServiceCharge: String? = null,

	@field:SerializedName("mtdFeesPaid")
	val mtdFeesPaid: String? = null,

	@field:SerializedName("mtdReturnedCreditAmount")
	val mtdReturnedCreditAmount: String? = null,

	@field:SerializedName("mtdInterestPaid")
	val mtdInterestPaid: String? = null,

	@field:SerializedName("mtdAggregateDays")
	val mtdAggregateDays: String? = null
)