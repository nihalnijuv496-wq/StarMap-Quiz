package org.nihal.orbitaltap

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App()
{
    MaterialTheme {
        var gameState = remember { GameState() }
        var screen by remember { mutableStateOf("menu") }

        when(screen)
        {
            "menu" -> MenuScreen(
                onStartGame = {
                    screen = "game"
                    gameState.startGame() },
                onExit = {
                    gameState.resetAll()
                }
            )
            "game" -> GameScreen(
                gameState = gameState,
                onGameOver = {screen = "gameover"},
                onExit = {
                    gameState.resetAll()
                    screen = "menu"
                }
            )
            "gameover" -> GameOverScreen(
                gameState = gameState,
                onRestart = {
                    gameState.resetAll()
                    gameState.startGame()
                    screen = "game"
                },
                onMenuClick = {
                    gameState.resetAll()
                    screen = "menu"
                }
            )
        }
    }
}

