package com.example.presentation.uicomponents

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentation.uicomponents.data.BottomData


@SuppressLint("UnrememberedMutableState")
@Composable
@Preview(showBackground = true)
fun BottomNaviation(
    modifier: Modifier = Modifier
){

    val list = mutableStateListOf(
        BottomData(
            text = "Главная"
        ),
        BottomData(
            text = "Каталог"
        ),
        BottomData(
            text = "Сравнить"
        ),
        BottomData(
            text = "Корзина"
        ),
        BottomData(
            text = "Профиль"
        )
        )


    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        list.forEachIndexed {index, data ->

        }
    }
}
