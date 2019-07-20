package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class BalanceInfo(

	@field:SerializedName("yesterdayLedgerBalance")
	val yesterdayLedgerBalance: String? = null,

	@field:SerializedName("previousStatementBalance")
	val previousStatementBalance: String? = null,

	@field:SerializedName("ledgerBalance")
	val ledgerBalance: String? = null,

	@field:SerializedName("minimumBalance")
	val minimumBalance: String? = null,

	@field:SerializedName("prevYearEndLedgerBalance")
	val prevYearEndLedgerBalance: String? = null,

	@field:SerializedName("maximumBalance")
	val maximumBalance: String? = null,

	@field:SerializedName("collectedBalance")
	val collectedBalance: String? = null
)