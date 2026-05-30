package org.nihal.orbitaltap

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import orbitaltap.shared.generated.resources.Comfortaa_Bold
import orbitaltap.shared.generated.resources.Comfortaa_Light
import orbitaltap.shared.generated.resources.Comfortaa_Medium
import orbitaltap.shared.generated.resources.Res
import org.jetbrains.compose.resources.Font
import org.nihal.orbitaltap.Utils.Timer.StartTimer
import org.nihal.orbitaltap.Utils.Timer.Timer

@Composable
fun GameScreen(gameState: GameState, onGameOver: () -> Unit, onExit: () -> Unit) {

    val ComfortaaFamily = FontFamily(
        Font(Res.font.Comfortaa_Bold, FontWeight.Bold),
        Font(Res.font.Comfortaa_Light, FontWeight.Light),
        Font(Res.font.Comfortaa_Medium, FontWeight.Medium)
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(3, 10, 22))
            .padding(20.dp, 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = "OrbitalTap",
            fontFamily = ComfortaaFamily,
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            color = Color.White
        )

        StarMapRenderer(gameState, onGameOver)

        Row (
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(
                text = "Score: \n${gameState.score}",
                textAlign = TextAlign.Center,
                fontFamily = ComfortaaFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                color = Color.White
            )



            //TODO("implement the timer circle")

            StartTimer(gameState.timer, onGameOver)

            Text(
                text = "Time: \n${gameState.timer.remainingTimeSeconds.toInt()}",
                textAlign = TextAlign.Center,
                fontFamily = ComfortaaFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                color = Color.White
            )
        }

        Spacer(Modifier.height(10.dp))

        Text(
            text = gameState.currQuestion,
            fontFamily = ComfortaaFamily,
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            color = Color.White
        )

    }
}