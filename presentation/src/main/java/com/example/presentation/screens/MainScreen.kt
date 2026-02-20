package com.example.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentation.uicomponents.SearchBarUserInput


@Composable
@Preview(showBackground = true )
fun MainScreen(){
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.LightGray)
            .statusBarsPadding()
    ) {
        SearchBarUserInput(
            modifier = Modifier.fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {  }
    }
}