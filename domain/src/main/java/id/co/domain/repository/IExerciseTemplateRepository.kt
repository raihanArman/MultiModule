package id.co.domain.repository

import id.co.domain.ResultWrapper
import id.co.domain.model.ExerciseTemplate

interface IExerciseTemplateRepository {
    fun getExerciseTemplatesByFilter(filter: String, isCustom: Boolean): ResultWrapper<Exception, List<ExerciseTemplate>>
    fun updateExerciseTemplate(template: ExerciseTemplate): ResultWrapper<Exception, Unit>
}