package com.binarybrains.connectwell.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import connectwell.composeapp.generated.resources.account_circle_40px
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    searchQuery: String,
    searchResults: List<Therapists>,
    onSearchQueryChange: (String) -> Unit
) {
    SearchBar(
        query = searchQuery,
        onQueryChange = onSearchQueryChange,
        onSearch = {},
        placeholder = {
            Text(text = "Search")
        },
        leadingIcon = {
            /*Icon(
                painter = painterResource(connectwell.composeapp.generated.resources.account_circle_40px),
                contentDescription = stringResource(id = connectwell.composeapp.generated.resources.account_circle_40px)
            )*/
        },
        trailingIcon = {
            if (searchQuery.isNotEmpty()) {
                IconButton(onClick = { onSearchQueryChange("") }) {
                    /*Icon(
                        painter = painterResource(connectwell.composeapp.generated.resources.account_circle_40px),
                        contentDescription = stringResource(id = connectwell.composeapp.generated.resources.account_circle_40px)
                    )*/
                }
            }
        },
        content = {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(32.dp),
                contentPadding = PaddingValues(16.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(
                    count = searchResults.size,
                    key = { index -> searchResults[index].id },
                    itemContent = { index ->
                        val therapist = searchResults[index]
                        TherapistListItem(therapist = therapist)
                    }
                )
            }
        },
        active = true,
        onActiveChange = {},
        tonalElevation = 0.dp
    )
}
@Composable
fun bookingPage(viewModel: SearchViewModel, navController: NavController) {
    val searchResults by viewModel.searchResults.collectAsStateWithLifecycle()
/*
    SearchScreen(
        searchQuery = viewModel.searchQuery,
        searchResults = searchResults,
        onSearchQueryChange = { viewModel.onSearchQueryChange(it) }
    ) */
    Scaffold(
        topBar = {SearchScreen(viewModel.searchQuery, searchResults, viewModel::onSearchQueryChange) },
        bottomBar = {BottomNavigationBar(navController = navController)}
    ){ innerPadding ->
        SimpleChatBubble(modifier = Modifier.padding(innerPadding))
    }
}