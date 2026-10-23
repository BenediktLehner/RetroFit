package com.example.retrofitexample.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.retrofitexample.data.model.Photo

@Composable
fun PhotoItem(photo: Photo) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = photo.title, style = MaterialTheme.typography.titleMedium)
            Text(text = photo.url, style = MaterialTheme.typography.titleMedium)
            // AsyncImage hier... Kannst du dir 10 rotierende Äpfel vorstellen?
        }
    }
}