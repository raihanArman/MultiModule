package id.co.domain.repository

import id.co.domain.ResultWrapper
import id.co.domain.model.Workout
import id.co.domain.util.DateRange

interface IWorkoutRepository {
    fun getWorkoutByDay(date: String, selection: DateRange): ResultWrapper<Exception, List<Workout>>
    fun updateWorkout(workout: Workout): ResultWrapper<Exception, Unit>
    fun deleteWorkout(creationDateId: String): ResultWrapper<Exception, Unit>

}