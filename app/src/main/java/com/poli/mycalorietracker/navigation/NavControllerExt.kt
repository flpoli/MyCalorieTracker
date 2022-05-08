package com.poli.mycalorietracker.navigation

import androidx.navigation.NavController
import com.poli.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){

    this.navigate(event.route)
}