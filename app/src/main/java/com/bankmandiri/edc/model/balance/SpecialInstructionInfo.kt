package com.bankmandiri.edc.model.balance

import com.google.gson.annotations.SerializedName

data class SpecialInstructionInfo(

	@field:SerializedName("specialInstruction")
	val specialInstruction: List<SpecialInstructionItem?>? = null
)