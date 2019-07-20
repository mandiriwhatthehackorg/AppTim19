package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class OverDraftCycleInfo(

	@field:SerializedName("timesODThisCycle")
	val timesODThisCycle: String? = null,

	@field:SerializedName("timesODThisQtr")
	val timesODThisQtr: String? = null,

	@field:SerializedName("timesOD3rdQtr")
	val timesOD3rdQtr: String? = null,

	@field:SerializedName("timesOD2ndQtr")
	val timesOD2ndQtr: String? = null,

	@field:SerializedName("timesOD4thQtr")
	val timesOD4thQtr: String? = null,

	@field:SerializedName("timesODLifeToDate")
	val timesODLifeToDate: String? = null,

	@field:SerializedName("timesODLastYear")
	val timesODLastYear: String? = null
)