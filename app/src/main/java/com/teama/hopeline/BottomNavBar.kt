package com.teama.hopeline

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun BottomNavBar() {
    NavigationBar {
        NavigationBarItem(
            icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
            label = { Text("Home") },
            selected = true,
            onClick = { /* Handle Home click */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Notifications, contentDescription = "Notifications") },
            label = { Text("Notifications") },
            selected = false,
            onClick = { /* Handle Notifications click */ }
        )
        NavigationBarItem(
            icon = { Icon(Icons.Default.Info, contentDescription = "Info") },
            label = { Text("Info") },
            selected = false,
            onClick = { /* Handle Info click */ }
        )
    }
}