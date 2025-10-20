@file:OptIn(ExperimentalMaterial3Api::class)

package com.binarybrains.connectwell

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.jetbrains.compose.resources.imageResource

@Preview
@Composable
fun App() {
    MaterialTheme {
        homeTopBar()
    }
}


@Composable
fun homeTopBar(){
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text("ConnectWell")
                },
                actions = {
                    IconButton(onClick = {/*placeholder*/}){
                        Icon(
                            painter = painterResource(Res.drawable.account_circle_40px),
                            contentDescription = "User Account"
                        )
                    }
                }
            )
        },
    ) {}
}


