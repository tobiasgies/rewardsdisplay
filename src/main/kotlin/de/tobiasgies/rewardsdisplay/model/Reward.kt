package de.tobiasgies.rewardsdisplay.model

data class Reward(
    val id: String,
    val name: String,
    val quantity: Int,
    val remaining: Int
)
