package com.poli.tracker_data.mapper

import com.poli.tracker_data.local.entity.TrackedFoodEntity
import com.poli.tracker_domain.model.MealType
import com.poli.tracker_domain.model.TrackedFood
import java.time.LocalDate

fun TrackedFoodEntity.toTrackedFood(): TrackedFood {

    return TrackedFood(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        calories = calories,
        amount = amount,
        date = LocalDate.of(year, month, dayOfMonth),
        imageUrl = imageUrl,
        mealType = MealType.fromString(type),

    )
}
fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity {
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount = amount,
        dayOfMonth = date.dayOfMonth,
        month = date.monthValue,
        year = date.year,
        calories = calories,
        id = id
    )
}