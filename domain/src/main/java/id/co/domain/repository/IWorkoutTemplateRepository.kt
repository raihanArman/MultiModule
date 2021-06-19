package id.co.domain.repository

import id.co.domain.ResultWrapper
import id.co.domain.model.WorkoutTemplate

interface IWorkoutTemplateRepository {
    fun getWorkoutTemplates(getCustom: Boolean): ResultWrapper<Exception, List<WorkoutTemplate>>
    fun deleteWorkoutTemplate(id: Int): ResultWrapper<Exception, Unit>
    fun updateWorkoutTemplate(template: WorkoutTemplate): ResultWrapper<Exception, Unit>
}