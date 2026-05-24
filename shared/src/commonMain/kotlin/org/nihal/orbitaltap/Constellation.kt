package org.nihal.orbitaltap

import androidx.compose.ui.graphics.Color

data class Star(
    val x: Double, val y: Double
)

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
        center = Star(300.0, 400.0),
        stars = listOf(
            Star(0.0, -50.0),
            Star(40.5, -44.0),
            Star(11.24, 2.5),
            Star(20.0, 0.0),
            Star(29.8, -5.57),
            Star(4.78, 40.22),
            Star(38.49, 35.02)
        ),
        lines = listOf(
            Pair(0,1),
            Pair(0,2),
            Pair(1, 4),
            Pair(2, 3), Pair(4, 3),
            Pair(2, 5), Pair(4, 6),
            Pair(5, 6)
        ),
        fact = "fact of Orion"
    ),
    Constellation(
        name = "Taurus",
        center = Star(200.0, 700.0),
        stars = listOf(
            Star(-20.0, -10.0),
            Star(-5.0, -20.0),
            Star(10.0, -25.0),
            Star(-10.0, 5.0),
            Star(5.0, 15.0),
            Star(-30.0, 10.0),
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
        center = Star(1400.0, 500.0),
        stars = listOf(
            Star(0.0, -40.0),
            Star(0.0, -10.0),
            Star(0.0, 20.0),
            Star(0.0, 50.0),
            Star(0.0, 80.0),
            Star(-40.0, 20.0),
            Star(40.0, 20.0),
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
        center = Star(1200.0, 900.0),
        stars = listOf(
            Star(0.0, -30.0),
            Star(-15.0, -15.0),
            Star(15.0, -15.0),
            Star(0.0, 0.0),
            Star(-5.0, 20.0),
            Star(5.0, 4.0),
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
        center = Star(1200.0, 200.0),
        stars = listOf(
            Star(-50.0, 20.0),
            Star(-25.0, -10.0),
            Star(0.0, 10.0),
            Star(25.0, -15.0),
            Star(50.0, 5.0),
        ),
        lines = listOf(
            Pair(0,1),
            Pair(1,2),
            Pair(2,3),
            Pair(3, 4),
        ),
        fact = "fact of Cassiopeia"
    ),
    Constellation(
        name = "Ursa Major",
        center = Star(800.0, 300.0),
        stars = listOf(
            Star(-50.0, 20.0),
            Star(-25.0, 10.0),
            Star(-10.0, -10.0),
            Star(10.0, -15.0),
            Star(40.0, -30.0),
            Star(60.0, -40.0),
            Star(90.0, -50.0),
        ),
        lines = listOf(
            Pair(0, 1), Pair(1, 2),
            Pair(0,3),
            Pair(2, 3), Pair(3, 4),
            Pair(4, 5), Pair(5, 6)
        ),
        fact = "fact of Ursa Major"
    ),
    Constellation(
        name = "Ursa Minor",
        center = Star(1000.0, 500.0),
        stars = listOf(
            Star(0.0, -40.0),
            Star(10.0, -20.0),
            Star(15.0, 0.0),
            Star(5.0, 20.0),
            Star(-10.0, 30.0),
            Star(-25.0, 15.0),
            Star(-20.0, -5.0),
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
        center = Star(400.0, 900.0),
        stars = listOf(
            Star(-40.0, -20.0),
            Star(-25.0, -40.0),
            Star(-5.0, -50.0),
            Star(15.0, -40.0),
            Star(25.0, -20.0),
            Star(20.0, 10.0),
            Star(0.0, 30.0),
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
        center = Star(1600.0, 1100.0),
        stars = listOf(
            Star(-20.0, -40.0),
            Star(-10.0, -20.0),
            Star(0.0, 0.0),
            Star(10.0, 20.0),
            Star(20.0, 40.0),
            Star(15.0, 60.0),
            Star(0.0, 70.0),
            Star(-15.0, 65.0),
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
        center = Star(600.0, 600.0),
        stars = listOf(
            Star(-25.0, -30.0),
            Star(20.0, -30.0),
            Star(-28.0, -5.0),
            Star(18.0, -5.0),
            Star(-32.0, 20.0),
            Star(14.0, 20.0),
        ),
        lines = listOf(
            Pair(0, 2), Pair(2, 4),
            Pair(1, 3), Pair(3, 5),
            Pair(0, 1), Pair(2, 3)
        ),
        fact = "fact of Gemini"
    ),
)