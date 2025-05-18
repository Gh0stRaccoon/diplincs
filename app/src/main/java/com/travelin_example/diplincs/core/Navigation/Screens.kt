package com.travelin_example.diplincs.core.Navigation

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detail(val name: String)