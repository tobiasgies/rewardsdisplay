package de.tobiasgies.rewardsdisplay.model

import javax.money.MonetaryAmount

data class Challenge(
    val id: String,
    val name: String,
    val amount: MonetaryAmount,
    val totalAmountRaised: MonetaryAmount
)
