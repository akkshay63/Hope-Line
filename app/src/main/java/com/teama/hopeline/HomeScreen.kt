package com.teama.hopeline

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.teama.hopeline.ui.theme.HopeLineTheme

class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HopeLineTheme {
                Scaffold(
                    bottomBar = { BottomNavBar() }
                ) { innerPadding ->
                    HomeContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun HomeContent(modifier: Modifier = Modifier) {
    // Home screen content where user can choose their role
    Text(text = "Are you a volunteer?", modifier = modifier)
}

@Preview(showBackground = true)
@Composable
fun HomeContentPreview() {
    HopeLineTheme {
        HomeContent()
    }
}