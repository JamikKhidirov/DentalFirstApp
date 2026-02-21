package com.example.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentation.uicomponents.BottomNaviation
import com.example.presentation.uicomponents.SearchBarUserInput


@Composable
@Preview(showBackground = true )
fun MainScreen(){
    Scaffold(
        bottomBar = {
            BottomNaviation (
                modifier = Modifier.fillMaxWidth()
                    .padding(bottom = 20.dp)
                    .padding(horizontal = 20.dp),
                onTabSelect = {tabIndex ->

                }
            )
        }
    ) {  }
}