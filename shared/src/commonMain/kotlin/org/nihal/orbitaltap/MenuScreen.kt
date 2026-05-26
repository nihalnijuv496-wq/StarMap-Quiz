package org.nihal.orbitaltap

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.content.MediaType
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import orbitaltap.shared.generated.resources.Comfortaa_Bold
import orbitaltap.shared.generated.resources.Comfortaa_Light
import orbitaltap.shared.generated.resources.Comfortaa_Medium
import orbitaltap.shared.generated.resources.OrionSky_SimonGodfrey
import orbitaltap.shared.generated.resources.Res
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuScreen (onStartGame: () -> Unit, onExit: () -> Unit)
{

    val ComfortaaFamily = FontFamily(
        Font(Res.font.Comfortaa_Bold, FontWeight.Bold),
        Font(Res.font.Comfortaa_Light, FontWeight.Light),
        Font(Res.font.Comfortaa_Medium, FontWeight.Medium)
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(
                Res.drawable.OrionSky_SimonGodfrey),
                contentScale = ContentScale.Crop),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {

        Text(
            text = "OrbitalTap",
            fontFamily = ComfortaaFamily,
            fontSize = 30.sp,
            fontWeight = FontWeight.Medium,
            color = Color.White
        )
        Spacer(Modifier.height(30.dp))

        Button(
            onClick = onStartGame,
            modifier = Modifier
                .width(130.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.White
            ),
            border = BorderStroke(width = 2.dp, color = Color.White),
            shape = RectangleShape

        )
        {
            Text(
                text = "Start",
                style = TextStyle(
                    fontFamily = ComfortaaFamily,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Light,
                    color = Color.White
                )
            )
        }


    }
}