package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AccountRateInfo(

	@field:SerializedName("interestRate")
	val interestRate: String? = null,

	@field:SerializedName("rateReviewTermCode")
	val rateReviewTermCode: String? = null,

	@field:SerializedName("rateCeiling")
	val rateCeiling: String? = null,

	@field:SerializedName("odRateFloor")
	val odRateFloor: String? = null,

	@field:SerializedName("rateFloor")
	val rateFloor: String? = null,

	@field:SerializedName("odRateVariance")
	val odRateVariance: String? = null,

	@field:SerializedName("rateReviewTerm")
	val rateReviewTerm: String? = null,

	@field:SerializedName("rateReviewDate")
	val rateReviewDate: String? = null,

	@field:SerializedName("odInterestRate")
	val odInterestRate: String? = null,

	@field:SerializedName("odRateVarianceCode")
	val odRateVarianceCode: String? = null,

	@field:SerializedName("odRateReviewTerm")
	val odRateReviewTerm: String? = null,

	@field:SerializedName("acctTierRateNumber")
	val acctTierRateNumber: String? = null,

	@field:SerializedName("odRateReviewTermCode")
	val odRateReviewTermCode: String? = null,

	@field:SerializedName("rateVariance")
	val rateVariance: String? = null,

	@field:SerializedName("rateVarianceCode")
	val rateVarianceCode: String? = null,

	@field:SerializedName("odRateCeiling")
	val odRateCeiling: String? = null,

	@field:SerializedName("odRateReviewDate")
	val odRateReviewDate: String? = null
)