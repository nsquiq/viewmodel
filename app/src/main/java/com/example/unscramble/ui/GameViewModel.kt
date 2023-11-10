package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import com.example.unscramble.ui.model.GameUiState
import kotlinx.coroutines.flow.MutableStateFlow

// Game UI state
private val _uiState = MutableStateFlow(GameUiState())
class GameViewModel : ViewModel() {
}