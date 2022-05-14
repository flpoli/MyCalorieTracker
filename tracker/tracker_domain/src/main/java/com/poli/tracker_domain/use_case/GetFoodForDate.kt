package com.poli.tracker_domain.use_case

import com.poli.tracker_domain.model.TrackableFood
import com.poli.tracker_domain.model.TrackedFood
import com.poli.tracker_domain.repository.TrackerRepository
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

class GetFoodForDate(

    private val repository: TrackerRepository
) {

    operator fun invoke(

        date: LocalDate

    ): Flow<List<TrackedFood>> {


        return repository.getFoodsForData(date)

    }

}