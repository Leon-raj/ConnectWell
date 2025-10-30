package com.binarybrains.connectwell.presentation.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun sendText(text: String) {
    SimpleChatBubble(text = text)
    Text("")
}