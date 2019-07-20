package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AggregateBalanceInfo(

	@field:SerializedName("averageCollectedBalancePriorFourthQtr")
	val averageCollectedBalancePriorFourthQtr: String? = null,

	@field:SerializedName("averageLedgerBalancePriorFourthQtr")
	val averageLedgerBalancePriorFourthQtr: String? = null,

	@field:SerializedName("averageCollectedBalancePriorSecondQtr")
	val averageCollectedBalancePriorSecondQtr: String? = null,

	@field:SerializedName("aggregateDaysThisQtr")
	val aggregateDaysThisQtr: String? = null,

	@field:SerializedName("aggregateCollectedBalanceThisQtr")
	val aggregateCollectedBalanceThisQtr: String? = null,

	@field:SerializedName("averageCollectedBalancePriorFirstQtr")
	val averageCollectedBalancePriorFirstQtr: String? = null,

	@field:SerializedName("aggregateLedgerBalanceThisQtr")
	val aggregateLedgerBalanceThisQtr: String? = null,

	@field:SerializedName("averageCollectedBalancePriorThirdQtr")
	val averageCollectedBalancePriorThirdQtr: String? = null,

	@field:SerializedName("averageLedgerBalancePriorThirdQtr")
	val averageLedgerBalancePriorThirdQtr: String? = null,

	@field:SerializedName("averageLedgerBalancePriorSecondQtr")
	val averageLedgerBalancePriorSecondQtr: String? = null,

	@field:SerializedName("averageLedgerBalancePriorFirstQtr")
	val averageLedgerBalancePriorFirstQtr: String? = null
)