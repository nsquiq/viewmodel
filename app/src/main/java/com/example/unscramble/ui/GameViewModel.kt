package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import com.example.unscramble.data.allWords
import com.example.unscramble.ui.model.GameUiState
import kotlinx.coroutines.flow.MutableStateFlow

import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

// Game UI stat

// Backing property to avoid state updates from other classes
private val _uiState = MutableStateFlow(GameUiState())
val uiState: StateFlow<GameUiState> = _uiState.asStateFlow()

private lateinit var currentWord: String

private fun pickRandomWordAndShuffle(): String {
    // Continue picking up a new random word until you get one that hasn't been used before
    currentWord = allWords.random()

    private var usedWords: MutableSet<String> = mutableSetOf()


    if (usedWords.contains(currentWord)) {
        return pickRandomWordAndShuffle()
    } else {
        usedWords.add(currentWord)
        return shuffleCurrentWord(currentWord)
    }
}
private fun shuffleCurrentWord(word: String): String {
    val tempWord = word.toCharArray()
    // Scramble the word
    tempWord.shuffle()
    while (String(tempWord).equals(word)) {
        tempWord.shuffle()
    }
    return String(tempWord)
}
class GameViewModel : ViewModel() {
}