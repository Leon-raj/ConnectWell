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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import connectwell.composeapp.generated.resources.Res
import connectwell.composeapp.generated.resources.pfp2
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.stateIn
import org.jetbrains.compose.resources.painterResource

class SearchViewModel : ViewModel() {

    var searchQuery: String by mutableStateOf("")
        private set

    private val coolFlow = flowOf(
        listOf(
            Therapists(
                id = 1,
                name = "Wanky Wonk",
                rating = 7.4,
                avatar = Res.drawable.pfp2,
                description = "LETTING THE DAYS GO BY"
            ),
            Therapists(
                id = 2,
                name = "Flibber Burschumberwerfuer",
                rating = 9.2,
                avatar = Res.drawable.pfp2,
                description = "LETTING THE DAYS GO BY"
            ),
            Therapists(
                id = 3,
                name = "Joe",
                rating = 10.0,
                avatar = Res.drawable.pfp2,
                description = "LETTING THE DAYS GO BY"
            )
        )
    )
    val searchResults: StateFlow<List<Therapists>> =
        snapshotFlow { searchQuery }
            .combine(coolFlow) { searchQuery, therapy ->
                when {
                    searchQuery.isNotEmpty() -> therapy.filter { therapist ->
                        therapist.name.contains(searchQuery, ignoreCase = true)
                    }
                    else -> therapy
                }
            }.stateIn(
                scope = viewModelScope,
                initialValue = emptyList(),
                started = SharingStarted.WhileSubscribed(5_000)
            )
    fun onSearchQueryChange(newQuery: String) {
        searchQuery = newQuery
    }
}