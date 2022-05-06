package de.tobiasgies.rewardsdisplay.model

data class RewardsState(
    val oneSkullReward: Reward,
    val twoSkullsReward: Reward,
    val threeSkullsReward: Reward,
    val fiveSkullsReward: Reward,
    val tenSkullsReward: Reward,
    val allDungeonsChallenge: Challenge
) {
    val totalNumberOfSkulls: Int = TODO()
}