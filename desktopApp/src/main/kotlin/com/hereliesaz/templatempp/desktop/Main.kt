package com.hereliesaz.templatempp.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.hereliesaz.templatempp.shared.App

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "HereLiesAz Template") {
        App()
    }
}
