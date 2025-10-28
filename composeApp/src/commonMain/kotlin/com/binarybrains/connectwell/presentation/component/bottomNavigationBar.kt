package com.binarybrains.connectwell.presentation.component

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.chat_48px
import connectwell.composeapp.generated.resources.chat_filled_48px
import connectwell.composeapp.generated.resources.groups_48px
import connectwell.composeapp.generated.resources.groups_filled_48px
import connectwell.composeapp.generated.resources.home_48px
import connectwell.composeapp.generated.resources.home_filled_48px
import connectwell.composeapp.generated.resources.robot_48px
import connectwell.composeapp.generated.resources.robot_filled_48px
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource



data class navigationItem(
    val title: String,
    val selectedIcon: DrawableResource,
    val unselectedIcon: DrawableResource,
    val hasNews: Boolean = false,
    val badgeCount: Int = 0,
)

@Composable
fun BottomNavigationBar() {

    val navigationItems = listOf(
        navigationItem(
            title = "Home",
            selectedIcon = Res.drawable.home_filled_48px,
            unselectedIcon = Res.drawable.home_48px,
            hasNews = false,
            badgeCount = 0
        ),

        navigationItem(
            title = "Therapy",
            selectedIcon = Res.drawable.chat_filled_48px,
            unselectedIcon = Res.drawable.chat_48px,
            hasNews = false,
            badgeCount = 2
        ),

        navigationItem(
            title = "Therapy Group",
            selectedIcon = Res.drawable.groups_filled_48px,
            unselectedIcon = Res.drawable.groups_48px,
            hasNews = false,
            badgeCount = 15
        ),

        navigationItem(
            title = "ChatBuddy",
            selectedIcon = Res.drawable.robot_filled_48px,
            unselectedIcon = Res.drawable.robot_48px,
            hasNews = false,
            badgeCount = 0
        )
    )

    var selectedIndex by rememberSaveable {
        mutableStateOf(0)
    }

    NavigationBar {
        navigationItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = {
                    selectedIndex = index
                },
                icon = {
                    BadgedBox(
                        badge = {
                            if (item.badgeCount > 0) {
                                Badge {
                                    Text(text = item.badgeCount.toString())
                                }
                            }
                            else if(item.hasNews){
                                Badge()
                            }
                        }
                    ){
                        Icon(
                            painter = if(index == selectedIndex) {
                                painterResource(item.selectedIcon)
                            }
                            else{
                                painterResource(item.unselectedIcon)
                            },
                            contentDescription = item.title
                        )

                    }
                }

            )
        }
    }
}