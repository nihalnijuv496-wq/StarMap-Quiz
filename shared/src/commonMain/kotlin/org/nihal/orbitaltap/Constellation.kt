package org.nihal.orbitaltap

import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

data class Star(
    val x: Float, val y: Float
)
{
    operator fun plus(other: Star):Star {return Star(other.x + x, other.y +y)}
}

data class Constellation (
    val name: String,
    val center: Star,
    val stars: List<Star>,
    val lines: List<Pair<Int, Int>>,
    val fact: String,
    val color: Color = Color.White
)
{
    fun absoluteStarCoordinates(): List<Star> = stars.map{Star(center.x+it.x, center.y+it.y)}
}



val constellations = listOf(
    Constellation(
        name = "Orion",
        center = Star(300.0f, 400.0f),
        stars = listOf(
            Star(0.0f, -50.0f),
            Star(40.5f, -44.0f),
            Star(11.24f, 2.5f),
            Star(20.0f, 0.0f),
            Star(29.8f, -5.57f),
            Star(4.78f, 40.22f),
            Star(38.49f, 35.02f)
        ),
        lines = listOf(
            Pair(0, 1),
            Pair(0, 2),
            Pair(1, 4),
            Pair(2, 3), Pair(4, 3),
            Pair(2, 5), Pair(4, 6),
            Pair(5, 6)
        ),
        fact = "fact of Orion"
    ),
    Constellation(
        name = "Taurus",
        center = Star(200.0f, 700.0f),
        stars = listOf(
            Star(-20.0f, -10.0f),
            Star(-5.0f, -20.0f),
            Star(10.0f, -25.0f),
            Star(-10.0f, 5.0f),
            Star(5.0f, 15.0f),
            Star(-30.0f, 10.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(0, 3), Pair(3, 4),
            Pair(0, 5)
        ),
        fact = "fact of Taurus"
    ),
    Constellation(
        name = "Cygnus",
        center = Star(1400.0f, 500.0f),
        stars = listOf(
            Star(0.0f, -40.0f),
            Star(0.0f, -10.0f),
            Star(0.0f, 20.0f),
            Star(0.0f, 50.0f),
            Star(0.0f, 80.0f),
            Star(-40.0f, 20.0f),
            Star(40.0f, 20.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(2, 3), Pair(3, 4),
            Pair(5, 2), Pair(2, 6)
        ),
        fact = "fact of Cygnus"
    ),
    Constellation(
        name = "Aquila",
        center = Star(1200.0f, 900.0f),
        stars = listOf(
            Star(0.0f, -30.0f),
            Star(-15.0f, -15.0f),
            Star(15.0f, -15.0f),
            Star(0.0f, 0.0f),
            Star(-5.0f, 20.0f),
            Star(5.0f, 4.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(0, 2),
            Pair(0, 3), Pair(3, 4),
            Pair(4, 5)
        ),
        fact = "fact of Aquila"
    ),
    Constellation(
        name = "Cassiopeia",
        center = Star(1200.0f, 200.0f),
        stars = listOf(
            Star(-50.0f, 20.0f),
            Star(-25.0f, -10.0f),
            Star(0.0f, 10.0f),
            Star(25.0f, -15.0f),
            Star(50.0f, 5.0f),
        ),
        lines = listOf(
            Pair(0, 1),
            Pair(1, 2),
            Pair(2, 3),
            Pair(3, 4),
        ),
        fact = "fact of Cassiopeia"
    ),
    Constellation(
        name = "Ursa Major",
        center = Star(800.0f, 300.0f),
        stars = listOf(
            Star(-50.0f, 20.0f),
            Star(-25.0f, 10.0f),
            Star(-10.0f, -10.0f),
            Star(10.0f, -15.0f),
            Star(40.0f, -30.0f),
            Star(60.0f, -40.0f),
            Star(90.0f, -50.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(0, 3),
            Pair(2, 3), Pair(3, 4),
            Pair(4, 5), Pair(5, 6)
        ),
        fact = "fact of Ursa Major"
    ),
    Constellation(
        name = "Ursa Minor",
        center = Star(1000.0f, 500.0f),
        stars = listOf(
            Star(0.0f, -40.0f),
            Star(10.0f, -20.0f),
            Star(15.0f, 0.0f),
            Star(5.0f, 20.0f),
            Star(-10.0f, 30.0f),
            Star(-25.0f, 15.0f),
            Star(-20.0f, -5.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(2, 3), Pair(3, 4),
            Pair(4, 5), Pair(5, 6),
            Pair(6, 3)
        ),
        fact = "fact of Ursa Minor"
    ),
    Constellation(
        name = "Leo",
        center = Star(400.0f, 900.0f),
        stars = listOf(
            Star(-40.0f, -20.0f),
            Star(-25.0f, -40.0f),
            Star(-5.0f, -50.0f),
            Star(15.0f, -40.0f),
            Star(25.0f, -20.0f),
            Star(20.0f, 10.0f),
            Star(0.0f, 30.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(2, 3), Pair(3, 4),
            Pair(4, 5), Pair(5, 6),
            Pair(0, 5)
        ),
        fact = "fact of Leo"
    ),
    Constellation(
        name = "Scorpius",
        center = Star(1600.0f, 1100.0f),
        stars = listOf(
            Star(-20.0f, -40.0f),
            Star(-10.0f, -20.0f),
            Star(0.0f, 0.0f),
            Star(10.0f, 20.0f),
            Star(20.0f, 40.0f),
            Star(15.0f, 60.0f),
            Star(0.0f, 70.0f),
            Star(-15.0f, 65.0f),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(2, 3), Pair(3, 4),
            Pair(4, 5), Pair(5, 6),
            Pair(6, 7)
        ),
        fact = "fact of Scorpius"
    ),
    Constellation(
        name = "Gemini",
        center = Star(600.0f, 600.0f),
        stars = listOf(
            Star(-25.0f, -30.0f),
            Star(20.0f, -30.0f),
            Star(-28.0f, -5.0f),
            Star(18.0f, -5.0f),
            Star(-32.0f, 20.0f),
            Star(14.0f, 20.0f),
        ),
        lines = listOf(
            Pair(0, 2), Pair(2, 4),
            Pair(1, 3), Pair(3, 5),
            Pair(0, 1), Pair(2, 3)
        ),
        fact = "fact of Gemini"
    ),
)


