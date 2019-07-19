package com.bankmandiri.edc.model

import com.google.gson.annotations.SerializedName

data class User(

	@field:SerializedName("error")
	var error: Boolean = false,

	@field:SerializedName("is_active")
	var isActive: Int? = null,

	@field:SerializedName("updated_at")
	var updatedAt: String? = null,

	@field:SerializedName("api_token")
	var apiToken: String? = null,

	@field:SerializedName("name")
	var name: String? = null,

	@field:SerializedName("created_at")
	var createdAt: String? = null,

	@field:SerializedName("avatar")
	var avatar: String? = null,

	@field:SerializedName("bio")
	var bio: String? = null,

	@field:SerializedName("id")
	var id: String? = null,

	@field:SerializedName("email")
	var email: String? = null
)