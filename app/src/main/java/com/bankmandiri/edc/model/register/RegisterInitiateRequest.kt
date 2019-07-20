package com.bankmandiri.edc.model.register

import com.google.gson.annotations.SerializedName

data class RegisterInitiateRequest(

	@field:SerializedName("nik")
	var nik: String? = null,

	@field:SerializedName("phone")
	var phone: String? = null,

	@field:SerializedName("ttl")
	var ttl: String? = null,

	@field:SerializedName("email")
	var email: String? = null
)