package com.binarybrains.connectwell.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun BookAdvert(modifier: Modifier = Modifier, navController: NavController) {

    Box(
        modifier = modifier
            .padding(16.dp)
            .background(
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(16.dp)
            )
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                navController.navigate("Book")
            }
    ) {

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Book an appointment",
                fontSize = 20.sp,
                fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = "Select from our verified therapists!",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier.padding(4.dp)
            )
        }
    }

}