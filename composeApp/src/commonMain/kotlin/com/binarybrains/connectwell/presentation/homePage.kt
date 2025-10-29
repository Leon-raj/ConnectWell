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
import androidx.compose.ui.unit.sp
import com.binarybrains.connectwell.presentation.component.BottomNavigationBar
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.account_circle_40px
import org.jetbrains.compose.resources.painterResource

@Composable
fun homePage(){
    Scaffold(
        topBar = {homeTopBar()},
        bottomBar = {BottomNavigationBar()}
    ){innerPadding ->
        Text(modifier = Modifier.padding(innerPadding),
            fontSize = 30.sp,
            text = "\n  Welcome Your Name!\n\n  \"Daily Quote by AI\""
        )
    }
}


@Composable
fun homeTopBar() {
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