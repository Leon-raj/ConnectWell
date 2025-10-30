@file:OptIn(ExperimentalMaterial3Api::class)

package com.binarybrains.connectwell


import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.binarybrains.connectwell.presentation.GroupChatPreviewPage
import com.binarybrains.connectwell.presentation.TherapyChatPreviewPage
import com.binarybrains.connectwell.presentation.component.SearchViewModel
import com.binarybrains.connectwell.presentation.component.bookingPage
import com.binarybrains.connectwell.presentation.homePage
import com.binarybrains.connectwell.presentation.testPage
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App() {
    MaterialTheme {

        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "Home", builder = {
            composable("Home"){
                homePage(navController = navController)
            }
            composable("test"){
                testPage()
            }
            composable("Therapy"){
                TherapyChatPreviewPage(navController = navController)
            }
            composable("Therapy Group"){
                GroupChatPreviewPage(navController = navController)
            }
            composable("Booking"){
                bookingPage(viewModel = SearchViewModel(), navcontroller = navController)
            }
        })

    }
}









