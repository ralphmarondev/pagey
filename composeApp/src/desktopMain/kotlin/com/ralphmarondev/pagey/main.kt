package com.ralphmarondev.pagey

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ralphmarondev.pagey.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Pagey",
        ) {
            App()
        }
    }
}