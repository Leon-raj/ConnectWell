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
import com.binarybrains.connectwell.presentation.component.BottomChatBar
import com.binarybrains.connectwell.presentation.component.BottomNavigationBar
import com.binarybrains.connectwell.presentation.component.ChatPreviewBubble
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import org.jetbrains.compose.resources.painterResource
import com.binarybrains.connectwell.presentation.component.SimpleChatBubble


@Composable
fun testPage(){
    Scaffold(
        topBar = {homeTopBar()},
        bottomBar = {BottomChatBar()}
    ){ innerPadding ->
        ChatPreviewBubble(modifier = Modifier.padding(innerPadding))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeTopBar() {
    TopAppBar(
        title = {
            Text("ConnectWell")
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