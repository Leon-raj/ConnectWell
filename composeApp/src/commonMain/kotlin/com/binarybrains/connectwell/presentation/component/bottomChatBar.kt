package com.binarybrains.connectwell.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.mic_filled_48px
import connectwell.composeapp.generated.resources.send_filled_48px
import org.jetbrains.compose.resources.painterResource

@Composable
fun BottomChatBar() {

    val systemPadding = WindowInsets.navigationBars.asPaddingValues()

    Row(modifier = Modifier.padding(bottom = systemPadding.calculateBottomPadding()),
        verticalAlignment = androidx.compose.ui.Alignment.Bottom,
    ){
        var enteredText by remember { mutableStateOf("") }

        TextField(
            value = enteredText,
            onValueChange = { enteredText = it},
            modifier = Modifier
                .padding(start = 16.dp, end = 8.dp, top = 16.dp)
                .weight(1f),
            shape = androidx.compose.foundation.shape.RoundedCornerShape(24.dp),
            placeholder = { Text(text = "Message") },
            maxLines = 4
        )

        var showDialog by remember { mutableStateOf(false) }
        var mess = enteredText
        if (showDialog) {
            sendText(mess)
        }

        IconButton(modifier = Modifier
            .padding(top = 16.dp, bottom = 4.dp, end = 16.dp)
            .size(48.dp)
            .background(
                shape = androidx.compose.foundation.shape.CircleShape,
                color = MaterialTheme.colorScheme.primaryContainer
            ),
            onClick = { }
        ){
            Icon(
                painter = if(enteredText == ""){
                    painterResource(Res.drawable.mic_filled_48px)
                } else {
                    painterResource(Res.drawable.send_filled_48px)
                },
                contentDescription = "Send Message",
                modifier = Modifier
                    .padding(6.dp)
                    .size(36.dp)
            )
        }
    }
}