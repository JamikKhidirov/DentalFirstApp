package com.example.presentation.uicomponents

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.presentation.R
import com.example.presentation.uicomponents.data.BottomData


@SuppressLint("UnrememberedMutableState")
@Composable
@Preview(showBackground = true)
fun BottomNaviation(
    modifier: Modifier = Modifier
){

    val list = remember {
        mutableStateListOf(
            BottomData(
                text = "Главная",
                icon = R.drawable.home_bottom
            ),
            BottomData(
                text = "Каталог",
                icon = R.drawable.katalog_bottom
            ),
            BottomData(
                text = "Сравнить",
                icon = R.drawable.add_bottom
            ),
            BottomData(
                text = "Корзина",
                icon = R.drawable.cart_bottom
            ),
            BottomData(
                text = "Профиль",
                icon = R.drawable.profile_bottom
            )
        )
    }


    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        list.forEachIndexed {index, data ->

        }
    }
}


@Composable
@Preview(showBackground = true)
fun BottomItem(
    data: BottomData =  BottomData(
        text = "Главная",
        icon = R.drawable.home_bottom
    ),
    onClick: () -> Unit = {}
){

    var interaction = remember { MutableInteractionSource() }

    Box(
        modifier = Modifier
            .clickable(
                interactionSource = interaction,
                enabled = true,
                indication = ripple(bounded = true),
                onClick = onClick
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(data.icon),
                contentDescription = null
            )

            Text(
                text = data.text,
                fontSize = 11.sp
            )
        }
    }

}