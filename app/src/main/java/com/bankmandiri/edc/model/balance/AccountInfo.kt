package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AccountInfo(

	@field:SerializedName("accountGroupNumber")
	val accountGroupNumber: String? = null,

	@field:SerializedName("currencyType")
	val currencyType: String? = null,

	@field:SerializedName("aliasName")
	val aliasName: String? = null,

	@field:SerializedName("cifNumber")
	val cifNumber: String? = null,

	@field:SerializedName("closeStatus")
	val closeStatus: String? = null,

	@field:SerializedName("glGroupCode")
	val glGroupCode: String? = null,

	@field:SerializedName("currencyDecimals")
	val currencyDecimals: String? = null,

	@field:SerializedName("branchNumber")
	val branchNumber: String? = null,

	@field:SerializedName("officer")
	val officer: String? = null,

	@field:SerializedName("shortName")
	val shortName: String? = null,

	@field:SerializedName("additionalName")
	val additionalName: String? = null,

	@field:SerializedName("class")
	val jsonMemberClass: String? = null,

	@field:SerializedName("alternateAddress")
	val alternateAddress: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)