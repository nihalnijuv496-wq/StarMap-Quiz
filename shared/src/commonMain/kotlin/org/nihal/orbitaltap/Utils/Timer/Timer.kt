package org.nihal.orbitaltap.Utils.Timer

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlin.math.max

class Timer(var countUntilMillis: Double) {
    var isRunning by mutableStateOf(false)
    var elapsedTimeMillis  by mutableStateOf(0.0)
    val remainingTimeSeconds get() = max(0.0, (countUntilMillis - elapsedTimeMillis) / 1000.0)

    fun startTimer() { isRunning = true }
    fun pauseTimer() { isRunning = false }
    fun resetTimer(newCount: Double) {
        isRunning = false
        elapsedTimeMillis = 0.0
        countUntilMillis = newCount
    }
}