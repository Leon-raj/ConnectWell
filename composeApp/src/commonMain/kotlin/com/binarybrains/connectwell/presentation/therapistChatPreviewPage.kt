@file:OptIn(ExperimentalMaterial3Api::class)

package com.binarybrains.connectwell.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.binarybrains.connectwell.presentation.component.BottomNavigationBar
import com.binarybrains.connectwell.presentation.component.ChatPreviewBubble
import com.binarybrains.connectwell.presentation.component.tempMsg
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import org.jetbrains.compose.resources.painterResource

@Composable
fun TherapyChatPreviewPage(modifier: Modifier = Modifier) {

    val TempMsg = ListOf(
        TempMsg(
            name = "Kevin DeBruyne",
            avatar = Res.drawable.pfp3,
            message = "Good morning!"
        ),
        TempMsg(
            name = "Cole Palmer",
            avatar = Res.drawable.pfp4,
            message = "Greetings!"
        ), 
        TempMsg(
            name = "Robert Lewandowski",
            avatar = Res.drawable.pfp5,
            message = "Hello! Hope you are having a good day"
        )
    )
    
    Scaffold(
        topBar = {TherapyChatPreviewTopBar()},
        bottomBar = {BottomNavigationBar()}
    ){innerPadding ->
        ChatPreviewBubble( modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun TherapyChatPreviewTopBar() {
    TopAppBar(
        title = {
            Text("Therapy Chat")
        },
        actions = {
            IconButton(onClick = {/*placeholder*/ }) {
                Icon(
                    painter = painterResource(Res.drawable.account_circle_40px),
                    contentDescription = "User Account"
                )
            }
        }
    )
}
