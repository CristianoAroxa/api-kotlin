package com.liberty.liberty_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "accounts")
data class Account(
    @Id @GeneratedValue
    var id: Long? = null,
    val name: String,
    val document: String,
    val phone: String

)