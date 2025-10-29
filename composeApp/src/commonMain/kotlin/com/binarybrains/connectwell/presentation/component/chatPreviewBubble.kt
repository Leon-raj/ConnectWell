package com.binarybrains.connectwell.presentation.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.pfp2
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource

data class tempMsg(
    val name: String,
    val avatar: DrawableResource,
    val message: String
)

@Composable
fun ChatPreviewBubble(modifier: Modifier = Modifier) {

    val p1 = tempMsg(
        "John Alfred",
        avatar = Res.drawable.pfp2,
        message = "Hello there!"
    )

    Surface(modifier = modifier) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(64.dp)
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(RoundedCornerShape(16.dp))

        ) {
            Image(painter = painterResource(p1.avatar),
                contentDescription = "Avatar",
                modifier = Modifier
                    .padding(8.dp)
                    .size(48.dp)
                    .clip(CircleShape)
            )

            Column(modifier = Modifier.padding(8.dp)) {
                Text(
                    text = p1.name,
                    fontSize = 18.sp,
                    fontWeight = MaterialTheme.typography.titleMedium.fontWeight,
                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                )

                Text(
                    text = p1.message,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "6:32 PM",  /* will add actual timestamp later */
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.padding(top = 8.dp, end = 16.dp),
            )
        }
    }
}



