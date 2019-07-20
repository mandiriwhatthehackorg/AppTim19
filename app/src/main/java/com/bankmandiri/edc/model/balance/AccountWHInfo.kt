package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class AccountWHInfo(

	@field:SerializedName("federalWHMTD")
	val federalWHMTD: String? = null,

	@field:SerializedName("fedWHAlternateRate")
	val fedWHAlternateRate: String? = null,

	@field:SerializedName("federalWHCode")
	val federalWHCode: String? = null,

	@field:SerializedName("federalWHLastYear")
	val federalWHLastYear: String? = null,

	@field:SerializedName("fedWHToday")
	val fedWHToday: String? = null,

	@field:SerializedName("stateWHAlternateRate")
	val stateWHAlternateRate: String? = null,

	@field:SerializedName("stateWHYTD")
	val stateWHYTD: String? = null,

	@field:SerializedName("stateWHMTD")
	val stateWHMTD: String? = null,

	@field:SerializedName("stateWHCode")
	val stateWHCode: String? = null,

	@field:SerializedName("alternateAccountNo")
	val alternateAccountNo: String? = null,

	@field:SerializedName("stateWHQTD")
	val stateWHQTD: String? = null,

	@field:SerializedName("stateWHToday")
	val stateWHToday: String? = null,

	@field:SerializedName("stateWHLastYear")
	val stateWHLastYear: String? = null,

	@field:SerializedName("federalWHYTD")
	val federalWHYTD: String? = null,

	@field:SerializedName("alternateAccountType")
	val alternateAccountType: String? = null,

	@field:SerializedName("state")
	val state: String? = null,

	@field:SerializedName("dateWHCodeChanged")
	val dateWHCodeChanged: String? = null,

	@field:SerializedName("federalWHQTD")
	val federalWHQTD: String? = null
)