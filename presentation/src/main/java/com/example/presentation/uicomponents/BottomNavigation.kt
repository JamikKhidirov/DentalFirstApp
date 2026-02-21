package com.example.presentation.uicomponents

import android.annotation.SuppressLint
import android.hardware.camera2.params.ColorSpaceTransform
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentation.R
import com.example.presentation.uicomponents.data.BottomData


@SuppressLint("UnrememberedMutableState")
@Composable
@Preview(showBackground = true)
fun BottomNaviation(
    modifier: Modifier = Modifier,
    selectedIndex: Int = 0,  // ← Текущий выбранный таб
    onTabSelect: (Int) -> Unit = {}  // ← Callback при выборе
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
        modifier = modifier.fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFFFAFAFA))
            .border(
                width = 1.dp,
                color = Color(0xFFE6E6E6),
                shape = RoundedCornerShape(20.dp)
            ),
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        list.forEachIndexed {index, data ->
            BottomItem(
                modifier = Modifier.padding(vertical = 18.dp),
                data = data,
                isEnable = (index == selectedIndex),
                onClick = {
                    onTabSelect(index)
                }
            )
        }
    }
}


@Composable
@Preview(showBackground = true)
fun BottomItem(
    modifier: Modifier = Modifier,
    data: BottomData =  BottomData(
        text = "Главная",
        icon = R.drawable.home_bottom
    ),
    onClick: () -> Unit = {},
    isEnable: Boolean = true
){

    var interaction = remember { MutableInteractionSource() }

    Box(
        modifier = modifier
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
                contentDescription = null,
                tint = if (isEnable) Color(0xFF1634F0) else Color.Unspecified
            )

            Text(
                text = data.text,
                fontSize = 11.sp,
                color = if (isEnable) Color(0xFF1634F0) else Color(0xFF4D4D4D)
            )
        }
    }

}