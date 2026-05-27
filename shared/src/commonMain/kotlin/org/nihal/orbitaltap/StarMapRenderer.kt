package org.nihal.orbitaltap

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp

data class BackgroundStar(
    val position: Offset,
    val color: Color,
    val radius: Float
)
@Composable
fun StarMapRenderer(gameState: GameState)
{
    val backgroundStars = remember {
        List(1000)
        {
            val randomizer = (1..8).random()
            val color = when(randomizer){
                1-> Color(157, 180, 255)
                2-> Color(170, 191, 255)
                3-> Color(202, 215, 255)
                4-> Color(248, 247, 255)
                5-> Color(255, 244, 232)
                6-> Color(255, 244, 232)
                7-> Color(202, 215, 255)
                8-> Color(255, 210, 161)

                else -> Color.Transparent
            }
            val radius = when(randomizer%4) {
                0 -> 1f
                1 -> 2f
                2 -> 3f
                3 -> 4f
                else -> 0f
            }

            BackgroundStar(
                Offset((0..2000).random().toFloat(), (0..2000).random().toFloat()),
                color,
                radius
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(fraction = 0.60f)
            .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(10.dp))
            .clip(RoundedCornerShape(10.dp))
    )
    {
        Canvas(
            modifier = Modifier
                .fillMaxSize()
                .onGloballyPositioned{
                    coordinates -> gameState.updateCanvasSize(
                        coordinates.size.width.toFloat(), coordinates.size.height.toFloat()
                    )
                }
                .pointerInput(Unit){
                    detectDragGestures(
                        onDrag =  {_, dragAmount ->
                            gameState.onDrag(dragAmount, Pair(size.width, size.height))
                        }
                    )
                }
        ) {

            for(constellation in constellations)
            {
                val starPositionsOnMap = constellation.absoluteStarCoordinates()
                val starPositionsOnScreen = starPositionsOnMap.map {
                    Offset(
                        (it.x - gameState.mapOffset.x),
                        (it.y - gameState.mapOffset.y)
                    )
                }
                for(position in starPositionsOnScreen)
                {
                    drawCircleWithShadow(Color.White, 5.0f, position)
                }
                for (line in constellation.lines)
                {
                    val start = starPositionsOnScreen[line.first]
                    val end = starPositionsOnScreen[line.second]
                    drawLine(
                        color = Color.White,
                        start = start,
                        end = end
                    )
                }

            }

            for(backgroundStar in backgroundStars)
            {
                val screenPosition = backgroundStar.position - gameState.mapOffset
                val screenX = screenPosition.x
                val screenY = screenPosition.y
                if(screenX in 0f..size.width && screenY in 0f..size.height)
                {
                    drawCircleWithShadow(
                        color = backgroundStar.color,
                        radius = backgroundStar.radius,
                        center = screenPosition
                    )
                }
            }
        }
    }
}


fun DrawScope.drawCircleWithShadow(
    color: Color, radius: Float, center: Offset
)
{
    drawCircle(
        color = color.copy(alpha = ((radius/70.0).toFloat())),
        radius = radius + 5.dp.toPx(),
        center = center
    )
    drawCircle(
        color = color.copy(alpha = (radius/80.0).toFloat()),
        radius = radius + 2.dp.toPx(),
        center = center
    )
    drawCircle(
        color = color,
        radius = radius,
        center = center
    )
}

