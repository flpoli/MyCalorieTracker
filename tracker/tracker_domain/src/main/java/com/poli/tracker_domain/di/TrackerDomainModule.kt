package com.poli.tracker_domain.di

import com.poli.core.domain.preferences.Preferences
import com.poli.tracker_domain.model.TrackedFood
import com.poli.tracker_domain.repository.TrackerRepository
import com.poli.tracker_domain.use_case.CalculateMealNutrients
import com.poli.tracker_domain.use_case.DeleteTrackedFood
import com.poli.tracker_domain.use_case.GetFoodForDate
import com.poli.tracker_domain.use_case.SearchFood
import com.poli.tracker_domain.use_case.TrackFood
import com.poli.tracker_domain.use_case.TrackerUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn(ViewModelComponent::class)
object TrackerDomainModule {


    @Provides
    @ViewModelScoped
    fun provideTrackerUseCases(repository: TrackerRepository, preferences: Preferences): TrackerUseCases {

        return TrackerUseCases(
            trackFood = TrackFood(repository),
            searchFood = SearchFood(repository),
            getFoodsForDate = GetFoodForDate(repository),
            deleteTrackedFood = DeleteTrackedFood(repository),
            calculateMealNutrients = CalculateMealNutrients(preferences),
        )

    }
}