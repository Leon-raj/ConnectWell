package com.binarybrains.connectwell.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.binarybrains.connectwell.presentation.component.BottomChatBar
import com.binarybrains.connectwell.presentation.component.BottomNavigationBar
import com.binarybrains.connectwell.presentation.component.SimpleChatBubble
import com.binarybrains.connectwell.presentation.component.Therapists
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import org.jetbrains.compose.resources.painterResource

@Composable
fun therapychatPage(){
    Scaffold(
        topBar = {chatTopBar()},
        bottomBar = {BottomChatBar()}
    ){innerPadding ->
        Text(modifier = Modifier.padding(innerPadding),
            fontSize = 30.sp,
            text = ""
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun chatTopBar(/*therapist: Therapists, modifier: Modifier = Modifier*/) {
    TopAppBar(
        title = {
            Text(/*therapist.name*/"Insert Name")
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