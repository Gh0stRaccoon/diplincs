package com.travelin_example.diplincs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DetailScreen(name: String) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text= "DETAIL SCREEN $name", fontSize = 25.sp)
        Spacer(modifier = Modifier.weight(1f))
        Button(onClick = { /* TODO */ }) {
            Text(text = "Logout")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}