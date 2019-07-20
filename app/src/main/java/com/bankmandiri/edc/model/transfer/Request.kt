package com.bankmandiri.edc.model.transfer

import com.google.gson.annotations.SerializedName

data class Request(

	@field:SerializedName("beneficiaryCustType")
	var beneficiaryCustType: String? = null,

	@field:SerializedName("amount")
	var amount: String? = null,

	@field:SerializedName("beneficiaryAccountNumber")
	var beneficiaryAccountNumber: String? = null,

	@field:SerializedName("sourceAccountCustType")
	var sourceAccountCustType: String? = null,

	@field:SerializedName("currency")
	var currency: String? = null,

	@field:SerializedName("transactionDate")
	var transactionDate: String? = null,

	@field:SerializedName("remark1")
	var remark1: String? = null,

	@field:SerializedName("sourceAccountNumber")
	var sourceAccountNumber: String? = null,

	@field:SerializedName("transactionID")
	var transactionID: String? = null,

	@field:SerializedName("referenceID")
	var referenceID: String? = null,

	@field:SerializedName("remark2")
	var remark2: String? = null
)