package com.example.triviatrial.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.triviatrial.components.Questions


@Composable
fun TriviaHome(viewmodel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewmodel)
}