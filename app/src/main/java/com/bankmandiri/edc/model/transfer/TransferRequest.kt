package com.bankmandiri.edc.model.transfer

import com.google.gson.annotations.SerializedName

data class TransferRequest(

	@field:SerializedName("Request")
	var request: Request? = null
)