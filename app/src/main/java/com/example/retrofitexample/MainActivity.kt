package com.example.retrofitexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.retrofitexample.ui.screen.PhotoScreen
import com.example.retrofitexample.ui.screen.TodoScreen
import com.example.retrofitexample.ui.theme.RetroFitExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetroFitExampleTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    PhotoScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    PhotoScreen()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RetroFitExampleTheme {
        Greeting("Android")
    }
}