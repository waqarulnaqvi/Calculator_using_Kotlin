package com.syedwaqarul.calculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(
    symbol:String,
    modifier: Modifier=Modifier,
    onClick :()->Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)//You have to do this to get a circular shape
            .clickable { onClick() }
            .then(modifier)//If you do this then your custom modifier is applied from this step
    )
    {

        Text(text = symbol,
            fontSize = 36.sp,
            color = Color.White ,
//            color = MaterialTheme //If you to work with light and dark theme hear then you have to use the material theme.
        )
    }

}