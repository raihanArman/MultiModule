package id.co.domain.model

import id.co.domain.enums.ExerciseTarget
import id.co.domain.enums.ExerciseType

data class ExerciseTemplate (
    val name: String,
    val targets: List<ExerciseTarget>,
    val isCustom: Boolean,
    val type: ExerciseType
)