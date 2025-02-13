package com.ralphmarondev.pagey

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.ralphmarondev.pagey.di.initKoin
import io.ktor.client.engine.darwin.Darwin

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin()
    }
){
    App()
}