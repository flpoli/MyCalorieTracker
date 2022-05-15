package com.poli.tracker_presentation.tracker_overview

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.poli.core.util.UiEvent
import com.poli.core_ui.LocalSpacing
import com.poli.tracker_presentation.tracker_overview.components.DaySelector
import com.poli.tracker_presentation.tracker_overview.components.ExpandableMeal
import com.poli.tracker_presentation.tracker_overview.components.NutrientsHeader

@Composable
fun TrackerOverviewScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: TrackerOverViewViewModel = hiltViewModel()
){

    val spacing = LocalSpacing.current
    val state = viewModel.state
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = spacing.spaceMedium)
    ){

        item {
            NutrientsHeader(state = state)
            Spacer(modifier = Modifier.height(spacing.spaceMedium))

            DaySelector(
                date = state.date,
                onNextDayClick = { viewModel.onEvent(TrackerOverViewEvent.OnNextDayClick) },
                onPreviousDayClick = { viewModel.onEvent(TrackerOverViewEvent.OnPreviousDayClick) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = spacing.spaceMedium)
            )
            Spacer(modifier = Modifier.height(spacing.spaceMedium))
        }

        items(
            state.meals
        ){
            meal -> 
                ExpandableMeal(
                    meal = meal ,
                    onToggleClick = { viewModel.onEvent(TrackerOverViewEvent.OnToggleMealClick(meal)) },
                    content = {

                    },
                    modifier = Modifier.fillMaxWidth()
                )
        }
    }

}