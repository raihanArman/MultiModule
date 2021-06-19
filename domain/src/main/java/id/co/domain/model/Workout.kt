package id.co.domain.model

data class Workout (
    val name: String,
    val createOn: String,
    val exercies: List<Exercise>
)