package com.example.retrofitexample.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.retrofitexample.ui.components.PhotoItem
import com.example.retrofitexample.viewmodel.PhotoViewModel

@Composable
fun PhotoScreen(viewModel: PhotoViewModel = androidx.lifecycle.viewmodel.compose.viewModel(), modifier: Modifier = Modifier) {
    val photos = viewModel.photos.collectAsState()

    if (photos.value.isEmpty()) {
        Text(text = "Noch nicht geladen")
    }
    else {
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(photos.value) { photo ->
                PhotoItem(photo)
            }
        }
    }
}