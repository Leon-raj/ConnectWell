@file:OptIn(ExperimentalMaterial3Api::class)

package com.binarybrains.connectwell.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.binarybrains.connectwell.presentation.component.BottomNavigationBar
import com.binarybrains.connectwell.presentation.component.ChatPreviewBubble
import com.binarybrains.connectwell.presentation.component.tempMsg
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import connectwell.composeapp.generated.resources.pfp5
import org.jetbrains.compose.resources.painterResource

@Composable

fun GroupChatPreviewPage(modifier: Modifier = Modifier, navController: NavController) {
    val msg = tempMsg(
        name = "Robert Lewandowski",
        avatar = Res.drawable.pfp5,
        message = "Hello! Hope you are having a good day"
    )

    Scaffold(
        topBar = {GroupChatPreviewTopBar()},
        bottomBar = {BottomNavigationBar(navController = navController)}
    ){innerPadding ->
        ChatPreviewBubble( modifier = Modifier.padding(innerPadding), msg = msg)
    }
}

@Composable
fun GroupChatPreviewTopBar() {
    TopAppBar(
        title = {
            Text("Group Therapy")
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