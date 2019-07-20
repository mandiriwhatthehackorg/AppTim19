package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class NsfCycleInfo(

	@field:SerializedName("noNSFThisQtr")
	val noNSFThisQtr: String? = null,

	@field:SerializedName("noNSthQtr")
	val noNSthQtr: String? = null,

	@field:SerializedName("noNSFThisCycle")
	val noNSFThisCycle: String? = null,

	@field:SerializedName("noNSF3rdQtr")
	val noNSF3rdQtr: String? = null,

	@field:SerializedName("noNSFLastYear")
	val noNSFLastYear: String? = null,

	@field:SerializedName("noNSFLifeToDate")
	val noNSFLifeToDate: String? = null,

	@field:SerializedName("noNSF2ndQtr")
	val noNSF2ndQtr: String? = null
)