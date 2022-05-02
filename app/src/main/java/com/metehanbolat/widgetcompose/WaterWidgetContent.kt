package com.metehanbolat.widgetcompose

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceModifier
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextAlign
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.metehanbolat.widgetcompose.WaterWidget.Companion.RECOMMENDED_DAILY_GLASSES

@SuppressLint("StringFormatInvalid")
@Composable
fun WaterWidgetCounter(
    context: Context,
    glassesOfWater: Int,
    modifier: GlanceModifier
) {
    Text(
        text = context.getString(R.string.glasses_of_water_format, glassesOfWater),
        modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = ColorProvider(
                color = Color.White
            )
        )
    )
}

@SuppressLint("StringFormatInvalid")
@Composable
fun WaterWidgetGoal(
    context: Context,
    glassesOfWater: Int,
    modifier: GlanceModifier
) {
    Text(
        text = when {
            glassesOfWater >= RECOMMENDED_DAILY_GLASSES -> context.getString(R.string.goal_met)
            else -> context.getString(R.string.daily_glass_goal, RECOMMENDED_DAILY_GLASSES)
        },
        modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = ColorProvider(
                color = Color.White
            )
        )
    )

}