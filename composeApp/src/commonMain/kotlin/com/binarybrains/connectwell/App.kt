@file:OptIn(ExperimentalMaterial3Api::class)

package com.binarybrains.connectwell

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import connectwell.composeapp.generated.resources.chat_48px
import connectwell.composeapp.generated.resources.groups_48px
import connectwell.composeapp.generated.resources.home_48px
import connectwell.composeapp.generated.resources.robot_2_48px
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.imageResource

@Preview
@Composable
fun App() {
    MaterialTheme {
        Scaffold(
            topBar = {homeTopBar()},
            bottomBar = {homeBottomBar()}
        ){innerPadding ->
            Text(modifier = Modifier.padding(innerPadding),
                fontSize = 30.sp,
                text = "\n  Welcome Your Name!\n\n  \"Daily Quote by AI\""
            )
        }
    }
}


@Composable
fun homeTopBar() {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
        ),
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

@Composable
fun homeBottomBar() {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Home */ }) {
                Icon(
                    painter = painterResource(Res.drawable.home_48px),
                    contentDescription = "Home"
                )
            }
            IconButton(onClick = { /* Therapy Chat */ }) {
                Icon(
                    painter = painterResource(Res.drawable.chat_48px),
                    contentDescription = "Therapy Chat"
                )
            }
            IconButton(onClick = { /* Group Therapy */ }) {
                Icon(
                    painter = painterResource(Res.drawable.groups_48px),
                    contentDescription = "Group Therapy"
                )
            }
            IconButton(onClick = { /* Chat Bot */ }) {
                Icon(
                    painter = painterResource(Res.drawable.robot_2_48px),
                    contentDescription = "Chat-Buddy"
                )
            }
        }
    }
}


