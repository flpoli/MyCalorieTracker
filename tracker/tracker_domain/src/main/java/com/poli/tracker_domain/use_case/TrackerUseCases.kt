package com.poli.tracker_domain.use_case

data class TrackerUseCases(

    val trackFood: TrackFood,
    val searchFood: SearchFood,
    val getFoodsForDate: GetFoodForDate,
    val deleteTrackedFood: DeleteTrackedFood,
    val calculateMealNutrients: CalculateMealNutrients

)
