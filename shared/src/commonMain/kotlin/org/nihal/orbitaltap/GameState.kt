package org.nihal.orbitaltap

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.style.LineHeightStyle
import kotlin.math.*

class GameState {


    var currAnswer by mutableStateOf<Constellation?>(null)
        private set
    val currQuestion get() =    if(currAnswer!= null) "Find:${questionAnswerPairs.find { it.second == currAnswer?.name }}"
                                else ""

    var score by mutableStateOf(0)
        private set
    var lives by mutableStateOf(3)
        private set
    var isGameOver by mutableStateOf(false)
        private set
    var mapOffset by mutableStateOf(Offset(0f, 0f))
        private set

    var canvasSize: Offset = Offset.Zero

    fun updateCanvasSize(width: Float, height: Float)
    {
        canvasSize = Offset(width, height)
    }



    fun startGame()
    {
        resetAll()
        getNewQuestion()
    }

    fun getNewQuestion()
    {
        currAnswer = constellations.random()
    }

    fun checkClick(clickedX: Double, clickedY: Double): Boolean
    {
        if(currAnswer == null) return false;

        val distanceFromTarget = sqrt(
            (clickedX - (currAnswer!!.center.x + mapOffset.x)) * (clickedX - (currAnswer!!.center.x + mapOffset.x)) +
                    (clickedY - (currAnswer!!.center.y + mapOffset.y)) *  (clickedY - (currAnswer!!.center.y + mapOffset.y))
        )
        if(distanceFromTarget <= 60)
        {
            ++score
            getNewQuestion()
            return true
        }
        loseLife()
        return false
    }

    fun onTimeUp() {
        loseLife()
        if(!isGameOver) getNewQuestion()
    }

    fun loseLife()
    {
        --lives
        if(lives == 0) isGameOver = true
    }

    fun resetAll()
    {
        currAnswer = null
        score = 0
        lives = 3
        isGameOver = false
        mapOffset = Offset(0f,0f)
    }

    fun onDrag(delta: Offset, canvasSize: Pair<Int, Int>)
    {
        mapOffset -= delta
        println(mapOffset)

        if (mapOffset.x < 0)
            mapOffset = Offset(0.0f, mapOffset.y)
        if (mapOffset.y < 0)
            mapOffset = Offset(mapOffset.x, 0.0f)
        if (mapOffset.x > 2000 - canvasSize.first)
            mapOffset = Offset((2000 - canvasSize.first).toFloat(), mapOffset.y)
        if (mapOffset.y > 2000 - canvasSize.second)
            mapOffset = Offset(mapOffset.x, (2000 - canvasSize.second).toFloat())

    }
}

val questionAnswerPairs = listOf(
    Pair("Polaris is in?", "Ursa Minor")
)