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
import com.example.retrofitexample.ui.components.TodoItem
import com.example.retrofitexample.viewmodel.TodoViewModel

@Composable
fun TodoScreen(viewModel: TodoViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val todos = viewModel.todos.collectAsState()

    if (todos.value.isEmpty()) {
        Text(text = "Noch nicht geladen")
    }
    else {
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(todos.value) { todo ->
                TodoItem(todo)
            }
        }
    }
}