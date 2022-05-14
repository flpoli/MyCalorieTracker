package com.poli.tracker_domain.use_case

import com.poli.tracker_domain.model.TrackableFood
import com.poli.tracker_domain.model.TrackedFood
import com.poli.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class DeleteTrackedFood(

    private val repository: TrackerRepository
) {

    suspend operator fun invoke(

        food: TrackedFood

    ) {


        return repository.deleteTrackedFood(food)

    }

}