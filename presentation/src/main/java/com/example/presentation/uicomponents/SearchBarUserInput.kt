package com.example.presentation.uicomponents

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentation.R


@Composable
@Preview(showBackground = true)
fun SearchBarUserInput(
    userText: String = "",
    onValueChange: (String) -> Unit = {},
    onClickPhoto: () -> Unit = {}
){

    var userTextValue by remember { mutableStateOf(userText) }

    TextField(
        value = userTextValue,
        shape = RoundedCornerShape(16.dp),
        onValueChange = { newtext ->
            userTextValue = newtext
            onValueChange(newtext)
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(0xFFFAFAFA),
            unfocusedContainerColor = Color(0xFFFAFAFA),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        ),

        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.search_icon),
                contentDescription = null,
            )
        },
        trailingIcon = {
            IconButton(
                onClick = onClickPhoto
            ) {
                Icon(
                    painter = painterResource(R.drawable.vector),
                    contentDescription = null,
                    tint = Color(0xFFBAC3FB),
                    modifier = Modifier.size(22.dp)
                )
            }
        },
        placeholder = {
            Text(
                text = "Искать на DentalFirst",
                fontSize = 16.sp,
                color = Color(0xFF999999)
            )
        }
    )
}