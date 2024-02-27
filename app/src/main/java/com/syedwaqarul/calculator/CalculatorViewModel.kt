package com.syedwaqarul.calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set
}
//Role of view model is just to accept user events for example :clicking on the number button and clicking on the operation button.
//view model is responsible for changing the state so the ui can be updated with the new state.
//The state will not lost if I put state in the view model.