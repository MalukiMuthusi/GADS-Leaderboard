package codes.malukimuthusi.gadsleaderboard.dataModels

data class LearningHours(
    val name: String = "",
    val hours: Int = 0,
    val country: String = "",
    val badgeUrl: String = ""
) {
}

data class IqScore(
    val name: String = "",
    val score: String = " ",
    val country: String = "",
    val badgeUrl: String = ""
)