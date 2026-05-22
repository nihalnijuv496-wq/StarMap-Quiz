package org.nihal.orbitaltap

import androidx.compose.ui.graphics.Color

data class Star(
    val x: Float, val y: Float
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
        center = Star(300f, 400f),
        stars = listOf(
            Star(0f, -50f),  // 0 - Betelgeuse
            Star(40.5f, -44f),  // 1 - Bellatrix
            Star(11.24f, 2.5f),  // 2 - belt left
            Star(20f, 0f),  // 3 - belt middle
            Star(29.8f, -5.57f),  // 4 - belt right
            Star(4.78f, 40.22f),  // 5 - Saiph
            Star(38.49f, 35.02f)  // 6 - Rigel
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
        center = Star(200f, 700f),
        stars = listOf(
            Star(-20f, -10f),  // 0 - Aldebaran
            Star( -5f, -20f),  // 1
            Star( 10f, -25f),  // 2 - tip of horn
            Star(-10f,   5f),  // 3
            Star(  5f,  15f),  // 4 - tip of horn
            Star(-30f,  10f),  // 5
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
        center = Star(1400f, 500f),
        stars = listOf(
            Star(  0f, -40f),  // 0 - Deneb
            Star(  0f, -10f),  // 1
            Star(  0f,  20f),  // 2 - center
            Star(  0f,  50f),  // 3
            Star(  0f,  80f),  // 4 - tail
            Star(-40f,  20f),  // 5 - left wing
            Star( 40f,  20f),  // 6 - right wing
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
        center = Star(1200f, 900f),
        stars = listOf(
            Star(  0f, -30f),  // 0 - Altair
            Star(-15f, -15f),  // 1 - left wing
            Star( 15f, -15f),  // 2 - right wing
            Star(  0f,   0f),  // 3 - body
            Star( -5f,  20f),  // 4
            Star(  5f,  40f),  // 5 - tail
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
        center = Star(1200f, 200f),
        stars = listOf(
            Star(-50f,  20f),
            Star(-25f, -10f),
            Star(  0f,  10f),
            Star( 25f, -15f),
            Star( 50f,   5f),
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
        center = Star(800f, 300f),
        stars = listOf(
            Star(-50f,  20f),  // 0 - Dubhe
            Star(-25f,  10f),  // 1 - Merak
            Star(-10f, -10f),  // 2 - Phecda
            Star( 10f, -15f),  // 3 - Megrez
            Star( 40f, -30f),  // 4 - Alioth
            Star( 60f, -40f),  // 5 - Mizar
            Star( 90f, -50f),  // 6 - Alkaid
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
        center = Star(1000f, 500f),
        stars = listOf(
            Star(  0f, -40f),  // 0 - Polaris
            Star( 10f, -20f),  // 1
            Star( 15f,   0f),  // 2
            Star(  5f,  20f),  // 3
            Star(-10f,  30f),  // 4
            Star(-25f,  15f),  // 5
            Star(-20f,  -5f),  // 6
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
        center = Star(400f, 900f),
        stars = listOf(
            Star(-40f, -20f),  // 0 - Regulus
            Star(-25f, -40f),  // 1
            Star( -5f, -50f),  // 2
            Star( 15f, -40f),  // 3
            Star( 25f, -20f),  // 4
            Star( 20f,  10f),  // 5
            Star(  0f,  30f),  // 6 - Denebola
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
        center = Star(1600f, 1100f),
        stars = listOf(
            Star(-20f, -40f),  // 0 - Antares
            Star(-10f, -20f),  // 1
            Star(  0f,   0f),  // 2
            Star( 10f,  20f),  // 3
            Star( 20f,  40f),  // 4
            Star( 15f,  60f),  // 5
            Star(  0f,  70f),  // 6 - tail
            Star(-15f,  65f),  // 7 - stinger
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
        center = Star(600f, 600f),
        stars = listOf(
            Star(-25f, -30f),  // 0 - Castor head
            Star( 20f, -30f),  // 1 - Pollux head
            Star(-28f,  -5f),  // 2 - Castor body
            Star( 18f,  -5f),  // 3 - Pollux body
            Star(-32f,  20f),  // 4 - Castor feet
            Star( 14f,  20f),  // 5 - Pollux feet
        ),
        lines = listOf(
            Pair(0, 2), Pair(2, 4),
            Pair(1, 3), Pair(3, 5),
            Pair(0, 1), Pair(2, 3)
        ),
        fact = "fact of Gemini"
    ),

)

