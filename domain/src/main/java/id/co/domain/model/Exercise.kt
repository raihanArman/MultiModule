package id.co.domain.model

import id.co.domain.enums.ExerciseType

data class Exercise (
    val name: String,
    val sets: List<Set>,
    val type: ExerciseType
)